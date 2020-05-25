package com.gtc.strategyPattern.model;

import com.gtc.strategyPattern.model.fly.FlyWithWings;
import com.gtc.strategyPattern.model.quack.Quack;

public class RedheadDuck extends Duck {

    public void display() {
        System.out.println("RedheadDuck display");
    }

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

}
