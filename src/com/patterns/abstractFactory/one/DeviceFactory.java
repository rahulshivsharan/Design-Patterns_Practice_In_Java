/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.one;


public interface DeviceFactory {
    public Player createPlayer();
    public Recorder createRecorder();
    public Media createMedia();
}
