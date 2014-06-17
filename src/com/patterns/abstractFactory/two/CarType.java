/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.two;


public enum CarType {
    
    SMALL("small"), SEDAN("sedan"), LUXURY("luxury");
    
    private String cartype;
    
    CarType(String cartype){
        this.cartype = cartype;
    } 
    
    @Override
    public String toString(){
       return this.cartype;
    }
}
