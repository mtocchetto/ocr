package com.mycompany.ocr;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

    private DateTimeZone timeZone;

    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = {"slow"})
    public void aSlowTest() {
        System.out.println("Slow test");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("SetUp");
    }

}
