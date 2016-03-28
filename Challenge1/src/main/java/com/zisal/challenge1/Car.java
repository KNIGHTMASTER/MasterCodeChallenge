package com.zisal.challenge1;

class Car {
    
    private Engine engine;    
    private double maxSpeed;
    
    public void changeEngine(Engine engine){
        this.engine = engine;
        maxSpeed = engine.getMaxSpeed();
    }
    
    public double getMaxSpeed(){
        return maxSpeed;
    }
}