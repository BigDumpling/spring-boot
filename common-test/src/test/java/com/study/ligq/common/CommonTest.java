package com.study.ligq.common;

import com.study.ligq.common.extend.Main2Template;
import com.study.ligq.common.extend.MainTemplate;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class CommonTest {

    private final static Logger logger = LoggerFactory.getLogger(CommonTest.class);

    @Test
    public void executeTest(){
        MainTemplate mainTemplate = new MainTemplate();
        mainTemplate.execute();

        Main2Template main2Template = new Main2Template();
        main2Template.execute();
    }

}
