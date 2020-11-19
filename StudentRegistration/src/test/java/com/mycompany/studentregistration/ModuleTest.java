package com.mycompany.studentregistration;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lorca
 */
public class ModuleTest {
    //creating instance of module for testing
    private final String name = "Graphics";
    private final String id = "CT417";
    private final Module mod = new Module(name, id);
    
    //Testing getters & setters
    @Test
    public void testAccessorMethods(){
        assertEquals(name, mod.getMName());
        assertEquals(id, mod.getMId());
    }
    
    @Test
    public void testMutatorMethods(){
        mod.setMName(name);
        assertEquals(name, mod.mName);
        mod.setMId(id);
        assertEquals(id, mod.mID);
    }
    
}