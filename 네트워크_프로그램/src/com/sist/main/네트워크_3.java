package com.sist.main;
/*
 *   네트워크 서버
 *   -----------
 *    1. 접속을 받는 클래스 - 접속처리(대기 소켓)
 *    2. 통신을 담당하는 클래스 - 각 클라이언트마다 따로 통신
 *       --------------------------------------------
 *        | 쓰레드 이용
 *          --------- 접속을 받는 클래스의 모든 데이터 공유
 *       class Sever
 *       {
 *          사용자 정보 => ip/port
 *          class Client extends Thread
 *          {
 *             ip/port 이용하여 통신
 *          }
 *       }
 *       
 *       사용자 => client
 *       사용자 => client
 *       
 *      => 서버 동작
 *           bind() => 개통(ip/port)
 *                         ------- ip/port 반드시 고정 
 *           listen() => 대기(접속을 기다림)
 *           accept() => 접속 시 클라이언트 정보 저장
 *                              ------------ AWS
 *           통신 => 통신이 가능하게 연결(Socket)
 *           
 *       서버                클라이언트
 *        |                     |
 *      read()               write()
 *        |                     |
 *      write()               read()
 *      
 *      서버 : SeverSocket : 대기 소켓 => 접속자 관리
 *            ----------- 서버에만 존재
 *      통신 : Socket
 */
public class 네트워크_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
