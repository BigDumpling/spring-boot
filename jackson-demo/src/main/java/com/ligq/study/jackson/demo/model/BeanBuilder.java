package com.ligq.study.jackson.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Data;

@Data
@JsonPOJOBuilder(buildMethodName = "createBean", withPrefix = "construct")
public class BeanBuilder {
    private int idValue;
    private String nameValue;

    public BeanBuilder constructId(int id) {
        idValue = id;
        return this;
    }

    public BeanBuilder constructName(String name) {
        nameValue = name;
        return this;
    }

    public POJOBuilderBean createBean() {
        POJOBuilderBean pojoBuilderBean = new POJOBuilderBean();
        pojoBuilderBean.setIdentity(idValue);
        pojoBuilderBean.setBeanName(nameValue);
        return pojoBuilderBean;
    }
}
