/**
 * @Description
 * @Author Ligq
 * @Date 2021/4/1 3:46 下午
 * @Version V1.0
 */
package com.ligq.study.spring.demo.common;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class PersonModel implements Cloneable{
    private String name;
    private String address;

    public void getObject() throws CloneNotSupportedException {
        this.clone();
    }
}
