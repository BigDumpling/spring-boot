/**
 * @Description
 * @Author Ligq
 * @Date 2021/7/14 3:05 下午
 * @Version V1.0
 */
package com.ligq.study.xstream.model.alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entry {
    private String title;
    private String description;
}
