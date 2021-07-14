/**
 * @Description
 * @Author Ligq
 * @Date 2021/7/14 1:36 下午
 * @Version V1.0
 */
package com.ligq.study.xstream.model.simple;

import lombok.Data;

@Data
public class Person {
    private String firstName;
    private String lastName;
    private PhoneNumber phone;
    private PhoneNumber fax;
}
