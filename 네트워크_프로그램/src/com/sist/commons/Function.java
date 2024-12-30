package com.sist.commons;
// 서버와 클라이언트가 공통 사용
// 내부 프로토콜 : 서버 / 클라이언트의 약속
/*
 *    100 => 로그인  => login.jsp
 *    200 => 방 만들기 => make.jsp
 *    admin|1234|aaaaa => X => send.jsp
 *    100|admin|1234|aaaaa => O
 *    
 *     1. 서버로 요청 => 응답을 받아서 윈도우 출력
 *        ---------
 *        요청 처리      결과 값을 출력
 */
public class Function {
	public static final int LOGIN=100; // 먼저 로그인한 사람 처리
	public static final int MYLOG=110; // 로그인 하는 사람
	public static final int WAITCHAT=200; 
	public static final int END=900; // 남아있는 사람
	public static final int MYEND=910; // 나가는 사람
	// 모든 처리는 서버에서 명령을 하달
	/*
	 *    웹 => Oracle(SQL) => TCP => IP/PORT 
	 *    |       |
	 *    --------- 네트워크 이용 => 서버가 이미 구축
	 *     빅데이터 / 게임 / 모바일 => 네트워크
	 */
}
