package com.it;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testsay(){
        Demo demo = new Demo();
        String s = demo.say("王牌飞行员");
        Assert.assertEquals("hello 王牌飞行员",s);
    }
}
