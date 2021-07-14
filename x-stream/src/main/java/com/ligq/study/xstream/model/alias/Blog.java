/**
 * @Description
 * @Author Ligq
 * @Date 2021/7/14 3:04 下午
 * @Version V1.0
 */
package com.ligq.study.xstream.model.alias;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Blog {
    private Author writer;
    private List<Entry> entries = new ArrayList();

    public Blog(Author writer) {
        this.writer = writer;
    }
}
