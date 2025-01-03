package com.sist.vo;
import java.util.*;

import lombok.Data;
/*
 *  오라클에 존재하는 데이터를 모아서 => 윈도우, 브라우저에 전송할 목적
 *   => 한 명에 대한 데이터를 보유
 *   => 멤버변수는 컬럼명과 동일
 *      ------   -----
 *   => 데이터형 일치
 *      -----------
 *       오라클
 *       문자형
 *         CHAR
 *         VARCHAR2
 *         CLOB ======> String
 *       숫자형
 *         NUMBER(4) ===> 정수
 *         NUMBER(7,2) => 실수
 *         ------------------ int, double
 *       날짜형
 *         DATE ==> java.util.Date
 */
@Data
public class EmpVO {
	private int empno; // 사번 => 유일하게 중복 X
	private String ename;
	private String job;
	private int mgr; // 사수 번호
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
}
