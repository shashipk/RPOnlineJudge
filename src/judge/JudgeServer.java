/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judge;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class JudgeServer 
{

    
    public static void main(String[] args) throws IOException, InterruptedException 
    {
        int i = 0 ;
        
        try
        {
            //System.out.println(i);
            ServerSocket s1 = new ServerSocket(1342);
        
            while( true )
            {
            i++;
            Socket ss = s1.accept();
            ThreadClass t1 = new ThreadClass(ss,i);
            t1.start();
            }
        }
        catch(IOException e)
        {
            System.out.println("Exception in Creating Thread\n");
        }
            
    }
}       
  

