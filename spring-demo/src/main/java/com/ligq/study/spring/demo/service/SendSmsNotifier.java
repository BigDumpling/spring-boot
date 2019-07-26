package com.ligq.study.spring.demo.service;

import com.ligq.study.spring.demo.config.SendSmsEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SendSmsNotifier {

    @EventListener({SendSmsEvent.class})
    public void process(SendSmsEvent event){
        log.info("SendSmsNotifier event == {}", event);
    }
}
