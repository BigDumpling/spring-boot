package com.ligq.study.spring.demo.model;

import lombok.extern.slf4j.Slf4j;

import java.beans.PropertyEditorSupport;

@Slf4j
public class ExoticTypeEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws java.lang.IllegalArgumentException {
        log.info("-----------------ExoticTypeEditor----------------- text == {}", text);
        setValue(new ExoticType(text.toUpperCase()));
    }
}
