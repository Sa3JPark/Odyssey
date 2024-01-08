package com.example.odyssey.Model;

public interface Movement {
    float moveUp(float y, int textHeight);
    float moveDown(float y, int border, int spriteHeight);
    float moveLeft(float x);
    float moveRight(float x, int border, int spriteWidth);
}
