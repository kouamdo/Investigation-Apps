/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info323;

/**
 *
 * @author ledoux
 */
public class process_reingeneering {
    
    public process_reingeneering()
    {
        
        try
        {
            SysCall test = new SysCall("tasklist /V") ;
                
            test.exe();
        }
        
        catch(Exception e)
        {
            System.out.println("") ;
        }
        
    }
    
}
