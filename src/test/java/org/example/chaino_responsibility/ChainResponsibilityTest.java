package org.example.chaino_responsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainResponsibilityTest {

    @Test
    void test() {
        Request request = new Request.RequestBuilder().frequentOk(false).loggedOn(false).build();
        RequestFrequentHandler requestFrequentHandler = new RequestFrequentHandler(new LoggingHandler(null));
        if (requestFrequentHandler.process(request)) {
            System.out.println("正常业务处理");
        } else {
            System.out.println("访问异常");
        }
    }

}