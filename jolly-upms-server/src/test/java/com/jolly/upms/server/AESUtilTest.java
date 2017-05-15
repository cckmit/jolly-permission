package com.jolly.upms.server;

import com.jolly.upms.common.util.AESUtil;
import org.junit.Test;

/**
 * Created by Administrator on 2017/5/8.
 */
public class AESUtilTest {
    @Test
    public void testAESUtil(){
        System.out.println(AESUtil.AESEncode("ted123!@"));
        System.out.println(AESUtil.AESDecode("H0GjdZCmzgwCYtGHQgO54g=="));
    }
}
