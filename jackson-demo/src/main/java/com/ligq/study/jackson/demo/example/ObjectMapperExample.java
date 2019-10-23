package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.ligq.study.jackson.demo.model.Car;
import com.ligq.study.jackson.demo.model.Car2;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
public class ObjectMapperExample {

    public static void main(String[] args) throws JsonProcessingException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        ObjectMapper objectMapper = new ObjectMapper();

        Car car = new Car();
        car.setColor("yello");
        car.setType("renault");
        car.setDatePurchased(new Date());
        car.setDateCreated(new Date());
        car.setLocalDateTime(LocalDateTime.now());
        car.setLocalDateTime2(LocalDateTime.now());
        String carJson = objectMapper.writeValueAsString(car);
        log.info("carJson == {}", carJson);

//        objectMapper.setDateFormat(dateFormat);
//        String carJson2 = objectMapper.writeValueAsString(car);
//        log.info("carJson2 == {}", carJson2);

        objectMapper = objectMapper.registerModule(new JavaTimeModule());
        String carJson3 = objectMapper.writeValueAsString(car);
        log.info("carJson3 == {}", carJson3);

        objectMapper = objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        String carJson4 = objectMapper.writeValueAsString(car);
        log.info("carJson4 == {}", carJson4);

//        String jsonCarArray =
//                "[{ \"color\" : \"Black\", \"type\" : \"BMW\" }, { \"color\" : \"Red\", \"type\" : \"FIAT\" }]";
//        List<Car> listCar = objectMapper.readValue(jsonCarArray, new TypeReference<List<Car>>() {
//        });
//        log.info("listCar == {}", listCar);
//        objectMapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
//        Car[] cars = objectMapper.readValue(jsonCarArray, Car[].class);
//        List<Car> listCar = objectMapper.readValue(jsonCarArray, List.class);
//        log.info("cars == {}", cars);
//        log.info("listCar == {}", listCar);
//
//        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
//        Map<String, Object> map = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
//        });
//        log.info("json == {}", map);
//
//        String extraJson = "{ \"color\" : \"Black\", \"type\" : \"Fiat\", \"year\" : \"1970\" }";
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        Car car1 = objectMapper.readValue(extraJson, Car.class);
//        log.info("car1 == {}", car1);

//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.registerModule(new JavaTimeModule());
//        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//        LocalDateTime localDateTime = LocalDateTime.now();
//        String str = objectMapper.writeValueAsString(localDateTime);
//        log.info("str == {}", str);
//
//        Car2 car2 = new Car2();
//        car2.setCurrent(LocalDateTime.now());
//        car2.setCurrent2(LocalDateTime.now());
//        String str2 = objectMapper.writeValueAsString(car2);
//        log.info("str2 == {}", str2);
//
//        Car car = new Car();
//        car.setColor("yello");
//        car.setType("renault");
//        car.setDatePurchased(new Date());
//        car.setDateCreated(new Date());
//        car.setLocalDateTime(LocalDateTime.now());
//        car.setLocalDateTime2(LocalDateTime.now());
//        String str3 = objectMapper.writeValueAsString(car2);
//        log.info("str3 == {}", str3);
    }
}
