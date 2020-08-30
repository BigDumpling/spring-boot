package com.ligq.study.spring.cloud.demo.example;

import java.util.Objects;

public class DclExample {

    private static DclExample object;
    private static volatile DclExample object2;

    private DclExample(){}

    public static DclExample getInstance(){
        if(Objects.isNull(object)){
            synchronized (DclExample.class){
                if(Objects.isNull(object)){
                    try {
                        Thread.sleep(1000);
                        object = new DclExample();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return object;
    }

    public static DclExample getInstanceVolatile(){
        if(Objects.isNull(object2)){
            object2 = new DclExample();
        }

        return object2;
    }

    public static void main(String[] args){
       for (int i=0;i<100;i++){
           new Thread(() -> {
//                System.out.println(DclExample.getInstance().hashCode());
                System.out.println(DclExample.getInstanceVolatile().hashCode());
           }).start();
       }
    }

}
