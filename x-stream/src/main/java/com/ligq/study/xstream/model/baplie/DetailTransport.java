/**
 * @Description
 * @Author Ligq
 * @Date 2021/7/14 4:43 下午
 * @Version V1.0
 */
package com.ligq.study.xstream.model.baplie;

import lombok.Data;

@Data
public class DetailTransport {
    private Carrier carrier;
    private Vessel vessel;
    private Port loadingPort;
}
