package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;

/**
 * ����ģ��ģ�Ͳ�Ľӿڣ����ڶ��嶩��ģ�͵ķ���
 * 
 * @author ���Գ�
 *
 */
public interface OrdersService {
	/**
	 * ��ѯ���������Ķ�����Ϣ����ҳ���ܣ�
	 * 
	 * @param orsers ��ѯ����
	 * @return �ɹ�����com.github.pagehelper.PageInfo<Orders>���͵�ʵ��
	 */
	public abstract PageInfo<Orders> selectOrders(Orders orders,Integer pageNumber);
	
	/**
	 * �޸�ָ����Ŷ����Ķ���״̬
	 * 
	 * @param orders �޸ĵĶ�����Ϣ
	 * @return �ɹ����ش���0�����������򷵻�С�ڵ���0 ������
	 */
	public abstract Integer updateOrderStatus(Orders orders);
	
	/**
	 * ��ѯָ�����ڵ����۶�
	 * 
	 * @param orders ��ѯ����
	 * @return �ɷ���java.util.List���͵�ʵ�������򷵻�null
	 */
	public abstract List<Orders> selectGroup(Orders orders);
	
}
