/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.two;


public class USACarFactory {

    public static Car build(CarType cartype) throws Exception {
        Car car = null;

        switch (cartype) {
            case SMALL:
                car = new FamilyCar(Location.USA);
                break;

            case LUXURY:
                car = new LuxaryCar(Location.USA);
                break;

            case SEDAN:
                car = new BussinessCar(Location.USA);
                break;

            default:
                throw new Exception(" No Default Car manufactured..... ");

        }

        return car;
    }
}
