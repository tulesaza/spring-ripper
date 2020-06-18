package com.github.tulesaza;

import org.junit.jupiter.api.Test;

class PropertyFileApplicationContextTest {

    @Test
    void test() {
        PropertyFileApplicationContext context = new PropertyFileApplicationContext("context.properties");
        context.getBean(Quoter.class).sayQuote();
    }

}