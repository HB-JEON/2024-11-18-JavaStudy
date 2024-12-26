package com.sist.main;
/*
 * 
 *   DAO => 오라클 / Manager => 파일
 *   -----------------------------
 *    => 예외처리
 *    => 사용자 정의 => VO => 캡슐화
 *    => 멤버변수 / 상수 / static
 *    => 메소드
 *       ----- 리턴형 / 매개변수 
 *             -----   ------- 사용자가 보내준 값
 *              | 결과값
 *                  1) 목록 => List
 *                  2) 상세보기 => VO
 *                  3) 총페이지 => int
 *                  -----------------
 *   컬렉션
 *   ----- IO => 2차(문법, 형식) => DAO(웹)
 *                                ------- JSP / Spring
 *                                
 *    @Transactional                           
 *    public void insert()
 *    {
 *       SQL
 *       SQL
 *    }                            
 *    public void insert()
 *    {
 *       try
 *       {
 *          getConnection()
 *          conn.setAutoCommit(false)
 *          SQL => 입고
 *          SQL => 재고
 *          conn.commit()
 *       }catch(Exception ex)
 *       {
 *          try
 *          {
 *             conn.rollback()
 *          }catch(Exception e) {}
 *       }
 *       finally
 *       {
 *          conn.setAutoCommit(true)
 *          disconnection()
 *       }
 *    }
 *    
 *     => 이력서 - 개인 프로젝트
 *   
 *   컬렉션 Collection
 *    => 배열(고정적) => 데이터 추가 => 새로운 배열
 *       => 동적 배열 => 매번 저장 개수 확인
 *       ------------------------------- 가변
 *    => 많은 데이터 저장
 *    => 표준화 => 개발자 모두 같은 코딩
 *    => 단점 - 모든 데이터를 저장 가능
 *             --------------- 데이터형이 다른 경우 형변환 / 제어문 사용이 어려움
 *              => 데이터가 많으면 많을 수록 불리
 *              => 같은 데이터만 첨부 => 배열
 *                 ---------------
 *                  명시적 => 사용하는 데이터형을 명시(String,integer...)
 *                  ----- 제네릭
 *                  List<String, integer> - 가독성이 뛰어남
 *                   => 저장되는 모든 데이터가 통일 
 *    Collection(CRUD) => 자료 구조
 *      => List
 *          ArrayList - 단순한 목록
 *           ***add() - 추가
 *           remove() - 삭제
 *           set() - 수정
 *           ***get() - 데이터 가져오기
 *           isEmpty() - 값 여부 확인
 *           ***clear() - 전체삭제
 *           ***size() - 저장 개수
 *      => Set
 *          HashSet - 중복이 없는 데이터 (장바구니)
 *           ***add()
 *           ***remove()
 *           isEmpty()
 *           ***clear()
 *           ***size()
 *      => Map
 *          HashMap - 관리(클래스 관리, 회원관리)
 *           put("key","value") - 추가
 *           get(key) - 값 읽기
 *           isEmpty()
 *           clear()
 *           size()
 *           keySet(key) - 저장된 키 전체
 *           values() - 저장된 값 전체
 *      -----------------------------------------
 *       복사 => addAll() - Set / List
 *       교집합 => retainAll()
 *       차집합 => removeAll()
 *      -----------------------------------------
 *       
 *       java.lang
 *         Object / String / StringBuffer
 *         Wrapper / System / Math
 *       java.util
 *         Date / Calendar / StringTokenizer
 *         ArrayList / HashSet / HashMap
 *       java.text
 *         SimpleDateFormat / DecimalFormat
 *       ---------
 *       ***java.io   =>  파일 입출력 => 다운로드 / 업로드
 *       ***java.sql  =>  데이터베이스 입출력
 *       java.net     =>  네트워크 입출력
 *                         => 웹(네트워크) => 한글 변환
 *             
 */
import java.util.*;
public class 컬렉션정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("aaa"); // 0
		list.add(10); // 1
		list.add('A'); // 2
		list.add(120.5); // 3
		list.add(10); // 4
		list.add('A'); // 5
		list.add("aaa"); // 6
		list.add(10); // 7
	}

}
