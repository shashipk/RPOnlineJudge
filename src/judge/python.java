/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Avishek
 */
public class python extends Language
{
    String code ;
    int timeLimit ;
    String dir ;
    int index ;

    python(String code, int i, String absolutePath, int index) 
    {
        this.code = code ;
        this.timeLimit = i ;
        this.dir = absolutePath ;
        this.index = index ;
       
    }

    public String compile()
    {
        try
        {
            PrintWriter writer = new PrintWriter(""+dir+"/code.cpp");
            writer.println(code);
            writer.close();
            System.out.println("Began Compilation.");
            ProcessBuilder p;
            boolean val = true ;
            p = new ProcessBuilder("g++","code.cpp","-o","code");
            p.directory(new File(dir));
            p.redirectErrorStream(true);
            Process pp = p.start();
            InputStream is = pp.getInputStream();
            String temp;
            String ce ="";
            try ( BufferedReader b = new BufferedReader(new InputStreamReader(is)))
            {
                while(( temp = b.readLine() ) != null )
                {
                    val = false ;
                    ce += (temp.trim() + "\n");
                    System.out.println(temp);
                }
                ce += "Santhuuuu\n";
            }
            if(!val)
            {
                is.close();
                return ("Compile Error\n" + ce);
                
            }
            is.close();
            return "Compile Success";
            
        }
        catch(FileNotFoundException e)
        {
            System.out.println("in compile()" + e);
        }
        catch(IOException e)
        {
            System.out.println("in compile()" + e);
            
        }
        return "Compile Error";
    }   
    public String runP()
    {
        System.out.println("Began Running...");
        ProcessBuilder p = new ProcessBuilder("./code");
        p.directory(new File(dir));
        p.redirectErrorStream(true);
        File in = new File("/Users/Avishek/NetBeansProjects/judge/p"+index+"/Input.txt") ;
        File out = new File(dir+"/Output.txt") ;
        p.redirectInput(in) ;
        p.redirectOutput(out) ;
        try
        {
            Process pp = p.start();
            InputStream is = pp.getInputStream();
            BufferedReader b = new BufferedReader(new InputStreamReader(is));
            String temp; 
            if( !pp.waitFor(timeLimit, TimeUnit.MILLISECONDS))
            {
                System.out.println("TLEEEE\n");
                return "TLE" ;
            }
            int ecode = pp.exitValue();
            if(ecode != 0 )
            {
                System.out.println("Runtime Error!!\n");
                return "RE" ;
            } 
            while((temp = b.readLine()) != null )
            {
                System.out.println(temp);
            } 
        }
        catch(IOException e)
        {
            System.out.println("in execute() " + e );
        }
        catch(InterruptedException ex)
        {
            System.out.println("in execute() " + ex );
        }
        return "RUN" ;
    }
    public String check()
    {
        System.out.println("BEGAN CHECKING OUTPUT\n");
        try
        {
            File in = new File("/Users/Avishek/NetBeansProjects/judge/p"+index+"/MyOutput.txt");
            File in1 = new File(dir+"/Output.txt");
            BufferedReader br1 = new BufferedReader(new FileReader(in));
            BufferedReader br2 = new BufferedReader(new FileReader(in1));
            String s="" , t="" , temp ;
            while((temp = br1.readLine()) != null )
            {
                s += temp.trim() + "\n" ;
            }
            while((temp = br2.readLine()) != null )
            {
                t += temp.trim() + "\n" ;
            }
            if( s.equals(t) )
            {
                return "AC" ;
            }
            else
                return "WA" ;
        }
        catch(IOException e)
        {
            System.out.println("in checkOutput() : " +  e);
        }
        return "WA" ;
    }
}
