package com.github.ankurpathak;

import org.junit.Test;

import java.util.List;

import static org.easymock.EasyMock.mock;

public class DemoTest {

    private List<String> list;

    @Test
    public void  doMockTest(){
        list = mock(List.class);
    }
}
