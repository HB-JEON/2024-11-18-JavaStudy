package com.sist;
import java.util.Scanner;
import java.io.*; // 파일, 네트워크 전송 : 읽기/쓰기
// Input/Output > io > 반드시 예외처리
/*
   12장 마지막장
       ------
        | 자바 관련 모든 문법 > 응용
           데이터베이스 - 웹 
           네트워크 - 온라인 게임
           웹 > 쓰레드, 네트워크 > 흐름
                | 면접관련
    
 */
public class 메소드_2 {
	// 전역변수
	static String seoulData; // 자동 초기화 > null
	// 초기화(자동) > 초기화 블록 > 자동 로그인, 쿠키 읽기, 오라클 연결
	static
	{
		try
		{
			FileReader fr=new FileReader("c:\\JavaDev\\seoul_location.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			seoulData=sb.toString();
					fr.close();
		}
		catch(Exception ex){}
	}
	static void menu()
	{
		System.out.println("====== 메뉴 ======");
		System.out.println("1. 명소 목록:");
		System.out.println("2. 명소 상세보기:");
		System.out.println("3. 명소 검색(명소명):");
		System.out.println("4. 명소 검색(주소명):");
		System.out.println("5. 종료");
		System.out.println("=================");
	}
	/*
	   검색
	    > String[] arr=new String[]; > List
	 */
	//                버튼 / 라디오 / 콤보
	static void seoulList(int page)
	{
		String[] seoul=seoulData.split("\n");
		int i=0;
		int j=0;
		int ROWSIZE=20;
		int pagecnt=(page*ROWSIZE)-ROWSIZE;
		for(String s:seoul)
		{
			if(j<20 && i>=pagecnt)
			{
				String[] sl=s.split("\\|");
				System.out.println(sl[0]+"."+sl[1]);
				j++;
			}
			i++;
		}
	}
	static void seoulDetail(int seoulNo)
	{
		String[] seoul=seoulData.split("\n");
		for(String s:seoul)
		{
			String[] info=s.split("\\|");
			if(info[0].equals(String.valueOf(seoulNo)))
			{
				System.out.println("명소명:"+info[1]);
				System.out.println("소개:"+info[2]);
				System.out.println("주소:"+info[3]);
				break;
			}
		}
	}
	static String[] find(int type,String findData)
	{
		// 검색된 갯수 확인
		String[] datas=seoulData.split("\n");
		int count=0;
		for(String seoul:datas)
		{
			String[] sd=seoul.split("\\|");
			String ss="";
			if(type==1)
			{
				ss=sd[1];
			}
			else
			{
				ss=sd[3];
			}
			if(ss.contains(findData))
			{
				
				count++; // 배열의 갯수 확인
			}
		}
		// 배열 크기 확인
		String[] data=new String[count];
		int i=0;
		for(String seoul:datas)
		{
			String[] sd=seoul.split("\\|");
			String ss="";
			if(type==1)
			{
				ss=sd[1];
			}
			else
			{
				ss=sd[3];
			}
			if(ss.contains(findData))
			{
				
				data[i]=sd[1]+"--"+sd[3];
				i++;
			}
		}
		return data;
	}
	
	// 조립 > 사용자 정의 메소드 반드시 호출
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			menu();
			System.out.print("메뉴 선택:");
			int m=scan.nextInt();
			switch(m)
			{
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0); // break 사용 시 switch 만 종료됨, while 종료 X
			case 1:
				// 데이터를 받아서 출력할 것인지? 메소드 안에서 출력할 것인지?
				System.out.println("페이지 입력:");
				int page=scan.nextInt();
				seoulList(page);
				
			case 3: case 4:
				System.out.print("명소(1),주소(2):");
				int type=scan.nextInt();
				System.out.print("검색어 입력:");
				String fd=scan.next();
				String[] ss=find(type,fd);
				for(String s:ss) 
				{
					System.out.println(s);
				}
			case 2:
				System.out.print("명소선택(1~273):");
				int no=scan.nextInt();
				seoulDetail(no);
				break;
			}
		}
	}
	// 시작 > 자동으로 호출되는 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
	}

}
