/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info323;
import java.io.File;
import javax.swing.JFileChooser ;
import javax.swing.filechooser.FileSystemView ;
/**
 *
 * @author ledoux
 */
public class analysis_file {
    
    private String path ;
    
    private String commande ;
    
    public analysis_file()
    {      
        this.commande = "exiftool ";
    }
    
    public void run()
    {   
        try
        {
            JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()) ;
        
        int returnValue = chooser.showOpenDialog(chooser) ;
        
        if (returnValue == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = chooser.getSelectedFile() ;
            
            this.path = selectedFile.getAbsolutePath() ;
        }
            else if (returnValue == JFileChooser.CANCEL_OPTION) System.out.println("Chemin non spécifié") ;

            else ;

            SysCall test = new SysCall(this.commande.concat(this.path)) ;

            test.exe();
        }
        
        catch(Exception e)
        {
           System.out.println(e.getMessage()) ;
           System.out.println("Install exiftool in your path") ;
        } 
    }
    
    public String getPath()
    {
        return this.path;
    }
    
}
