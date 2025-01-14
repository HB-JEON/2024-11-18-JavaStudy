package com.sist.main;
import com.sist.dao.*;
public class EmpUserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpdeptDAO dao=EmpdeptDAO.newIstance();
		dao.sqlExcute();
		System.out.println("==========================================");
		dao.viewExcute();
	}

}
