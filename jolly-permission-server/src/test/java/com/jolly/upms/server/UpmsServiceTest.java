package com.jolly.upms.server;

import com.jolly.upms.dao.model.UpmsSystemExample;
import com.jolly.upms.rpc.api.UpmsSystemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * 单元测试
 * Created by jolly on 2017/2/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:applicationContext.xml",
        "classpath:applicationContext-dubbo-consumer.xml"
})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class UpmsServiceTest {

    @Autowired
    private UpmsSystemService upmsSystemService;

    @Test
    public void index() {
        int count = upmsSystemService.countByExample(new UpmsSystemExample());
        System.out.println(count);
    }

}
