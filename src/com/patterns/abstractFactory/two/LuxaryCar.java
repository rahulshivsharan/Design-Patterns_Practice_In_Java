/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.two;


public class LuxaryCar extends Car{

    public LuxaryCar(Location location){
        super(CarType.LUXURY, location);
    }
    
    @Override
    public void construct() {
        System.out.println(this);
    }
    
}
