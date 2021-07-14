/**
 * @Description
 * @Author Ligq
 * @Date 2021/7/14 3:18 下午
 * @Version V1.0
 */
package com.ligq.study.xstream.convert;

import com.ligq.study.xstream.model.alias.Author;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthorConverter implements SingleValueConverter {
    @Override
    public String toString(Object obj) {
        return ((Author) obj).getName();
    }

    /**
     * 转换为对应的 model 对象
     *
     * @param str
     * @return
     */
    @Override
    public Object fromString(String str) {
        return new Author(str);
    }

    /**
     * 是否可以转换
     *
     * @param type
     * @return
     */
    @Override
    public boolean canConvert(Class type) {
        return type.equals(Author.class);
    }
}
