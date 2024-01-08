package com.example.odyssey.Model;

import com.example.odyssey.R;

public class MediumEnemy extends Enemy {
    public MediumEnemy() {
        this.player.addObserver(this);
        this.sprite = R.drawable.enemy2;
        this.speed = 2;
        this.damage = 20;
        this.enemyX = enemyX;
        this.enemyY = enemyY;
        this.enemyHeight = enemyHeight;
        this.enemyWidth = enemyWidth;
    }
}
