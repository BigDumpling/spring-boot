/**
 * @Description
 * @Author Ligq
 * @Date 2021/7/14 1:37 下午
 * @Version V1.0
 */
package com.ligq.study.xstream.demo;

import com.ligq.study.xstream.convert.AuthorConverter;
import com.ligq.study.xstream.model.alias.Author;
import com.ligq.study.xstream.model.alias.Blog;
import com.ligq.study.xstream.model.alias.Entry;
import com.ligq.study.xstream.model.circular.Cd;
import com.ligq.study.xstream.model.simple.Person;
import com.ligq.study.xstream.model.simple.PhoneNumber;
import com.ligq.study.xstream.model.simple.TypeModel;
import com.thoughtworks.xstream.XStream;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class ModelToXml {

    public static void main(String[] args) {
        // simpleModel();
//        type();
        // circular();
//        aliases();
    }

    private static void simpleModel() {
        Person joe = new Person();
        joe.setFirstName("Joe");
        joe.setLastName("Walnes");
        joe.setPhone(new PhoneNumber(123, "1234-456"));
        joe.setFax(new PhoneNumber(123, "9999-999"));

        XStream xStream = new XStream();
        xStream.alias("person", Person.class);
        xStream.alias("phonenumber", PhoneNumber.class);

        String xml = xStream.toXML(joe);

        log.info("xml == \n{}", xml);

        Person newJoe = (Person) xStream.fromXML(xml);
        log.info("newJoe == {}", newJoe);
    }

    private static void type(){
        TypeModel model = new TypeModel();
        model.setAge(25);
        model.setChildren(null);
        model.setCreateDate(new Date());
        model.setMan(false);
        model.setName("ligq");
        model.setNameChar(new String[]{"l", "i", "g", "q"});
        model.setNameList(Arrays.asList("Li", "Guo", "Qiang"));

        Map<String, String> children = new HashMap<>();
        children.put("age", "25");
        children.put("height", "175");
        model.setChildren(children);

        XStream xStream = new XStream();

        xStream.addImplicitCollection(TypeModel.class, "nameList");
        xStream.addImplicitCollection(TypeModel.class, "nameChar");

        String xml = xStream.toXML(model);
        log.info("xml == \n{}", xml);

    }

    private static void circular() {
        Cd bj = new Cd("basement_jaxx_singles");
        List order = new ArrayList();
        order.add(bj);
        order.add(bj);

        XStream xStream = new XStream();
        xStream.setMode(XStream.ID_REFERENCES);
        xStream.alias("cd", Cd.class);
        String xml = xStream.toXML(order);
        log.info("xml == \n{}", xml);

        List newOrder = (List) xStream.fromXML(xml);
        log.info("newOrder == {}", newOrder);
    }

    private static void aliases() {
        Blog blog = new Blog(new Author("Guilherme"));
        List<Entry> list = new ArrayList<>();
        list.add(new Entry("first", "My First blog entry"));
        list.add(new Entry("tutorial", "Today we have developed"));
        blog.setEntries(list);

        XStream xStream = new XStream();

        /**
         * 类别名
         */
        xStream.alias("blog", Blog.class);
        xStream.alias("entry", Entry.class);

        /**
         * 属性别名
         */
        xStream.aliasField("author", Blog.class, "writer");

        /**
         * 属性别名
         */
        xStream.useAttributeFor(Blog.class, "writer");

        /**
         * 集合，不展示根元素
         */
        xStream.addImplicitCollection(Blog.class, "entries");

        xStream.registerConverter(new AuthorConverter());

        String xml = xStream.toXML(blog);
        log.info("xml == \n{}", xml);

    }
}
