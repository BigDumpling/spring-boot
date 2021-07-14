/**
 * @Description
 * @Author Ligq
 * @Date 2021/7/14 4:03 下午
 * @Version V1.0
 */
package com.ligq.study.xstream.model.simple;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class TypeModel {
    private int age;
    private String name;
    private boolean isMan;
    private List<String> nameList;
    private Map<String, String> student;
    private String[] nameChar;
    private Date createDate;
    private Object children;
}
