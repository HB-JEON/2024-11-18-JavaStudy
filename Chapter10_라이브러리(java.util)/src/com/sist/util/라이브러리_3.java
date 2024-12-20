package com.sist.util;
import java.util.*;
public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="red|yellow|green|pink|magenta|blue|black|cyan";
		StringTokenizer st=new StringTokenizer(color, "|");
		String[] colors=color.split("\\|");
		System.out.println("컬러 갯수 : "+st.countTokens());
		// 초과 시 오류
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
/*
 *           hasMoreToken
 *           ------------
 *            red => st.nextToken() => true
 *           ------------
 *            yellow => st.nextToken() => true
 *           ------------
 *            green => st.nextToken() => true
 *           ------------
 *           ...
 *           ------------
 *            cyan => st.nextToken() => false
 *           ------------
 *            => after last
 *           ------------
 */