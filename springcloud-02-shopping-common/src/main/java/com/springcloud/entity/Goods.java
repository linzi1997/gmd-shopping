package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GOODS表对应的实体类，用于保存表中商品的信息
 * 
 * @author 林子
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements java.io.Serializable{

	private static final long serialVersionUID = -7001059459665709093L;

	/**
	 * 商品编号
	 */
    private Integer goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品价格
     */
    private Double goodsPrice;

    /**
     * 商品折扣价
     */
    private Double goodsDiscount;

    /**
     * 商品状态：0为下架，1为下架
     */
    private Integer goodsStatus;

    /**
     * 商品数量
     */
    private Integer goodsCount;

    /**
     * 是否新品:0为新品，1为非新品
     */
    private Integer goodsIsNew;

    /**
     * 是否热卖:0为是，1为否
     */
    private Integer goodsIsHot;

    /**
     * 商品级别:1——5星
     */
    private Integer goodsLevel;

    /**
     * 商品简介
     */
    private String goodsBrief;

    /**
     * 商品详情
     */
    private String goodsDetails;

    /**
     * 商品图片
     */
    private String goodsPhoto;

    /**
     * 类别2编号
     */
    private Integer class2Id;
    
    /**
     * 类别1编号
     */
    private Integer class1Id;
    
    /**
     * 查询条件：商品价格下限
     */
    private Double goodsPriceMin;
    
    /**
     * 查询条件：商品价格上限
     */
    private Double goodsPriceMax;
    
    /**
     * 查询条件：一级类别
     */
    private Integer class1;
    
    /**
     * 商品销售：用于保存统计分组的结果
     */
    private Integer goodsSum;

    
}