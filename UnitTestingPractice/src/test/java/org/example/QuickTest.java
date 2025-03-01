package org.example;

import org.junit.*;

public class QuickTest {

    @BeforeClass //BeforeAll
    public static void setupDB()
    {
        System.out.println("Before Class DB Connected\n");
    }

    @AfterClass //AfterAll
    public static void teardownDB()
    {
        System.out.println("After Class DB Disconnected\n");
    }

    @Before //Before each
    public void setup()
    {
        System.out.println("Before Test");
    }

    @After //After each
    public void setupClose()
    {
        System.out.println("After Test\n");
    }

    @Test
    public  void test1()
    {
        System.out.println("test1 executed");
    }
    @Test
    public  void test2()
    {
        System.out.println("test2 executed");
    }
}
