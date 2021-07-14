/**
 * @Description
 * @Author Ligq
 * @Date 2021/7/14 1:53 下午
 * @Version V1.0
 */
package com.ligq.study.xstream.model.circular;

import lombok.Data;

@Data
public class Cd {
    private String id;
    private Cd bonusCd;

    public Cd(String id, Cd bonusCd) {
        this.id = id;
        this.bonusCd = bonusCd;
    }

    public Cd(String id) {
        this.id = id;
    }
}
