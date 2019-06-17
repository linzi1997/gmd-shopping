package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLASS2���Ӧ��ʵ���࣬���ڱ������һ�ж���������Ϣ
 * 
 * @author ����
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class2 implements java.io.Serializable{

	private static final long serialVersionUID = 13851492467804786L;

	/**
	 * ���������
	 */
    private Integer class2Id;

    /**
     * �����������
     */
    private String class2Name;

    /**
     * һ�������
     */
    private Integer class1Id;

    /**
     * ��ע
     */
    private String remark;

    public Integer getClass2Id() {
        return class2Id;
    }

    public void setClass2Id(Integer class2Id) {
        this.class2Id = class2Id;
    }

    public String getClass2Name() {
        return class2Name;
    }

    public void setClass2Name(String class2Name) {
        this.class2Name = class2Name;
    }

    public Integer getClass1Id() {
        return class1Id;
    }

    public void setClass1Id(Integer class1Id) {
        this.class1Id = class1Id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}