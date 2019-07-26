package com.ligq.study.spring.demo.config;

import org.springframework.context.ApplicationEvent;

public class SendSmsEvent extends ApplicationEvent {

    private final String mobile;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public SendSmsEvent(Object source, String mobile) {
        super(source);
        this.mobile = mobile;
    }
}
