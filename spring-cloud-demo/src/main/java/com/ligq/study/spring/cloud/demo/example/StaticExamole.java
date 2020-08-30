package com.ligq.study.spring.cloud.demo.example;

public class StaticExamole {

    private volatile boolean flag;


    public void test1(){
        while (!flag){
            System.out.println("test1, flag == " + flag);
        }
    }

    public void refresh(){
        System.out.println("Refresh start");
        this.flag = true;
        System.out.println("Refresh end");
    }

    public static void main(String[] args){

        new Thread(() -> {
            StaticExamole ex1 = new StaticExamole();
            System.out.println("flag == " + ex1.getFlag());
            ex1.test1();
        }).start();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        new Thread(() -> {
            StaticExamole ex1 = new StaticExamole();
            ex1.refresh();
        }).start();
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean getFlag() {
        return flag;
    }
}
