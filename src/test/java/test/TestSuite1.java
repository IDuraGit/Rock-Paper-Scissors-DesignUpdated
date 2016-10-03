/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runners.Suite;

/**
 *
 * @author Isaac
 */
//@RunWith(Suite.class)
//@Suite.SuiteClasses({GameTest.class, ChoiceTest.class, PlayerTest.class, Choice.class})
public class TestSuite1 extends TestCase{
    
   public static TestSuite suite() {
        TestSuite suite = new TestSuite("Test for the Test package");

//        suite.addTestSuite(ChoiceTest.class);
//        suite.addTestSuite(GameTest.class);
//        suite.addTestSuite(PlayerTest.class);
        

        return suite;
    }

    
    
    
}
