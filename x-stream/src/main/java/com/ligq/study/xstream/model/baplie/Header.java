/**
 * @Description
 * @Author Ligq
 * @Date 2021/7/14 4:37 下午
 * @Version V1.0
 */
package com.ligq.study.xstream.model.baplie;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Header {
    @JsonAlias(value = {"messageId", "MessageId"})
    private String messageId;
    private String actionCode;
    private String senderCode;
    private String manifestType;
    private String messageType;
//    private String companyCode;
//    private String branchCode;
//    private String submitterID;
//    private String sendDateTime;
//    private Double version;
}
