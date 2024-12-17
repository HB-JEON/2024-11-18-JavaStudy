package com.sist.client;
// AcrylLookAndFeel // AeroLookAndFeel  
import javax.swing.*;      
//                      상속 => 재사용 => 변경
public class ClientMainFrame extends JFrame{
	MenuForm mf=new MenuForm(); // 포함 클래스 => 있는 그대로 사용
	ControlPanel cp= new ControlPanel();
	// 배치
	public ClientMainFrame()
	{
		setLayout(null); // 사용자 정의 = null > 직접 배치
		mf.setBounds(10, 15, 1410, 50);
		add(mf);
		cp.setBounds(10, 75, 1410, 920);
		add(cp);
		setSize(1440, 1050);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		}catch(Exception ex) {}
		new ClientMainFrame();
		
		
		
	}

}
