package com.sist.manager;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.*;
// 같은 패키지에 존재 => import 사용하지 않음
// 다른 패키지에 존재 => import 사용
// import - 사용자 정의, 라이브러리 클래스 로드
//           import.lang.*; => 자동 추가
public class GenieMusicSystem {
	public MusicVO[] musics=new MusicVO[50];
	public String title="지니 뮤직 Top50";
	// 인스턴스 초기화 블록 => 호출(X), 상속(X)
	{
		// 예외처리 => 파일관련, 테으퉈크 관련, 데이터베이스 관련
		// URL 연결 => 웹 네트워크 => 8장
		/*
		 *  예외 복구
		 *  예외 회피
		 *  예외 임의 처리 => 견고성
		 *  => 가독석
		 *     최적화
		 *     견고성
		 */
		try
		{
			// 정상적으로 수행하는 문장
			// int a=10/0; // => 프로그램 종료
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			Elements singer=doc.select("table.list-wrap a.artist");
			Elements album=doc.select("table.list-wrap a.albumtitle");
			
			for(int i=0;i<50;i++)
			{
				System.out.println(title.get(i).text());
				System.out.println(singer.get(i).text());
				System.out.println(album.get(i).text());
				System.out.println("=================================");
				musics[i]=new MusicVO();
				musics[i].setNo(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
			}
			
		}catch(Exception ex) {}
	}       // 에러 발생 시에 복구 / 에러 출력
			// 에러 건너뛰기
	public MusicVO[] musicAllData()
	{
		return musics;
	}
	public MusicVO[] musicFindData(String fd)
	{
		int count=0;
		for(MusicVO vo:musics)
		{
			if(vo.getTitle().contains(fd))
			{
				count++;
			}
		}
		// 동적 배열 생성 => 가변 Collection
		MusicVO[] music=new MusicVO[count];
		
		// 배열 단점 => 메모리의 수를 고정
		int i=0;
		for(MusicVO vo:musics)
		{
			if(vo.getTitle().contains(fd))
			{
				music[i]=vo;
				// 클래스는 주소값을 대입
				i++;
			}
		}
		return music;
	}
}
