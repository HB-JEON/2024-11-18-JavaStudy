package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
// 화면 변경 
public class ControlPanel extends JPanel{
    HomePenal hp;
    ChatPenal cp;
    FoodGenrePenal fgp;
    FoodFindPenal ffp;
    FoodDetailPenal fdp;
    BoardList bList;
    BoardInsert bInsert;
    BoardDetail bDetail;
    BoardUpdate bUpdate;
    CardLayout card=new CardLayout();
    public ControlPanel()
    {
    	setLayout(card);
    	hp=new HomePenal(this);
    	add("HOME",hp);
    	cp=new ChatPenal(this);
    	add("CHAT",cp);
    	fgp=new FoodGenrePenal(this);
    	add("FOOD",fgp);
    	ffp=new FoodFindPenal(this);
    	add("FIND",ffp);
    	fdp=new FoodDetailPenal(this);
    	add("DETAIL",fdp);
    	// 게시판 
    	bList=new BoardList(this);
    	add("BLIST",bList);
    	bInsert=new BoardInsert(this);
    	add("BINSERT",bInsert);
    	bDetail=new BoardDetail(this);
    	add("BDETAIL",bDetail);
    	bUpdate=new BoardUpdate(this);
    	add("BUPDATE",bUpdate);
    }
    
}