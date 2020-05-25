package com.gtc.strategyPattern.model;

import com.gtc.strategyPattern.model.fly.FlyNoWay;
import com.gtc.strategyPattern.model.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("ModelDuck display");
    }
}
