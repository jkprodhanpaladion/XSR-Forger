/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jkp.xsrf.AnalysisEngine;

/**
 *
 * @author Jayanta Kumar Prodhan
 */
public class HTTPReqRespGear {
    /**
     * This parameter 
     */
    private String requestBody;
    
    public String getRequestBody() {
        return requestBody;
    }
    
    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }
    
    
    public boolean isGETRequest(){
        
        return false;
    }
    
    public boolean isPOSTRequest(){
    
        return false;
    }
    
}
