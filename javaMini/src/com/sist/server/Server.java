package com.sist.server;
import java.util.*;

import com.sist.commons.Function;

import java.net.*;
import java.io.*;
/*
   서버
    => 접속 담당
        => 접속한 클라이언트의 정보 저장
    => 통신 담당 : 각 클라이언트 당 따로 통신
       ------- 쓰레드 이용
       => 저장된 클라이언트의 정보 이용
       => 멤버클래스 (내부 클래스)
     
     class Server
     {
     	Vector waitVc;
     	
     	class Client extends Thread
     	{
     		클래스 간의 공유가 많다 (변수, 메소드)
     		내부 클래스를 이용
     	}
     }
     => 서버 / 빅데이터
 */
public class Server implements Runnable {
	// 클라이언트의 정보 저장
	Vector<Client> waitVc=new Vector<Client>();
	// Vector = 동기화 / ArrayList = 비동기화 => 데이터베이스
	// 접속을 받는다.
	ServerSocket ss;
	// 클라이언트 => 서버 => 연결선(숫자 => PORT)
	final int PORT=3355;
	// port => 0~65535
	// 0~1023 알려진 포트 => 80 : HTTP
	// 23 : FTP, 25: SMTP ...
	// 4000(머드서버) 8080(프록시서버)
	// 1521(오라클), 3306(MySQL) ...
	// 1. 서버 구동
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT); // 핸드폰
			// 자동 => IP 인식
			// 연결 => IP + PORT 매칭(유심) => bind()
			// 대기 => listen()
			// 단점 - 50명만 접근 가능
			// ServerSocket(100, PORT) => 100명 접근 가능
			System.out.println("Server Start...");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	// Thread 메소드 => 동작
	// 접속시마다 처리 
	public void run()
	{
		while(true)
		{
			try
			{
				Socket s=ss.accept(); // 대기 상태
				//       --------- 접속 => 클라이언트가 접속 시에 호출되는 특수 메소드
				// 발신자 정보 => 접속된 클라이언트의 IP / PORT
				//  => 통신을 시작
				Client client=new Client(s);
				client.start();
			}catch (Exception ex) {}
		}
	}
	public static void main(String[] args) {
		// 시작점
		Server server=new Server();
		// 서버 설정 => 서버 구동
		new Thread(server).start(); // 접속처리 => run()
	}
	// 같은 서버에서 같은 포트를 사용 시 한번만 수행 가능
	// 통신 담당 클래스
	class Client extends Thread
	{
		// Client 모든 정보
		String id, name, sex;
		// Client 통신 연결
		Socket s;
		// 송 수신
		// 송신
		OutputStream out;
		// 수신
		BufferedReader in;
		
		public Client(Socket s)
		{
			try
			{
			this.s=s;
			// => 클라이언트 컴퓨터 메모리
			out=s.getOutputStream();
			// 접속한 클라이언트로 요청 처리 값을 보내는 경우에 사용
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			/*
			 클라이언트로부터 요청을 받을 경우 사용
			  => 한글 처리 (2byte) => BufferedReader 사용
			 InputStream (1byte) => 한글 깨짐 => 2byte 변경 후 값 받아오기 => Reader
			 웹 전송 : 1byte / 받는 경우 : 2 byte 변경
			  => Encoding      => Decoding(UTF-8)
			     --------         ---------------
			                       => setCharacterDncoding("UTF-8")
			 %EC%9E%90%EB%B0%94 ==> 자바
			 */
			}catch(Exception ex) {}
		}
		// 통신 => Thread 처리
		public void run() // => start() => run() 호출
		{
			try
			{
				while(true)
				{
					// 사용자가 전송한 메세지 받아오기
					String msg=in.readLine();
					System.out.println("Client=>"+msg);
					// 100|hong|홍길동|남자
					StringTokenizer st=new StringTokenizer(msg, "|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
					// 로그인 요청 시 처리
						case Function.LOGIN:
						{
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							// 1. 전체적으로 로그인 정보를 전송
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
							// 2. 입장 메세지 전송
							messageAll(Function.WAITCHAT+"|[알림]"+name+"님이 입장 하셨습니다.");
							// 3. waitVC 저장
							waitVc.add(this);
							// => 메인 화면으로 이동
							messageTo(Function.MYLOG+"|"+id);
							// 4. 먼저 접속한 사람의 정보 전체를 전송
							for(Client client:waitVc)
							{
								messageTo(Function.LOGIN+"|"+client.id+"|"+client.name+"|"+client.sex);
							}
							// 5. 방 정보 전송
						}
						break;
					}
				}
			}catch(Exception ex) {}
		}
		// => 개인 별로 전송
		// synchronized => 동기화
		//  => async function(여러개 동시 처리) AJAX
		//  => sync function
		public synchronized void messageTo(String msg)
		{
			// 신뢰성이 뛰어난 프로그램 => 안정성 / 속도 느림
			//  => SMTP / FTP
			try
			{
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
		// => 접속자 전체 전송
		public synchronized void messageAll(String msg)
		{
			try
			{
				for(Client client:waitVc)
				{
					client.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
		
	}
	
}
