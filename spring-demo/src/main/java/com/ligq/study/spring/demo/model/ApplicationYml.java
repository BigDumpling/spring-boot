package com.ligq.study.spring.demo.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;

@Slf4j
@Data
public class ApplicationYml {
    private Resource resource;
}
