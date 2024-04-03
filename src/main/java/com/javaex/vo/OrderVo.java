package com.javaex.vo;

import java.util.List;

public class OrderVo {

	// bill 테이블에 등록할 데이터 + sales 테이블에 등록할 데이터를 한번에 받기위한 vo
	
	private BillVo billVo;
	private List<SalesVo> list;
	
	public OrderVo() {

	}
	public OrderVo(BillVo billVo, List<SalesVo> list) {
		this.billVo = billVo;
		this.list = list;
	}
	public BillVo getBillVo() {
		return billVo;
	}
	public void setBillVo(BillVo billVo) {
		this.billVo = billVo;
	}
	public List<SalesVo> getList() {
		return list;
	}
	public void setList(List<SalesVo> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "OrderVo [billVo=" + billVo + ", list=" + list + "]";
	}
	
}
