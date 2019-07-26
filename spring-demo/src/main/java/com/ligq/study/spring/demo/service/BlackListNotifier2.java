package com.ligq.study.spring.demo.service;

import com.ligq.study.spring.demo.config.BlackListEvent;
import com.ligq.study.spring.demo.config.SendSmsEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BlackListNotifier2 {
    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @EventListener
    public void processBlackListEvent(BlackListEvent event){
        log.info("BlackListNotifier2 event == {}", event);
    }

    @EventListener({BlackListEvent.class})
    public SendSmsEvent process(BlackListEvent event){
        log.info("BlackListNotifier2 process == ====  {}", event);

        return new SendSmsEvent(this, "13170017850");
    }
}
