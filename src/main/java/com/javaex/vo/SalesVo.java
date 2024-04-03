package com.javaex.vo;

public class SalesVo {

	// sales 테이블 등록용 vo
	
	private int no;
	private String name;
	private int count;
	private int price;
	private int orderNo;
	
	public SalesVo() {
		
	}

	public SalesVo(int no, String name, int count, int price, int orderNo) {
		this.no = no;
		this.name = name;
		this.count = count;
		this.price = price;
		this.orderNo = orderNo;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	@Override
	public String toString() {
		return "SalesVo [no=" + no + ", name=" + name + ", count=" + count + ", price=" + price + ", orderNo=" + orderNo
				+ "]";
	}

}
