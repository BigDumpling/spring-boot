package com.ligq.study.spring.demo.gson.gson2;

public class A {
    public String a;
    public B b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    class B {
        public String b;

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

        public B() {
        }
    }
}
