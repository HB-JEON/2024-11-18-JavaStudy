package com.sist.movie;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class MovieUserMain {
/*
 *   자바 정리
 *    2장  변수 / 데이터형 
 *    3장  연산자 / 제어문
 *    4장  배열 1차원
 *    5장  객체 / 클래스 / 멤버변수 / 메소드
 *    6장  상속
 *    7장  인터페이스
 *    8장  예외처리 => try / throws
 *    9장  java.lang => Object / String / System / Math / Wrapper
 *   10장  java.util => StringTokenizer / Random / Date / calendar
 *                   => List(ArrayList) / Set(HashSet)
 *                   => Map(HashMpa)
 *   11장  java.io => File / FileInputStream / FileOutputStream
 *                    FileReader / FileWriter
 *                    BufferedReader / BufferedWriter   
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieSystem ms=new MovieSystem();
		try
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			// 키보드 입력 값을 읽어온다
			while(true)
			{
				System.out.println("====== Menu ======");
				System.out.println("1. 영화 목록");
				System.out.println("2. 영화 상세보기");
				System.out.println("3. 영화 검색");
				System.out.println("9. 종료");
				System.out.println("===================");
				System.out.print("메뉴 선택 : ");
				String menu=in.readLine();
				int m=Integer.parseInt(menu);
				// BufferedReader => 값을 읽을 때 문자열로 가지고 온다
				// 필요한 데이터형으로 변환 => Wrapper
				if(m==9)
				{
					System.out.println("프로그램 종료");
					break;
				}
				else if(m==1)
				{
					List<Movie> list=ms.movieListData();
					for(Movie mo:list)
					{
						System.out.println(mo.getMno()+"."
								+mo.getTitle());
					}
				}
				else if(m==2)
				{
					System.out.print("영화 번호 입력(1~1938) : ");
					String mno=in.readLine();
					int mm=Integer.parseInt(mno);
					Movie movie=ms.movieDetailData(mm);
					System.out.println("영화 번호 : "+movie.getMno());
					System.out.println("영화 명 : "+movie.getTitle());
					System.out.println("출연 : "+movie.getActor());
					System.out.println("감독 : "+movie.getDirector());
					System.out.println("등급 : "+movie.getGrade());
					System.out.println("장르 : "+movie.getGenre());
				}
				else if(m==3)
				{
					System.out.println("검색어 입력 : ");
					String fd=in.readLine();
					List<Movie> list=ms.movieFindData(fd);
					System.out.println("검색 결과 : "+list.size()+"건");
					for(Movie mm:list)
					{
						System.out.println(mm.getTitle());
					}
				}
				else
				{
					System.out.println("없는 메뉴 입니다.");
				}
			}
		}catch(Exception ex) {}
	}

}
