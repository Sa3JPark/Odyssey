package com.example.odyssey.Model;

public class HealthPower extends PowerUpDecorator {
    public HealthPower(PowerUp pow) {
        this.pow = pow;
    }

    public PowerUp power() {
        pow.setHealth(1000);
        return pow;
    }
}
