package com.github.tulesaza.screensaver;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;
import java.util.Random;


/**
 * How to refresh prototype in singletone?
 * 1)the worst solution is inject Application Context to ColorFrame and get Color from it. Forget about decouple
 * 2)@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
 * 3)Current solution, abstract class
 */
@Configuration
@ComponentScan(basePackages = "com.github.tulesaza.screensaver")
public class Config {

    @Bean
    @Scope(value = "periodical") //Custom scope
    public Color color() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Bean
    public ColorFrame frame() {
        return new ColorFrame() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
    }
}
