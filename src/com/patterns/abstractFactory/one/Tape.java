/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.one;


public class Tape implements Media {

    private String data = "";

    public void writeOnTape(String data) {
        this.data = data;
    }

    public String readTape() {
        return this.data;
    }
}
