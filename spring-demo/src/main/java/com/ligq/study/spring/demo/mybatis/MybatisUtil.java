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
        CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
        City city = cityMapper.selectPrimary(1);
        log.info("city == {}", city);
    }
}
