/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judge;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Avishek
 */
public class CLangTest {
    
    public CLangTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of compile method, of class CLang.
     */
    @Test
    public void testCompile() {
        System.out.println("compile");
        CLang instance = new CLang("#include<stdio.h>\nint main()\n{\nreturn 0;\n}\n",1,"/Users/Avishek/NetBeansProjects/judge/codes/1",1);
        String expResult = "Compile Success";
        String result = instance.compile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCompile2() {
        System.out.println("compile");
        CLang instance = new CLang("#include<stdio.h>\nint main()\n{\nreturn 0\n}\n",2,"/Users/Avishek/NetBeansProjects/judge/codes/2",1);
        String expResult = "Compile Error\ncode.c:4:9: error: expected ';' after return statement\nreturn 0\n^\n;\n1 error generated.\nSanthuuuu\n";
        String result = instance.compile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}
