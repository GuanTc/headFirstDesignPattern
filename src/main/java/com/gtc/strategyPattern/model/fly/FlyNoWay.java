package com.gtc.strategyPattern.model.fly;

import com.gtc.strategyPattern.model.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyNoWay");
    }
}
