// 빠트린건 밑으로

class Music
{
	int rank;
	String poster;
	String title;
	String singer;
	String album;
	int like;
	int idcrement; // 등폭
	
	String state; // 상태 
}

class Recipe3
{
	String poster,chef,chef_poster,title;
	int star,hit;
}

class FoodCommons
{
	String[] subPoster=new String[7];
	String name, phone,address,type;
	double score;
}
class FoodHouse extends FoodCommons
{
	String poster;
	String theme;
	int like;
}

class Member
{
	String id,pwd,name,email,addr1,addr2,phone;
	String sex,birthday,content;
}

class FoodHouse2
{
	FoodCommons fc=new FoodCommons();
	String parking,time;
	String[] menu;
}

public class 클래스_오답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
