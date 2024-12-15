package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.*;

public class MelonMusicSystem extends GenieMusicSystem {
//	public MusicVO[] musics=new MusicVO[50];
	public String title="멜론 Top50";
	{
		try
		{
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01");
			Elements singer=doc.select("div.wrap_song_info div.rank02");
			Elements album=doc.select("div.wrap_song_info div.rank03");
			
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
	}      
	// musicAllData()
	// musicFindData(String fd)
	// static, 생성자, 초기화 블록 제외 => 추가
	// 차후 상속 보다는 포함 클래스를 더 많이 사용 => 제약이 없음
}

