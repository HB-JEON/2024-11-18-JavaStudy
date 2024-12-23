package com.sist.main;

import lombok.Data;

/*
 *   List
 *   ---- 순서 O / 중복 허용
 *         => 웹 => 중복허용(오라클)
 *   Set => 345 page
 *   ---- 순서 X / 중복 허용 X
 *         => List 중복을 제거
 *            장르 / 회원명
 *            오라클 - DISTINCT
 *                    -------- 명령어
 *     
 *    HashSet / TreeSet
 *    -------   -------
 *     | 저장용   | 검색
 *       웹 채팅
 *       
 *  345 page
 *  --------
 *   Set
 *    1) 저장되는 순서가 없음
 *       ----------------- 출력이 다르게 
 *    2) 중복된 데이터 허용 X
 *    3) HashSet / TreeSet
 *                 ------- 검색 속도가 빠름
 *    4) 주요 메소드
 *        add() - 객체 추가(데이터 추가)
 *        remove() - 삭제 => remove(Object ob)
 *        isEmpty() - 데이터 저장 여부
 *        size() - 데이터 저장 개수
 *        iterator() - 순차적으로 데이터 읽기
 *        clear() - 모든 데이터 삭제
 *    5) List 중복된 데이터를 제거
 *    6) 일반 데이터 => 중복 제거
 *       객체 => 데이터 값이 같은 경우에는 데이터를 제거할 수 없음
 *       
 *       Sawon s1=new Sawon(1, "A",,"A");
 *       Sawon s2=new Sawon(1, "A",,"A");
 *       hashCode() / equals()를 재정의
 */
@Data
// hashCode, equals => 오버라이딩
class Sawon2
{
	private int sabun;
	private String name;
	private String dept;
	
	public Sawon2(int sabun, String name, String dept)
	{
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
		// 지역변수/매개변수 우선 순위
		// => this.은 생략 가능 => 구분자
	}
}
public class 컬렉션_6_Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon2 s1=new Sawon2(1, "홍길동", "개발부");
		Sawon2 s2=new Sawon2(1, "홍길동", "개발부");
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		System.out.println("s1="+s1.hashCode());
		System.out.println("s2="+s2.hashCode());
		
		if(s1.equals(s2))
		{
			System.out.println("같은 사원");
		}
		else
		{
			System.out.println("다른 사원");
		}
	}

}
