/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judge;

/**
 *
 * @author Avishek
 */
public class LanguageFactory 
{
    private final String lang ;
    public LanguageFactory(String s)
    {
        this.lang = s ;
    }
    public Language makeLanguageObject( String code, int i, String absolutePath, int index)
    {
        if( lang.equals("C") )
        {
            return new CLang( code , i * 1000 , absolutePath, index);
        }  
        else if( lang.equals("C++"))
        {
            return new cpp( code , i * 1000 , absolutePath, index);
        }
        else if( lang.equals("JAVA"))
        {
            return new javaa( code , i * 1000 , absolutePath, index);
        }
        else if( lang.equals("PYTHON"))
        {
            return new python( code , i * 1000 , absolutePath, index);
        }
        return null;
    }
}
