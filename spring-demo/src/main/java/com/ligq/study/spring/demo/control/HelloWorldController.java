package com.ligq.study.spring.demo.control;

import com.ligq.study.spring.demo.model.DependsOnExoticType;
import com.ligq.study.spring.demo.model.ExoticType;
import com.ligq.study.spring.demo.model.People;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Slf4j
@RestController
public class HelloWorldController {

    @Value("${process.name}")
    private String processName;
    @Autowired
    private Map<String, PropertyEditorRegistrar> propertyEditorRegistrarMap;

    @GetMapping("/world/{id}")
    public String hello(@PathVariable("id") String id) {
        log.info("processName == {}", processName);
        return "Hello World";
    }

    @GetMapping(name = "/name", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getName() {
        log.info("HelloWorldController,getName");
        return "ligq";
    }

    @PostMapping(value = "/people", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void people(@Valid @RequestBody People people, BindingResult result) {
        log.info("people == {}", people);
        log.info("result == {}", result);
        if (result.hasErrors()) {
            log.error("errors == {}", result.getTarget());
            throw new RuntimeException(result.getFieldError().getField() + ": " + result.getFieldError().getCode());
        }

        log.info("end------------------------");
    }

    @GetMapping(value = "/property", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void property(ExoticType type) {
        log.info("--------HelloWorldController.property()------------, type == {}", type);
        log.info("--------HelloWorldController.property()------------, type.name == {}", type.getName());
        propertyEditorRegistrarMap.forEach((f, m) -> {
            log.info("f == {}", f);
            log.info("m == {}", m);
        });
    }

    @GetMapping(value = "/property2", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void property2(DependsOnExoticType type) {
        log.info("--------HelloWorldController.property2()------------, type == {}", type);
    }
//
//    @InitBinder
//    public void initBinder(WebDataBinder binder){
//        binder.setValidator(new People());
//    }
}
