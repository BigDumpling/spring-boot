package com.ligq.study.spring.demo;

import com.ligq.study.spring.demo.mybatis.City;
import com.ligq.study.spring.demo.mybatis.CityMapper;
import com.ligq.study.spring.demo.mybatis.MybatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
@RunWith(BlockJUnit4ClassRunner.class)
public class MybatisTest {

    @Test
    public void cityTest() {
        SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
        City city = cityMapper.selectPrimary(1);
        log.info("city == {}", city);
    }

    @Test
    public void mybatisSpringTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.ligq.study.spring.demo");
        context.refresh();

        CityMapper cityMapper = (CityMapper) context.getBean("cityMapper");
        City city = cityMapper.selectPrimary(1);
        log.info("city == {}", city);
    }
}
