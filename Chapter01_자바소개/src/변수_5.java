/*
 *  데이터 저장 > 데이터 가공
 *             사용자의 요청에 따라 변경 > 연산처리
 *      
 *    연산자 > 연산자
 *   피연산자 > 대상
 *   ------- 1. 단항연산자
 *               1) ***증강 연산자 (++, --)
 *                     ex) a++, a--
 *               2) ***부정 연산자 (!)
 *               3) ***형변환 연산자 ((데이터형))
 *                     ex) (int)20.5
 *               4) 부호 연산자 (+, -)
 *               5) 반전 연산자 (~) 양수를 음수로 변경 
 *           2. 이항연산자
 *               1) 산술 연산자 (+, -, *, /, %) 5%2 > 1
 *                  ex) a(연산자)+b(피연산자)
 *               2) 비교 연산자 (==, !=, <, >, <=, >=)
 *                   | 좌측 기준
 *               3) 논리 연산자 ( && : 직렬연산자, || : 병렬 연산자)
 *               4) 대입 연산자
 *               5) 복합 대입 연산자 (+=, -=, *=, /=, %=...)
 *           3. 삼항연산자
 *               (조건)?값:값2
 *               ----
 *                true > 값1
 *                false > 값2
 *                
 *                sex=1 || sex=3? "남자":"여자" > 소스 간결
 *                         > 웹 / 게임
 * 
 */
// 41page
/*
 *  증강 연산자 > +1, -1 / a++, a--
 *  
 *  후치 연산자
 *    int a=10;
 *    a++;
 *     =11
 *     
 *    int a=10;
 *    a--;
 *     =9
 *     
 *  전치 연산자
 *   int a=10;
 *   ++a;
 *   
 *   int a=10;
 *   --a;
 *   
 *   int a=10;
 *   int b=a ++; > 다른 연산 수행 후 증가
 *       --- ---
 *        1   2
 *   > b=a
 *   > a++
 *   
 *   int a=10;
 *   int b=++a;
 *         --
 *          1
 *        -  
 *        2
 *   
 *   int a=10;
 *   int b=a++ + a++ + a++; = 33
 *          10    11    12
 *          
 *   int a=10;
 *   int b=a++ + ++a + a++; = 34       
 *          10    12    12
 *          
 *   int a=10;
 *   int b=++a + ++a + a++; = 35
 *           11    12    12     
 *           
 *   int a=10;
 *   int b=a++ + ++a + ++a + a++; = 48
 *          10    12    13    13
 *          
 *   ++a / a++ / a=a+1 / a+=1
 *   ======================== 동일 연산
 *   
 *   
 *   
 *          
 */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		char a='A';
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(+a);
	}

}
