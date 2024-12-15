package com.sist.main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/////////////////////////////
import com.sist.vo.*;
import com.sist.manager.*;
///////////////////////////// Back End
import java.awt.event.*; 
//마우스, 키보드 등의 사건 => 사건 처리 (라이브러리)
//사건 발생 => 사건 정보를 프로그래머로 넘겨준다.
//          --------------- 메소드 구현 X
// 추상클래스 / 인터페이스
//웹에서는 JavaScript 사용

public class MusicFindPanel extends JPanel 
implements ActionListener
{
	JLabel la;
	JButton b1,b2;
	JTable table;
	DefaultTableModel model;
	JTextField tf;
	GenieMusicSystem gm=new GenieMusicSystem();
	public MusicFindPanel()
	{
		setLayout(null);
		tf=new JTextField();
		add(tf);
		la=new JLabel("Music Top 50", JLabel.CENTER);
		la.setFont(new Font("궁서체",getFont().BOLD,35));
		la.setBounds(10, 15, 760, 50);
		add(la);
		
		tf.setBounds(10, 70, 200, 30);
		String[] col={"순위","곡명","가수명","앨범"};
		String[][] row=new String[0][4];
		model=new DefaultTableModel(row, col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10,105,760,400);
		add(js);
		tf.addActionListener(this);

	}
	/*
	 *   Event
	 *     버튼 / 텍스트 엔터 / 메뉴 actionPerformed
	 *   마우스
	 *     mouseClicked, mouseReleansed mousePressed
	 *     mouseEnterd mouseExited
	 *   키보드
	 *     
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tf) // 엔터
		{
			// 입력 데이터 읽기
			String fd=tf.getText();
			if(fd.trim().length()<1)
			{
				// 입력이 안된 상태
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요.");
				tf.requestFocus();
				return;
			}
			musicFind(fd);
		}
	}
	public void musicFind(String fd)
	{
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		MusicVO[] music=gm.musicFindData(fd);
		for(MusicVO vo:music)
		{
			String[] data= {
				String.valueOf(vo.getNo()),
				vo.getTitle(),
				vo.getSinger(),
				vo.getAlbum()
			};
			model.addRow(data);
		}
	}
}
