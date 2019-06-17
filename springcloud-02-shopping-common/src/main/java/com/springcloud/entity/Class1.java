package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLASS1���Ӧ��ʵ���࣬���ڱ������һ��һ��������Ϣ
 * 
 * @author ����
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class1 implements java.io.Serializable{

	private static final long serialVersionUID = -5300706713029666878L;

	/**
	 * һ�������
	 */
    private Integer class1Id;

    /**
     * һ���������
     */
    private String class1Name;

    /**
     * ���
     */
    private Integer class1Num;

    /**
     * ��ע
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