package com.sist.map;
/*
 *   => 중복 데이터 => 목록 => ArrayList
 *       웹 => 검색 데이터 / 전체 데이터 출력
 *       ------------------------------- 데이터를 모아서 브라우저
 *   => 중복 데이터를 생성 => HashSet
 *      -------------------------- 웹 채팅
 *   => 두개를 동시에 저장 (key/value) => HashMap
 *      --------------------------- 방문한 맛집 / 장바구니
 *                                  아이디 저장...
 *   Map (인터페이스) => 349 page
 *   ----
 *                  Map
 *       |------------------------|
 *     HashMap => 비동기        Hashtalbe => 동기      동기 / 비동기 ===> 쓰레드 기반
 *      => 웹 - AJAX / Vue / React
 *     동기 => 한개가 완전히 저장 후 다른 데이터 저장 => 속도 느림
 *     비동기 => 동시에 저장 => 속도 빠름
 *     
 *      특징)         
 *           두개를 동시에 저장
 *           key / value
 *            => key 중복 불가능
 *            => value 중복 가능
 *                예) ("id","admin")
 *            => 주요 사용처
 *                웹 - 90% Map 사용
 *                | 사용자가 보내준 데이터 정보
 *                   HttpServletRequset
 *                    => request.setAttribute("key","value")
 *                        => ?id=admin
 *                  브라우저로 보내는 정보
 *                   HttpServletResponse
 *                    => response.setAttribute("key",Object)
 *                  브라우저에 저장하는 정보
 *                   Cookie
 *                    => new Cookie(key,value)
 *                  서버에 저장하는 정보
 *                   HttpSession
 *                    => sessionsetAttribute("id","hong")
 *            => 스프링
 *                key, 객체 => Factory 패턴
 *                 => 클래스 관리자(생명 주기)
 *            => MyBatis
 *                key, SQL
 *            => 주요 메소드
 *                clear() 전체삭제
 *                get() 데이터 읽기 => get(key)
 *                put() 데이터 저장
 *                isEmpty() 데이터 존재여부 확인
 *                size() 저장 개수
 *                keySet() 키 값 전체를 가져오기
 *                values() 값 전체 가져오기
 */
// 간단한 장바구니
import java.util.*;
public class Map_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data={"사과","배","수박","귤","참외","멜론","바나나"};
		Map<String, Integer> cart=new HashMap<String, Integer>();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("===== 과일 목록 =====");
			System.out.println("1. 사과");
			System.out.println("2. 배");
			System.out.println("3. 수박");
			System.out.println("4. 귤");
			System.out.println("5. 참외");
			System.out.println("6. 멜론");
			System.out.println("7. 바나나");
			System.out.println("9. 종료");
			System.out.println("====================");
			System.out.print("과일 선택 : ");
			int f=scan.nextInt();
			if(f==9)
			{
				break;
			}
			cart.put("f_"+f, f);
			//       ------ key 값은 중복 X 덮어쓰게됨
		}
		// 장바구니 종료
		if(cart.isEmpty())
		{
			System.out.println("장바구니에 과일이 없습니다.");
		}
		else
		{
			System.out.println("과일 구매 총 "+cart.size()+"건");
			for(String key:cart.keySet())
			{
				// keySet => 등록된 모든 키를 읽어온다.
				int value=cart.get(key);
				System.out.println(data[value-1]);
			}
		}
	}

}
