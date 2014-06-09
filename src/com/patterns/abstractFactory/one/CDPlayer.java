/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.one;


public class CDPlayer implements Player{

    private CD cd;
    
    @Override
    public void load(Media m) {
        this.cd = (CD) m;
    }

    @Override
    public void play() {
        System.out.println(this.cd.readDisk());
    }
    
}
