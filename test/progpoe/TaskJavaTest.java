/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package progpoe;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author tyres
 */
public class TaskJavaTest {
    
    public TaskJavaTest() {
    }

    @Test
     public void testCheckTaskDescription() {
        // Test case 1: When the word count is less than or equal to 50
        String task1 = "This is a sample task description.";
        assertFalse(checkTaskDescription(task1));

        // Test case 2: When the word count is greater than 50
        String task2 = "This is a sample task description with more than 50 words. " +
                "This is an additional sentence to make it longer.";
        assertTrue(checkTaskDescription(task2));
    }

    @Test
    public void testCreateTaskID() {
    }

    @Test
    public void testPrintTaskDetails() {
    }

    @Test
    public void testReturnTotalHours() {
    }
    
}
