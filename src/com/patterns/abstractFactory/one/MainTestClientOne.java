/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.one;


public class MainTestClientOne {

    private DeviceFactory technology;

    public void setDeviceFactory(DeviceFactory technology) {
        this.technology = technology;
    }

    public void test(String song) throws Exception {
        Media media = this.technology.createMedia();
        Player player = this.technology.createPlayer();
        Recorder recorder = this.technology.createRecorder();
        
        recorder.load(media);
        recorder.record(song);
        
        player.load(media);
        player.play();
    }

    public static void main(String[] args) {
        try{
            MainTestClientOne test = new MainTestClientOne();
            test.setDeviceFactory(new CDDevicesFactory());
            test.test("They Don't really care about us");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
