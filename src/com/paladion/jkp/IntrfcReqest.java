/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paladion.jkp;

/**
 *
 * @author Jayanta Kumar Prodhan at Paladion Networks
 */
public interface IntrfcReqest {

    /**
     *
     * @return This method returns true if the HTTP Request Method is GET else it will return false.
     */
    abstract public boolean isGETRequest();
    
    /**
     *
     * @return This method returns true if the HTTP Request Method is POST else it will return false.
     */
    abstract public boolean isPOSTRequest();
}
