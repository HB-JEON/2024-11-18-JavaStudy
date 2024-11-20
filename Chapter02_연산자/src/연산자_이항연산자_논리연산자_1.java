/*
 * 
 *    && 앤드 연산자   || 오알 연산자
 *    
 *    (조건) && (조건)              >>> 범위 혹은 기간 안에 있는 경우
 *      |        |                     a>=1 && a<=100      >>> 직렬 연산자
 *       ㅡㅡㅡㅡㅡ     
 *          |
 *        결과 값 > true/false
 *        
 *        
 *    (조건) || (조건)              >>> 범위 밖에 있는 경우
 *      |        |                     a<1 || a>100        >>> 병렬 연산자
 *       ㅡㅡㅡㅡㅡ     
 *          |
 *        결과 값 > true/false    
 *        
 *     조건    &&    조건
 *     ---------------- 
 *     true        true   =  true
 *     ----------------
 *     true       false   =  false
 *     ----------------
 *     false       true   =  false
 *     ----------------
 *     false      false   =  false
 *     
 *     
 *       조건    ||    조건
 *     ---------------- 
 *     true        true   =  true
 *     ----------------
 *     true       false   =  true
 *     ----------------
 *     false       true   =  true
 *     ----------------
 *     false      false   =  false
 *     
 *     int x=10;
 *     int y=9;
 *     
 *     x<y && x==++y   =  false
 *             | 연산처리 X >> 효율적인 연산
 *       x=10
 *       y=9
 *     
 *     && > 앞 조건 > false
 *     
 *     int x=10;
 *     int y=9;
 *     
 *     x<y || x==++y   =  true
 *             | 연산처리 O
 *       x=10
 *       y=10
 *     
 *     || > 앞 조건 > true
 *    
 */
public class 연산자_이항연산자_논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=9;
		
		/*
		 * boolean bCheck= x>y && x==++y;
		// && > true 확인
		// || > false 확인
		System.out.println(bCheck);
		System.out.println(x);
		System.out.println(y);
		*/
		
		boolean bCheck= x<y || x==++y;
		
		System.out.println(bCheck);
		System.out.println(x);
		System.out.println(y);
		
		// && > 예약일, 체크일
		// || > 유효성 검사
		
		/*
		 * 국어, 영어, 수학 > 총점, 평균
		 * >  int kor=입력
		 *    int eng=입력
		 *    int math=입력
		 *    
		 *    int total=kor+eng+math
		 *    double avg=total/3.0
		 *    
		 *  문자열 입력
		 *  > ABKBA
		 *  
		 */
		
   /*
    * page 38 
    *      41 증가 연산자 ++
    *      43 감소 연산자 --
    *      44 비교 연산자 
    *      45 논리 연산자 &&
    *      47 논리 연산자 ||
    * 
    */

		 }



	}

