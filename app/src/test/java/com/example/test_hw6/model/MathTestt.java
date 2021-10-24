package com.example.test_hw6.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public
class MathTestt {

    private MathTest mathTest;

    @Before
    public void setUp(){
        mathTest = new MathTest();
    }

    @Test
    public void testAdd(){
        assertEquals( 10,mathTest.add(5,5  ) );
    }

    @Test
    public void testSubtract(){
        assertEquals( 10, mathTest.subtract( 20,10 ) );
    }

    @Test
    public void testMultiply(){
        assertEquals( 20, mathTest.multiply( 2,10 ) );
    }

    @Test
    public void testDiv(){
        assertEquals( 2, mathTest.div( 4,2 ) );
    }

    @Test
    public void testExponentiation(){
        assertEquals( 14400,mathTest.exponentiation( 120,2 ) );
    }

    @Test
    public void sqrt(){
        assertEquals( 10 ,mathTest.sqrt( 100 ));
    }

    @After
    public void setDown(){
        mathTest = null;
    }

}
