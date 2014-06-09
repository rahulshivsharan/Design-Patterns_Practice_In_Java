/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.one;

/**
 *
 * @author 10605534
 */
public class TapePlayer implements Player{

    private Tape tape;
    
    @Override
    public void load(Media m) {
        this.tape = (Tape) m;
    }

    @Override
    public void play() {        
        if(this.tape == null){
            System.out.println("BLANK TAPE");
        }else{
            System.out.println(this.tape.readTape());
        }
    }
    
}
