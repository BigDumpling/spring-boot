//package com.ligq.study.mybatis.demo.config;
//
//import com.baomidou.mybatisplus.core.toolkit.StringPool;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.InjectionConfig;
//import com.baomidou.mybatisplus.generator.config.*;
//import com.baomidou.mybatisplus.generator.config.po.TableInfo;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CodeGenerator {
//
//    public static void main(String[] args){
//        // 代码生成器
//        AutoGenerator generator = new AutoGenerator();
//
//        // 全剧配置
//        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir") + "/src/main/java";
//        gc.setOutputDir(projectPath);
//        gc.setAuthor("ligq");
//        gc.setOpen(false);
//        generator.setGlobalConfig(gc);
//
//        // 数据源配置
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setUrl("jdbc:mysql://rm-bp149t3or0eb470956o.mysql.rds.aliyuncs.com:3306/edi_dev?useUnicode");
//        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
//        dataSourceConfig.setUsername("saas1");
//        dataSourceConfig.setPassword("olymtech1");
//        generator.setDataSource(dataSourceConfig);
//
//        // 包配置
//        PackageConfig packageConfig = new PackageConfig();
//        packageConfig.setParent("com.ligq.study.mybatis.demo.plus");
//        generator.setPackageInfo(packageConfig);
//
//        // 策略设置
//        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig.setTablePrefix(new String[]{"t_edi_"});
//        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
//        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategyConfig.setInclude(new String[]{"customer"});
//        generator.setStrategy(strategyConfig);
//
//        TemplateConfig templateConfig = new TemplateConfig();
//        generator.setTemplate(templateConfigfig);
//        generator.execute();
//    }
//}
