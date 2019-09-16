package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Window {
    Window() {
        log.info("Window()");
    }

    Window(int marker) {
        log.info("Window({})", marker);
    }
}
