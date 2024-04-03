package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.OrderService;
import com.javaex.util.JsonResult;
import com.javaex.vo.OrderVo;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	// OrderVo로 데이터를 받아서 bill 테이블 등록 + sales 테이블 등록 
	@PostMapping("/at/pays")
	public JsonResult addOrder(@RequestBody OrderVo vo) {
		int orderNo = orderService.exeAddOrder(vo);
		if(orderNo != -1) {
			return JsonResult.success(orderNo); // 등록에 성공하면 주문번호를 데이터에 넣어서 보내준다
		} else {
			return JsonResult.fail("데이터를 불러오지 못했습니다.");
		}
	}


}
