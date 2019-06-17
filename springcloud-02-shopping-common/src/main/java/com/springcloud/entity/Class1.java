package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLASS1表对应的实体类，用于保存表中一行一级类别的信息
 * 
 * @author 林子
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class1 implements java.io.Serializable{

	private static final long serialVersionUID = -5300706713029666878L;

	/**
	 * 一级类别编号
	 */
    private Integer class1Id;

    /**
     * 一级类别名称
     */
    private String class1Name;

    /**
     * 序号
     */
    private Integer class1Num;

    /**
     * 备注
     */
    private String remark;

    public Integer getClass1Id() {
        return class1Id;
    }

    public void setClass1Id(Integer class1Id) {
        this.class1Id = class1Id;
    }

    public String getClass1Name() {
        return class1Name;
    }

    public void setClass1Name(String class1Name) {
        this.class1Name = class1Name;
    }

    public Integer getClass1Num() {
        return class1Num;
    }

    public void setClass1Num(Integer class1Num) {
        this.class1Num = class1Num;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}