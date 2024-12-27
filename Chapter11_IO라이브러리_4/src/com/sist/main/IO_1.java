package com.sist.main;
/*
 *   객체 단위 저장
 *   ------------
 *   네트워크 / 일반 프로그램을 설정
 *   ------
 *    1. 값 형식 데이터
 *        int / float / char... 스택에 저장 직접 접근 가능
 *    2. 참조 데이터 형식
 *        객체 => 주소만 저장 => 실제 데이터는 heap 저장
 *     => 네트워크 전송
 *         값 자체를 저장 후에 전송
 *          => 실제 값을 저장 후에 전송
 *     => 다른 프로그램 - CVS / JSON => 자체에서 값을 저장한 상태
 *     
 *     참조 => 값 - 시리얼 라이즈(직렬화)
 *             => implements Serialize
 *     => 값을 받을 경우에 다시 참조형으로 저장(역직렬화)
 *             => ObjectOutputStream / ObjectInputStram 사용
 *     => 초창기에 많이 사용 => 오라클
 */
import java.util.*;
import java.io.*;
// 객체의 실체 값을 스택 (실제 저장소) => 다른 컴퓨터로 전송
// 직렬화 프로그램 => 빅데이터 분석 => 하둡 => 파이썬(넘파일, 판다스)
//                                       -------------------
// => 지하철 혼잡도, 날씨 예측, 범죄 예측, 자동차 리필
// => data.go.kr 공공 포털을 통해 자료 수집
// => 최종 프로그램 - 스프링 <=> 장고(웹 연결)
// => 채팅 => NodeJS
/*
 *    Heap => 병렬 형식
 *            --------
 *            --------
 *            --------
 *            -------- 객체의 실제 값 저장
 *    Stack =>  직렬
 *             ----------------
 *              |   |   |   |
 *             ----------------
 *             병렬 => 직렬 (직렬화)
 *             직렬 => 병렬 (역직렬화)
 *    
 *            
 */
class Sawon implements Serializable {
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	// 실제 값을 저장
	public Sawon(int sabun, String name, String dept, String job, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	// 디폴트 생성자 => 생성자가 이미 존재 => 자동 생성 X
	public Sawon()
	{
		
	}
	
}
public class IO_1 {
	public static void main(String[] args) {
		List<Sawon>	list=new ArrayList<Sawon>();
		// Obj => 데이터를 모아서 저장 가능
		list.add(new Sawon(1, "홍길동","개발부","사원",3200));
		list.add(new Sawon(2, "심청이","총무부","과장",4200));
		list.add(new Sawon(3, "이순신","영업부","부장",5200));
		list.add(new Sawon(4, "강감찬","자재부","사원",3200));
		list.add(new Sawon(5, "춘향이","기획부","사원",3200));
		ObjectOutputStream oos=null;
		try
		{
			File file=new File("c:\\java_data\\sawon_info.txt");
			if(file.exists()) // 파일이 없다면
			{
				file.createNewFile(); // 파일을 생성해라
			}
			FileOutputStream fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			// 저장 직렬화
			oos.writeObject(list);
			System.out.println("객체 단위 저장 완료");
		}catch(Exception ex)
		{
			ex.printStackTrace(); 
		}
		finally
		{
			try
			{
				oos.close();
			}catch(Exception ex) {}
		}
	}
}
