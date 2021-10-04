package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void mull() {
        Assert.assertEquals(6,Main.mull(2, 3));
        Assert.assertEquals(-3,Main.mull(3,-1));


    }
    @Test
    public void  star(){
        Assert.assertEquals(0,Main.mull(0,5));
    }
}