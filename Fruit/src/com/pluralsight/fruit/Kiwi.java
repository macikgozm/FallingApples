package com.pluralsight.fruit;

/**
 * Created by macik on 9/13/2018.
 */
public class Kiwi implements IFruit {
    @Override
    public String getName() {
        return "Kiwi";
    }

    @Override
    public int getRollMultiplier() {
        return 0;
    }
}
