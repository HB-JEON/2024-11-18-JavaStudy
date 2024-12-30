package com.sist.server;
import java.util.*; // 데이터가 여러개 => StringTokenizer
// 사용자 정보 저장 => Vector(동기화)
import com.sist.commons.*;
import java.io.*; // 송수신
// 전송 => byte 단위 전송 / 수신 => 2byte
//  | OutputStream      /  | BufferedReader
import java.net.*; // 다른 컴퓨터와 연동
// ServerSocket : 접속 담당 / Socket : 클라이언트와 통신ㅅ
public class Server implements Runnable {
	private ServerSocket ss;
	private final int PORT=1212; // 조별 포트를 사용
	private Vector<Client> waitVc=new Vector<Client>();
	// => 1024~65535
	// 초기화
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);
			// bind => IP/PORT 연결 => 유심(개통)
			// listen() => 대기 상태
			/*
			 *   new ServerSocket(int count, int port);
			 *   new ServerSocket(int PORT);
			 *   // 접속 인원이 50까지
			 *   
			 *    웹 : 톰캣(50) XE(50)
			 */
			System.out.println("Server Start...");
		}catch (Exception ex) {}
	}
	// 접속 시에 처리 => 접속자 정보를 저장(IP/PORT)
	// ------ 발신자 IP(전화번호)
	public void run() // 쓰레드
	{
		try
		{
			while(true)
			{
				/* 
				 * 접속 시에만 호출 => 발신자의 정보 (IP/PORT) 
				 * => Socket(IP/PORT)
				 * => 사용자는 PORT => 자동으로 설정
				 * => 어떤 위치든 상관 x
				 */
				Socket s=ss.accept();
				Client client=new Client(s);
				// s => port (윈도우마다 다르다)
				// => 통신 시작 명령
				waitVc.add(client);
				client.start(); // run() 호출

			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();

	}
	// 클라이언트 정보 => 통신(송수신) => 클라이언트마다 따로 작성
	// 내부 클래스 => 다른 클래스의 데이터를 사용
	class Client extends Thread
	{
		// => 한 명만 연결
		// IP/PORT
		Socket s; 
		OutputStream out; // 송신
		BufferedReader in; // 수신
		//초기화
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				// 한 명의 클라이언트 IP
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			}catch(Exception ex) {}
		}
	public void run()
	{
		try
		{
			while(true)
			{
				String msg=in.readLine();
				messageAll(msg);
			}
		}catch (Exception ex) {}
	}
		// 전체적으로 전송 =동기화
		public synchronized void messageAll(String msg)
		{
			try
			{
				for(Client c:waitVc)
				{
					c.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
		// 한 명에게만 전송 => 동기화
		public synchronized void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
	}
}
