package com.gtc.strategyPattern.model;

import com.gtc.strategyPattern.model.fly.FlyNoWay;
import com.gtc.strategyPattern.model.quack.Squack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squack();
    }
}
