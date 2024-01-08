package com.example.odyssey.Model;

public interface Observer {
    public void update(Movement movement, float playerX, float playerY, boolean c);
}
