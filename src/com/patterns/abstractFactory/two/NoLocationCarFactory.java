/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.two;


public class NoLocationCarFactory {

    public static Car build(CarType cartype) throws Exception {
        Car car = null;

        switch (cartype) {
            case SMALL:
                car = new FamilyCar(Location.DEFAULT);
                break;

            case LUXURY:
                car = new LuxaryCar(Location.DEFAULT);
                break;

            case SEDAN:
                car = new BussinessCar(Location.DEFAULT);
                break;

            default:
                throw new Exception(" No Default Car manufactured..... ");

        }

        return car;
    }
}
