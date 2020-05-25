package com.gtc.strategyPattern.model.quack;

import com.gtc.strategyPattern.model.QuackBehavior;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squack");
    }
}
