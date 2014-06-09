/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.one;


public class CDDevicesFactory implements DeviceFactory{

    @Override
    public Player createPlayer() {
        return new CDPlayer();
    }

    @Override
    public Recorder createRecorder() {
        return new CDWriter();
    }

    @Override
    public Media createMedia() {
        return new CD();
    }
    
}
