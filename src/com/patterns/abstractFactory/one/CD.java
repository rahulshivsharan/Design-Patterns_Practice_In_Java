/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.one;


public class CD implements Media{
    private String data="";
    
    public void writeOnDisk(String data){
        this.data = data;
    }
    
    public String readDisk(){
        return this.data;
    }
}
