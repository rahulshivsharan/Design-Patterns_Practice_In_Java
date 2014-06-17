/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.two;


public class CarFactory {

    public static Car buildCar(CarType cartype, Location location) throws Exception {
        Car car = null;

        switch (location) {
            case USA:
                car = USACarFactory.build(cartype);
                break;
            case ASIA:
                car = AsiaCarFactory.build(cartype);
                break;
            case DEFAULT :
                car = NoLocationCarFactory.build(cartype);
                break;
            default :
                    throw new Exception("Car can't be prepared !!!!");
        }

        return car;
    }
}
