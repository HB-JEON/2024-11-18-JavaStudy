/*
 * 
 *  86~96 page 1차원 배열
 *  108 page 알고리즘 > 정렬 알고리즘
 *  정렬
 *   선택 정렬 / 버블 정렬
 *     ASC  /  DESC  > Oracle - Order by
 *     |        | *** 내림차순 *** (웹 사용빈도 높음)
 *     | 올림차순
 *   
 *  선택 정렬 - 한개의 데이터를 선택한 후 기준점으로 변경
 *  
 *       10 30 50 20 40 > 10 20 30 40 50 올림차순
 *                        50 40 30 20 10 내림차순
 *     내림 차순
 *     10  30  50  20  40
 *     --  --
 *     30  10
 *     --      --
 *     50      30
 *     --          --
 *     50          20
 *     --              --
 *     50              40
 *     
 *     1round > for 한번 수행
 *     
 *     50  10  30  20  40
 *     --  --  --
 *     고정  30  10
 *         --      --
 *         30      20
 *         --          --
 *         40          30
 *         
 *     2round
 *     
 *     50  40  10  20  30
 *     ------  --  --
 *       고정   20  10
 *             --      --
 *             30      20
 *    
 *     3round
 *     
 *     50  40  30  10  20
 *     ----------  --  --
 *        고정      20  10
 *        
 *     4round
 *     
 *     50  40  30  20  10
 *     
 *     i  j
 *     1  4
 *     2  3
 *     3  2
 *     4  1  > i+j=5  j=5-i
 *                      arr.length-i
 *                      
 *   앞에서 한개씩 고정                  
 *     
 */
class 배열응용_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		static void sort(int[] arr)
		int[] arr=new int[5];
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		// 정렬
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) // > 오름차순, < 내림차순
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("정렬 후:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	
}
