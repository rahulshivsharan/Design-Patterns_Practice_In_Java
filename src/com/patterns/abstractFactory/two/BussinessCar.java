/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.two;


public class BussinessCar extends Car{
    
    public BussinessCar(Location location){
        super(CarType.SEDAN, location);
    }

    @Override
    public void construct() {
        System.out.println(this);
    }
    
}
