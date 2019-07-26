
package com.ligq.study.spring.demo.config;

import com.ligq.study.spring.demo.control.CommandManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class WebConfig {

    @Bean
    public CommandManager commandManager() {
        return new CommandManager();
    }

    /**
     * MessageSource
     *
     * @return
     */
    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.addBasenames("format", "exceptions");
        return messageSource;
    }

    @Bean
    public CustomPropertyEditorRegistrar customPropertyEditorRegistrar(){
        return new CustomPropertyEditorRegistrar();
    }

    @Bean
    public CustomEditorConfigurer customEditorConfigurer() {
        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
        customEditorConfigurer.setPropertyEditorRegistrars(new CustomPropertyEditorRegistrar[]{customPropertyEditorRegistrar()});
        return customEditorConfigurer;
    }
}
