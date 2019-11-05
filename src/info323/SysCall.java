/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.ProcessBuilder.Redirect;

/**
 *
 * @author ledoux
 */
public class SysCall  {
    private static BufferedReader getOutput(Process p) {
    return new BufferedReader(new InputStreamReader(p.getInputStream()));
}
 
private static BufferedReader getError(Process p) {
    return new BufferedReader(new InputStreamReader(p.getErrorStream()));
}
	private String command;
 
	public String getCommand(){
		return this.command;
	}
 
	public SysCall(String com){
		this.command=com;
	}
 
	//launch command using exec
	public void exe(){
		try {
			String[] commande = {"cmd.exe","/c",this.getCommand()};
                            
                        ProcessBuilder pb = new ProcessBuilder(commande);
                        pb.redirectError(Redirect.INHERIT);
                        pb.redirectOutput(Redirect.INHERIT);
                       
                        Process p = pb.start();
                        p.waitFor() ;                       
                        
                    } catch (IOException e) {
			System.out.println("La commande a échoué\n");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("Echec wait for\n");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
