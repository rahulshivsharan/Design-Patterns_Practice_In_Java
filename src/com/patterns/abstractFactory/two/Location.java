/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.two;


public enum Location {
    DEFAULT("No Location, its Default"), USA("United States of America"), ASIA("South Asia Location");
    
    private String local;
    
    Location(String local){
        this.local = local;
    }
    
    public String toString(){
        return this.local;
    }
}
