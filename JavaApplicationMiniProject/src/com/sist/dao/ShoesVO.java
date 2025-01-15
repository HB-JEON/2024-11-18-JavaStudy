package com.sist.dao;
/*
NO				NUMBER
NAME			VARCHAR2(51 BYTE)
IMAGE			VARCHAR2(4000 BYTE)
SALE_PRICE		NUMBER
PRICE			NUMBER
BRAND			VARCHAR2(2000 BYTE)
D_SIZE			NUMBER
 */
public class ShoesVO {
	private int no, sale_price, price, d_size;
	private String name, image, brand;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getSale_price() {
		return sale_price;
	}
	public void setSale_price(int sale_price) {
		this.sale_price = sale_price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getD_size() {
		return d_size;
	}
	public void setD_size(int d_size) {
		this.d_size = d_size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
