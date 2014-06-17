/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.two;


public class MainTestClass {
    public static void main(String [] args){
        try{
//            System.out.println(CarFactory.buildCar(CarType.SMALL, Location.DEFAULT));
            System.out.println(CarFactory.buildCar(CarType.SEDAN, Location.ASIA));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
