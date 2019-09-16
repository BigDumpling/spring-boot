package com.ligq.study.spring.demo.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class MybatisUtil {

    private final static SqlSessionFactory sqlSessionFactory;

    static {
//        String resource = "D:\\study\\spring-boot\\spring-demo\\src\\main\\resources\\mybatis-config.xml";
//        InputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public static void main(String[] args){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Product product = new Product();
        product.setProductName("运动鞋");
        product.setProductNamePinYin("yundongxie");
        product.setProductType("衣服");
        product.setPurchasePrice(100);
        product.setSalePrice(100);

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        int result = productMapper.insertProduct(product);
        sqlSession.commit();
        log.info("result == {}", result);
    }
}
