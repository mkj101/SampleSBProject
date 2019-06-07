package com.manish.sampleproject1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CustomerServiceTest.class,
        Sampleproject1ApplicationTests.class
})
public class RunAllTests {
    @Test
    public void contextLoads() {
    }
}