package com.ligq.study.spring.demo.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;
import java.io.File;

/**
 * Spring集成mybatis
 * DataSource由mybatis配置文件移植到Spring配置
 * <p>
 * 1. 注入SqlSessionFactoryBean
 * 2. 注入MapperFactoryBean
 */
@Slf4j
@Configuration
public class SpringMybatisConfig {

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/world?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean
    @ConditionalOnBean(value = {DataSource.class})
    public SqlSessionFactoryBean sqlSessionFactory() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

        File file = new File("resource/");
        log.info("files == {}", file.list());

        sqlSessionFactoryBean.setMapperLocations(new ClassPathResource("CityMapper.xml"));
        /**
         * 其它配置项
         */
//        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config-spring.xml"));
        return sqlSessionFactoryBean;
    }

//    @Bean("baseMapper")
////    @ConditionalOnBean(value = {SqlSessionFactoryBean.class})
////    public MapperFactoryBean mapperFactoryBean() throws Exception {
////        MapperFactoryBean mapperFactoryBean = new MapperFactoryBean();
////        mapperFactoryBean.setMapperInterface(CityMapper.class);
////        mapperFactoryBean.setSqlSessionFactory(sqlSessionFactory().getObject());
////        return mapperFactoryBean;
////    }

    @Bean
    @ConditionalOnBean(value = {SqlSessionFactoryBean.class})
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.ligq.study.spring.demo.mybatis");
        return mapperScannerConfigurer;
    }
}
