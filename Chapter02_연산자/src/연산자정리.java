/*
 *  
 *  	데이터 저장 (변수)    >    요청    >    화면 출력
 *                     *** 연산자 / 제어문 ***
 *             
 *                     
 *                     
 *      단항연산자
 *       증강연산자 (++, --  >  1씩 증가, 1씩 감소)
 *        for문에서 사용
 *        
 *       형변환연산자  (실수 > 정수)    
 *        (데이터형)변수|값
 *        크기의 순서  DownCasting <<                >> UpCasting
 *                    강제 형변환                        자동 형변환
 *        byte < short < int < long < float < double
 *                char
 *        변수 > 작은 데이터는 저장 가능
 *        int > long 자동으로 변경
 *        10 > 10L
 *        int a='A'
 *              int 데이터
 *        ** 큰 데이터는 첨부 불가능
 *        int a=10.0 > 오류 발생
 *               | 큰데이터
 *        ** float/double > f/F
 *        ** int/long > l/L
 *        ** 형변환 > 클래스 형변환
 *         
 *       부정연산자 (조건문 / 반복문 > 제어문)
 *        !(boolean만 사용 가능)
 *        ex)true > false
 *           false > true
 *                     
 *      이항연산자
 *       산술연산자 ( + , - , * , / , % )
 *        ** 산술 규칙
 *         1) 같은 데이터 형만 연산이 가능
 *         long + int
 *         > long + long (자동으로 큰 데이터형으로 변경 후 연산)
 *          ex) 10.5 + 10
 *                     10.5 > 10.5+10.0 = 20.5
 *              'A' + 10
 *              '65'
 *              65 + 10 = 75
 *         2) int이하 데이터형을 연산 > 결과값 int
 *            byte / short /char
 *            char + byte = int
 *            char + char = int
 *            short + char + byte = int
 *         3) char는 연산 시 자동으로 정수형으로 변경 후에 처리
 *        ** 연산처리
 *          + : 더하기, 문자 열결합
 *                     5+"5" = "55"
 *                     "5"+5 = "55"
 *          / : 0으로 나눌 수 없다. > 오류 발생
 *              정수/정수 = 정수
 *                5/2   =  2
 *          % : 나머지
 *              부호 ( + , - )
 *              5%2 =  1     좌측 부호
 *             -5%2 = -1     *** 가장 많이 사용되는 연산
 *            -5%-2 = -1     > 합 / 평균
 *             5%-2 =  1     > 웹 프로그램 - 로직이 없음, 흐름
 *             
 *      =================================================== 조건문/반복문 > 결과값 : true/false 
 *       비교연산자
 *        문자열은 비교 불가 / 문자, 숫자, 논리
 *        == 같다
 *        !- 같지 않다
 *        <  작다
 *        >  크다
 *        <= 작거나 같다 : < | ==
 *        >= 크거나 같다 : > | ==
 *        
 *         'A'=='a' = false
 *         65   97
 *        if(부정연산자/비교연산자/논리연산자) > 조건
 *        - 평문
 *        - 조건문 > 필요 시 사용, 불필요 시 건너뛰기
 *        - 반복문 > 게임 > 흐름제어
 *        
 *       논리연산자
 *        && 앤드 연산자
 *         범위에 포함되어 있는 경우(기간)
 *         char a='B'
 *         a>'A' %% a<='Z'
 *         
 *         조건    %%    조건
 *          |            |
 *               결과값 > true/false
 *          %% 조건 두 개가 true일 때만 true > 나머지는 false
 *          *** %% 앞에 조건이 false > 뒤에 조건 처리 X
 *          >> 효율적인 연산
 *                         
 *        ㅣㅣ 오알 연산자
 *        범위 밖에 있는 경우
 *         a<'A' || a>'Z'
 *         
 *         int score;
 *         score<0 || score>100 = 다시 입력
 *         
 *         조건    ||    조건
 *          |            |
 *               결과값 > true/fase
 *          || 조건 중에 한 개 이상의 true가 있으면 true
 *          *** 앞에 조건이 true > 뒤에 조건 처리 X
 *         
 *         
 *       
 *         
 *        
 *        
 *      
 *      대입연산자
 *       
 *      삼항연산자               
 *       > 조건문
 *       > 변수 / 연산자 / 제어문 > 문법 / 형식 / 동작 순서
 *       > 1. 배열 / 2. 메소드 / 3. 객체지향 / 4. JDBC 
 *           
 * 
 */
// 점수 > random > 60 이상 짝수
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 점수
		int score=(int)(Math.random()*101);
		// 0~100
		System.out.println("score:"+score);
		
		boolean bCheck=score>=60 && score%2==0;
		System.out.println("bCheck:"+bCheck);
		
		/*
		 *   score>=90 %% score<95
		 
		
		char sex='W';
		int jumsu87;
		
		bCheck=(sex='W'||jumsu%2==0);
		System.out.println(bCheck);
		*/
		
		
		
		

	}

}
