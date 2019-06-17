package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GOODS���Ӧ��ʵ���࣬���ڱ��������Ʒ����Ϣ
 * 
 * @author ����
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements java.io.Serializable{

	private static final long serialVersionUID = -7001059459665709093L;

	/**
	 * ��Ʒ���
	 */
    private Integer goodsId;

    /**
     * ��Ʒ����
     */
    private String goodsName;

    /**
     * ��Ʒ�۸�
     */
    private Double goodsPrice;

    /**
     * ��Ʒ�ۿۼ�
     */
    private Double goodsDiscount;

    /**
     * ��Ʒ״̬��0Ϊ�¼ܣ�1Ϊ�¼�
     */
    private Integer goodsStatus;

    /**
     * ��Ʒ����
     */
    private Integer goodsCount;

    /**
     * �Ƿ���Ʒ:0Ϊ��Ʒ��1Ϊ����Ʒ
     */
    private Integer goodsIsNew;

    /**
     * �Ƿ�����:0Ϊ�ǣ�1Ϊ��
     */
    private Integer goodsIsHot;

    /**
     * ��Ʒ����:1����5��
     */
    private Integer goodsLevel;

    /**
     * ��Ʒ���
     */
    private String goodsBrief;

    /**
     * ��Ʒ����
     */
    private String goodsDetails;

    /**
     * ��ƷͼƬ
     */
    private String goodsPhoto;

    /**
     * ���2���
     */
    private Integer class2Id;
    
    /**
     * ���1���
     */
    private Integer class1Id;
    
    /**
     * ��ѯ��������Ʒ�۸�����
     */
    private Double goodsPriceMin;
    
    /**
     * ��ѯ��������Ʒ�۸�����
     */
    private Double goodsPriceMax;
    
    /**
     * ��ѯ������һ�����
     */
    private Integer class1;
    
    /**
     * ��Ʒ���ۣ����ڱ���ͳ�Ʒ���Ľ��
     */
    private Integer goodsSum;

    
}