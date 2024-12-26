package com.sist.user;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Commons {
	public static Image getImage(ImageIcon icon,int width,int height)
	{
		Image img=icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return img;
	}
}
