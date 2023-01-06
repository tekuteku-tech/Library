package com.example.demo.library.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleLibraryTest {

    @Autowired
    SampleLibrary target;

    @Test
    void sampleMethodTest() {
        assertEquals("This is sample method.", target.sampleMethod());
    }

}
