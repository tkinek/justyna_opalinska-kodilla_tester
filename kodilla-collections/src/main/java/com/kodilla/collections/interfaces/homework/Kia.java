package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {
    private double speed;
    double increase;
    double decrease;

    public Kia(double speed, double increase, double decrease) {
        this.speed = speed;
        this.increase = increase;
        this.decrease = decrease;

    }

    @Override
    public double getSpeed() {

        speed = speed + (increase * 3) - (decrease * 2);
        return speed;
    }

    @Override
    public double increaseSpeed() {
        return increase;
    }

    @Override
    public double decreaseSpeed() {
        return decrease;
    }
}