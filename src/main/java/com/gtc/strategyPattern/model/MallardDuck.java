package com.gtc.strategyPattern.model;

import com.gtc.strategyPattern.model.fly.FlyWithWings;
import com.gtc.strategyPattern.model.quack.Quack;

public class MallardDuck extends Duck {

    public void display() {
        System.out.println("MallardDuck display");
    }

    public MallardDuck () {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

}
