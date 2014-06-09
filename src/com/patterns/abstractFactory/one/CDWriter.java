/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns.abstractfactory.one;


public class CDWriter implements Recorder{

    private CD cd;
    
    @Override
    public void load(Media m) {
        this.cd = (CD) m;
    }

    @Override
    public void record(String record) {
        if(record == null || record == ""){
            System.out.println(" There is no data to write on CD ");
        }else{
            this.cd.writeOnDisk(record);
        }
    }
    
}
