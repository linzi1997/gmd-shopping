package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.entity.OrderDetail;
import com.springcloud.service.OrderDetailService;
import com.springcloud.vo.ResultValue;

/**
 * 订单明细模块的控制层
 * 
 * @author 王显成
 *
 */
@RestController
@RequestMapping("orderDetail")
public class OrderDetailController {
	
	@Autowired
	private OrderDetailService orderDetailService;
	
	/**
	 * 查询指定订单编号的订单明细信息（分页功能）
	 * 
	 * @param orderId    订单编号
	 * @param pageNumber 页数
	 * @return
	 */
	@RequestMapping(value="/selectByOrderId")
	public ResultValue selectByOrderId(@RequestParam("orderId")Integer orderId,@RequestParam("pageNumber") Integer pageNumber) {
		ResultValue rv = new ResultValue();
		try {
			PageInfo<OrderDetail> pageInfo = this.orderDetailService.selectByOrderId(orderId, pageNumber);
			List<OrderDetail> list = pageInfo.getList();
			if(list!=null && list.size() > 0) {
				rv.setCode(0);
				Map<String,Object> map = new HashMap<>();
				
				map.put("orderDetailList", list);
				
				PageUtils pageUtils = new PageUtils(pageInfo.getPages()*5);
				pageUtils.setPageNumber(pageNumber);
				map.put("pageUtils", pageUtils);
				rv.setDataMap(map);
				return rv;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("订单明细查询失败！！！");
		return rv;
	}
	
}
