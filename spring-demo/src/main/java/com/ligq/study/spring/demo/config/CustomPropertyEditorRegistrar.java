package com.ligq.study.spring.demo.config;

import com.ligq.study.spring.demo.model.ExoticType;
import com.ligq.study.spring.demo.model.ExoticTypeEditor;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {
    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(ExoticType.class, new ExoticTypeEditor());
    }
}
