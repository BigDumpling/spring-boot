/**
 * @Description
 * @Author Ligq
 * @Date 2021/7/14 1:35 下午
 * @Version V1.0
 */
package com.ligq.study.xstream.model.simple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneNumber {
    private int code;
    private String number;
}
