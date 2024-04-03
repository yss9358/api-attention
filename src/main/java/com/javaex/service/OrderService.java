package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.OrderDao;
import com.javaex.vo.BillVo;
import com.javaex.vo.OrderVo;
import com.javaex.vo.SalesVo;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;
	
	// OrderVo로 데이터를 받아서 bill 테이블 등록 + sales 테이블 등록 
	public int exeAddOrder(OrderVo vo) {
		
		//넘겨줄 데이터 주문 번호
		BillVo insertVo = vo.getBillVo();
		int count = orderDao.insertOrder(insertVo); // bill 테이블 등록용 dao 연결
		System.out.println(count);
		int orderNo = vo.getBillVo().getOrderNo();
		
		List<SalesVo> list = vo.getList();
		for(int i=0; i<list.size(); i++) {
			list.get(i).setOrderNo(orderNo);
			orderDao.insertSales(list.get(i)); // sales 테이블에 등록하기 위해 주문번호를 넣고 dao 연결 
		}	
		return orderNo; // 주문번호를 리턴해준다
	}
}
