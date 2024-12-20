package com.sist.util;
import java.text.SimpleDateFormat;
import java.util.*;
/*
 * 
 *   날짜 관련
 *   --------
 *    Date => 기능 X
 *            현재 시스템의 날짜와 시간을 읽어온다
 *            ---------
 *            오라클과 호환
 *         *** java.utill.Date ***
 *             java.sql.Date
 *    Calendar => Date 해당 기능 추가
 *                Date 확장 => 제어가 간단
 *                ---------------------
 *                  메소드 기능이 좋다.
 *                  추상 클래스
 *    => 반드시 동행
 *       SimpleDateFormat => java.text
 *       ----------------
 *        날짜 출력 시에 원하는 형태로 출력
 *        24/12/20 2024-12-20
 *        
 *        년도
 *          yyyy / yy
 *        월
 *          MM / M => 10 / 10
 *                 => 09 /  9
 *        일
 *          dd / d
 *        시간
 *          hh / h
 *        분
 *          mm / m
 *        초
 *          ss/ s
 *        대소문자 주의
 *    
 */
public class 라이브러리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yy/MM/dd hh:mm:ss");
			System.out.println(sdf.format(date));
		}
	}

}
