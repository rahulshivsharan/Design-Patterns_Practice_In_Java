/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.two;


public abstract class Car {
    
    private CarType carType;
    private Location location;
    
    public Car(CarType carType,Location location){
        this.carType = carType;
        this.location = location;
    }
    
    public abstract void construct();

    /**
     * @return the carType
     */
    public CarType getCarType() {
        return carType;
    }

    /**
     * @param carType the carType to set
     */
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    /**
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }
    
    @Override
    public String toString(){
        StringBuffer strb = new StringBuffer();
        strb.append("MODEL ")
                .append(this.carType)
                .append(" WAS MANUFACTURED IN ")
                .append(this.location);
        return strb.toString();
    }
}
