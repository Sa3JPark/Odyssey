package com.example.odyssey.Model;

import com.example.odyssey.R;

public class UltimateEnemy extends Enemy {
    public UltimateEnemy() {
        this.player.addObserver(this);
        this.sprite = R.drawable.enemy4;
        this.speed = 5;
        this.damage = 100;
        this.enemyX = enemyX;
        this.enemyY = enemyY;
        this.enemyHeight = enemyHeight;
        this.enemyWidth = enemyWidth;
    }
}
