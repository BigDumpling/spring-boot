/**
 * @Description
 * @Author Ligq
 * @Date 2021/7/14 4:46 下午
 * @Version V1.0
 */
package com.ligq.study.xstream.model.baplie;

import lombok.Data;

import java.util.Date;

@Data
public class Port {
    private String code;
    private Date date;
    private Date aTADate;
    private Date eTANextPort;
}
