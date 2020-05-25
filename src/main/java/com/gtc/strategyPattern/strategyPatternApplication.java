package com.gtc.strategyPattern;

import com.gtc.strategyPattern.model.Duck;
import com.gtc.strategyPattern.model.MallardDuck;
import com.gtc.strategyPattern.model.ModelDuck;
import com.gtc.strategyPattern.model.fly.FlyRocketPowered;

public class strategyPatternApplication {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();

		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}

}
