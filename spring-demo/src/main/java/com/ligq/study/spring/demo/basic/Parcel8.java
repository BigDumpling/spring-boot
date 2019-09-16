package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            @Override
            public int value(){
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args){
        Parcel8 parcel8 = new Parcel8();
        Wrapping w = parcel8.wrapping(2);
        log.info("value() == {}", w.value());
    }
}
