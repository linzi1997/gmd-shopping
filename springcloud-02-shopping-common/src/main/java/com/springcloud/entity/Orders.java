package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author ����
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements java.io.Serializable {

	private static final long serialVersionUID = 8866263542554679525L;

	/**
	 * �������
	 */
	private Integer orderId;

	/**
	 * ��ǰ�������û���Ϣ
	 */
	private Users user;

	private String userName;
	/**
	 * �ջ�������
	 */
	private String consigneeName;

	/**
	 * �ջ��˵绰
	 */
	private String consigneePhone;

	/**
	 * �ջ��˵�ַ
	 */
	private String consigneeSite;

	/**
	 * �µ�ʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date orderTime;

	/**
	 * �����ܶ�
	 */
	private Double orderAmount;

	/**
	 * ����״̬
	 */
	private Integer orderStatus;
	
	/**
	 * ��ѯ��������������ʼʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date orderDateMin;
	
	/**
	 * ��ѯ��������������ֹʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date orderDateMax;

	/**
	 * ��ѯ��������ʼ������
	 */
	private String startMonth;
	/**
	 * ��ѯ��������ֹ������
	 */
	private String endMonth;
	
	/**
	 * ͳ�ƽ��������
	 */
	private String orderMonth;
	/**
	 * ͳ�ƽ�������۶�
	 */
	private Double orderPrice;
	
}