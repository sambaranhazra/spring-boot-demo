package org.sambaran;

import static org.junit.Assert.assertEquals;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.sambaran.controller.HomeController;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @org.junit.Test
    public void testApp()
    {
        HomeController homeController=new HomeController();
        String result=homeController.home();
        assertEquals(result, "Das boot, reporting for duty!");
    }
}
