/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judge;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Avishek
 */
public class ThreadClass extends Thread
{
    private final Socket ss ;
    private final int i ;
    
    
    public ThreadClass(Socket ss , int i )
    {
        this.ss = ss ;
        this.i = i ;
    }
    
    public void run()
    {
            File f = new File("codes/"+i);
            f.mkdirs();
            String code = "";
            try
            {
                BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
                PrintStream p = new PrintStream(ss.getOutputStream());
                String temp ;
                
                int timelimit = Integer.parseInt(br.readLine());
                int index = Integer.parseInt(br.readLine());
                String lang = br.readLine() ;
                //System.out.println(index);
                temp = br.readLine();
                while( true )
                {
                    if( temp.equals("Santhuuuuu"))
                        break;
                    code += ( temp + "\n" );
                    temp = br.readLine();
                }
                /*temp = br.readLine();
                while(temp != null)
                {
                    code += (temp + "\n") ;
                    temp = br.readLine();
                }*/
                Language l = null ;
                LanguageFactory fact = new LanguageFactory(lang);
                l = fact.makeLanguageObject( code , (timelimit) , f.getAbsolutePath(), index);
                String ans = l.compile() ;
                System.out.println("Reached Here :"+ans);
                if( ans.equals("Compile Success") )
                {
                    ans = l.runP();
                    if( ans.equals("RUN") )
                    {
                        ans = l.check();
                        p.println(ans);
                    }
                    else
                    {
                        p.println(ans);
                    }
                }
                else
                p.println(ans);
                
            }
            catch(IOException | NumberFormatException e)
            {
                System.out.println("Error in Taking the code as input\n");
            }
    }
}