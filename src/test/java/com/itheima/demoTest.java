package com.itheima;

import org.junit.Assert;
import org.junit.Test;

public class demoTest {
    @Test
    public void testSay(){
        demo d = new demo();
        String ret = d.say("maven");
        Assert.assertEquals("Hello maven",ret);
    }
}
