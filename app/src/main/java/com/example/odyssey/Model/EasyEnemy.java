package com.example.odyssey.Model;

import com.example.odyssey.R;

public class EasyEnemy extends Enemy {
    public EasyEnemy() {
        this.player.addObserver(this);
        this.sprite = R.drawable.enemy1;
        this.speed = 1;
        this.damage = 10;
        this.enemyX = enemyX;
        this.enemyY = enemyY;
        this.enemyHeight = enemyHeight;
        this.enemyWidth = enemyWidth;
    }
}
