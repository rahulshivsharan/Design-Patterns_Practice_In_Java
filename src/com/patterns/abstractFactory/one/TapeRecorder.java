/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.one;


public class TapeRecorder implements Recorder{

    private Tape tape;
    
    @Override
    public void load(Media m) {
        this.tape = (Tape) m;
    }

    @Override
    public void record(String record) {
        if(record == null || record == ""){
            System.out.println("No data to record on tape !!!!!!");
        }else{
            this.tape.writeOnTape(record);
        }
    }
    
}
