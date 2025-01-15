package com.sist.dao;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class ShoesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			for(int i=1;i<2;i++)
			{
				Document doc=Jsoup.connect("https://snipershop.co.kr/product/list.html?cate_no=94&page="+i+"").get();
				Elements link=doc.select("div.description p.name");
			}
		}catch(Exception ex) {}

	}

}
