package com.javaex.vo;

public class BillVo {

	// bill 테이블 등록용 vo 
	
	private int orderNo;
	private int userNo;
	private String orderDate;
	private int point;
	private int total;
	
	public BillVo() {
	}
	public BillVo(int userNo, int point, int total) {
		super();
		this.userNo = userNo;
		this.point = point;
		this.total = total;
	}

	public BillVo(int orderNo, int userNo, String orderDate, int point, int total) {
		this.orderNo = orderNo;
		this.userNo = userNo;
		this.orderDate = orderDate;
		this.point = point;
		this.total = total;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "BillVo [orderNo=" + orderNo + ", userNo=" + userNo + ", orderDate=" + orderDate + ", point=" + point
				+ ", total=" + total + "]";
	}
}
