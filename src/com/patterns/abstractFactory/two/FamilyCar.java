/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.two;


public class FamilyCar extends Car{

    public FamilyCar(Location location){
        super(CarType.SMALL, location);
    }
    
    @Override
    public void construct() {
        System.out.println(this);
    }
    
}
