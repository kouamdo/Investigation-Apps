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
public class proof {
    
    private String type_proof ;
   
    public proof(String type)
    {
        this.type_proof = type ;
    }
    
    /*
    Connaitre ceux qui son connectés localement dans notre machine
    */
    public void proof_connect_local()
    {
        if (this.type_proof.contains("local_connect"))
        {
            System.out.println("Qui sont ceux qui sont connectés localement \n") ;
        
            SysCall test = new SysCall("PsLoggedon.exe") ;
                
            test.exe();
        }       
    }
    
    public void proof_file()
    {
        if (this.type_proof.contains("file"))
        {
            System.out.println("Liste des fichier et répertoire ouvert en remoote \n") ;
        
            SysCall test = new SysCall("psfile") ;
                
            test.exe();
        }    
    }
    
    
    
}
