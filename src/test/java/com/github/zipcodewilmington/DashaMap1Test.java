package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap1Test {
    DashaMap map;

    @Before
    public void before() {
        map = new DashaMap();

    }

    @Test
    public void setTest() {
        String key = "key";
        String value = "value";
        long expected = 1;

        map.set(key, value);
        long actual = map.bucketSize("key");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest() {
        String key = "key";
        String value = "value";
        map.set(key, value);
        map.delete(key);
        long expected = 0;
        long actual = map.bucketSize("k");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getTest() {
        String key = "a";
        String expected = "h";
        map.set(key, expected);

        String actual = map.get(expected);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmpty1Test() {
        String e = "hi";
        String key  = "ab";

        map.set(key, e);

        Assert.assertFalse(map.isEmpty());
    }

    @Test
    public void isEmpty2Test() {
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void sizeTest() {
        long expected = 2;
        map.set("c", "d");
        map.set("a", "b");

        long actual = map.size();

        Assert.assertEquals(actual, expected);
    }
}
