package com.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMyClass {

    MyClass myClass;

    @Before
    public void init()
    {
        myClass=new MyClass();
    }

    /**
     * int getGCD(int num1, int num2)
     * 1.num1<0,num2>0
     * 2.num1<0,num2<0
     * 3.num1>0,num2>0
     */
    @Test
    public void testGCD1()
    {
        Assert.assertEquals(3,myClass.getGCD(-3,6));
    }

    @Test
    public void testGCD2()
    {
        Assert.assertEquals(3,myClass.getGCD(-6,-3));
    }

    @Test
    public void testGCD3()
    {
        Assert.assertEquals(1,myClass.getGCD(2,3));
    }

    /**
     * lcm(int num1, int num2)
     * num1>0,num2>0
     */
    @Test
    public void testLcm1()
    {
        Assert.assertEquals(24,myClass.lcm(8,6));
    }

    /**
     * boolean isPrimeNum(int n)
     * 是
     * 不是
     */
    @Test
    public void testPrime1()
    {
        assertTrue(myClass.isPrimeNum(7));
    }

    @Test
    public void testPrime2()
    {
        assertFalse(myClass.isPrimeNum(8));
    }

    /**
     * boolean isLeapYear(int year)
     * 是
     * 不是
     */
    @Test
    public void testLeapYear1()
    {
        assertTrue(myClass.isLeapYear(2000));
    }

    @Test
    public void testLeapYear2()
    {
        assertFalse(myClass.isLeapYear(2001));
    }

    /**
     * boolean containsString(String father,String child)
     * father null
     * child null
     * 包含
     * 不包含
     */
    @Test(expected = NullPointerException.class)
    public void testContains1()
    {
        myClass.containsString(null,"child");
    }

    @Test(expected = NullPointerException.class)
    public void testContains2()
    {
        myClass.containsString("father",null);
    }

    @Test
    public void testContains3()
    {
        assertTrue(myClass.containsString("children","child"));
    }

    @Test
    public void testContains4()
    {
        assertFalse(myClass.containsString("father","child"));
    }

    /**
     * boolean IsPalindrome1(String A)
     * null
     * 是
     * 不是
     */
    @Test(expected = NullPointerException.class)
    public void testPalindrome1()
    {
        myClass.IsPalindrome1(null);
    }

    @Test
    public void testPalindrome2()
    {
        assertTrue(myClass.IsPalindrome1("abcba"));
    }

    @Test
    public void testPalindrome3()
    {
        assertFalse(myClass.IsPalindrome1("abcb"));
    }

    /**
     * String reverseString(String str)
     */
    @Test
    public void testReverse()
    {
        Assert.assertEquals("gnirts",myClass.reverseString("string"));
    }

    /**
     * boolean selfDividing(int n)
     * 是
     * 不是
     */
    @Test
    public void testDivide1()
    {
        assertTrue(myClass.selfDividing(128));
    }

    @Test
    public void testDivide2()
    {
        assertFalse(myClass.selfDividing(129));
    }

    /**
     *int fib(int N)
     * =1
     * >1
     */
    @Test
    public void testFib1()
    {
        Assert.assertEquals(1,myClass.fib(1));
    }

    @Test
    public void testFib2()
    {
        Assert.assertEquals(13,myClass.fib(7));
    }

    /**
     * boolean isHappy(int n)
     * 是
     * 不是
     */
    @Test
    public void testHappy1()
    {
        assertTrue(myClass.isHappy(19));
    }

    @Test
    public void testHappy2()
    {
        assertFalse(myClass.isHappy(21));
    }

    /**
     * String addBinary(String a, String b)
     * 有溢出
     * 无溢出
     */
    @Test
    public void testBinary1()
    {
        Assert.assertEquals("111",myClass.addBinary("110","001"));
    }

    @Test
    public void testBinary2()
    {
        Assert.assertEquals("1011",myClass.addBinary("110","101"));
    }
}
