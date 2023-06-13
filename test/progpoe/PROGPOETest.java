/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package progpoe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test; 
/**
 *
 * @author tyres
 */
public class PROGPOETest 
{
    
    public PROGPOETest() 
    {
        
    }

    @Test
       public void testGetDescription() {
        // Test with a task description that has less than 50 characters
        String shortTask = "Task successfully captured";
        boolean result1 = TaskJava.checkTaskDescription(shortTask);
        assertTrue(result1); // Expecting true
        
        // Test with a task description that has more than 50 characters
        String longTask = "Please enter a task description of less than 50 characters";
        boolean result3 = TaskJava.checkTaskDescription(longTask);
        assertFalse(result3); // Expecting false
    }  
    }
    

