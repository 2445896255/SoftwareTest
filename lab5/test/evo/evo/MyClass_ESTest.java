/*
 * This file was automatically generated by EvoSuite
 * Fri May 29 05:13:52 GMT 2020
 */

package evo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import evo.MyClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MyClass_ESTest extends MyClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.addBinary("1", "1");
      myClass0.reverseString("");
      myClass0.isHappy(0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.reverseString("");
      myClass0.reverseString("kFe:;[~mcan87dfUE%");
      myClass0.isPrimeNum(0);
      myClass0.reverseString("%EUfd78nacm~[;:eFk");
      myClass0.containsString("%EUfd78nacm~[;:eFk", "_`ySx*M:x_nB*m");
      myClass0.getNext(0);
      myClass0.getNext(0);
      myClass0.getGCD(0, 0);
      myClass0.IsPalindrome1("m,9'Szb|N&g9qc@zt 3");
      // Undeclared exception!
      try { 
        myClass0.addBinary("", "kFe:;[~mcan87dfUE%");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.reverseString(">Glw`^i`|pL sP>#P>");
      int int0 = 2;
      myClass0.fib(2);
      myClass0.reverseString("zme>#[* +C}%`=$~");
      // Undeclared exception!
      try { 
        myClass0.addBinary((String) null, "zme>#[* +C}%`=$~");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.reverseString("-3hT6%F kM#!2;02Xj5");
      myClass0.reverseString("");
      myClass0.cal((-5336));
      myClass0.reverseString("");
      myClass0.selfDividing((-5336));
      myClass0.reverseString("xxQ+tTh Ce$i9EfX$");
      myClass0.getGCD((-5336), (-5336));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.reverseString("ox");
      myClass0.reverseString("");
      myClass0.isLeapYear(0);
      myClass0.containsString("xo", "ox");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.reverseString("j");
      myClass0.reverseString("j");
      myClass0.isLeapYear(2288);
      myClass0.selfDividing(2288);
      myClass0.lcm((-2090), (-2090));
      myClass0.getGCD((-2090), 2288);
      myClass0.IsPalindrome1("j");
      // Undeclared exception!
      try { 
        myClass0.addBinary("", "j");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.fib((-1680));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.fib(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.isHappy(10);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.reverseString("");
      // Undeclared exception!
      try { 
        myClass0.lcm(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("evo.MyClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.lcm(0, 400);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.isLeapYear(549);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.reverseString("");
      myClass0.isPrimeNum(4007);
      myClass0.containsString("o`c9J~P3", "AYph>\"!15k]QTdMZA&");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      String string0 = "";
      myClass0.reverseString("");
      myClass0.reverseString("");
      myClass0.reverseString("O&WE7L#,r\".L|");
      myClass0.reverseString("");
      int int0 = (-720);
      myClass0.lcm((-720), (-720));
      myClass0.getGCD((-720), (-720));
      myClass0.isLeapYear(720);
      myClass0.reverseString("P>");
      myClass0.reverseString("O&WE7L#,r\".L|");
      String string1 = "3w#~jBxC*Ma";
      String string2 = "";
      // Undeclared exception!
      try { 
        myClass0.reverseString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("evo.MyClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      // Undeclared exception!
      try { 
        myClass0.containsString((String) null, "6U");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("evo.MyClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      String string0 = "";
      myClass0.reverseString("");
      myClass0.reverseString("");
      myClass0.reverseString("WinB4IC");
      myClass0.reverseString("CI4BniW");
      myClass0.reverseString("WinB4IC");
      myClass0.IsPalindrome1("WinB4IC");
      myClass0.reverseString("");
      myClass0.IsPalindrome1("Wbj");
      myClass0.containsString("CI4BniW", "WinB4IC");
      myClass0.containsString("", "WinB4IC");
      int int0 = (-3288);
      myClass0.isHappy((-3288));
      // Undeclared exception!
      try { 
        myClass0.IsPalindrome1((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("evo.MyClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      String string0 = myClass0.reverseString("jj-a:,");
      assertNotNull(string0);
      assertEquals(",:a-jj", string0);
      
      boolean boolean0 = myClass0.isHappy(2695);
      assertFalse(boolean0);
      
      boolean boolean1 = myClass0.IsPalindrome1(",:a-jj");
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      boolean boolean2 = myClass0.isHappy(2695);
      assertTrue(boolean2 == boolean0);
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2);
      
      int int0 = myClass0.getNext(0);
      assertEquals(0, int0);
      
      // Undeclared exception!
      myClass0.fib(30);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      String string0 = myClass0.reverseString("{(')Ok7,g");
      assertNotNull(string0);
      assertEquals("g,7kO)'({", string0);
      
      String string1 = myClass0.reverseString("CqQn-X?!g'");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("'g!?X-nQqC", string1);
      
      String string2 = myClass0.reverseString("{(')Ok7,g");
      assertTrue(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      assertEquals("g,7kO)'({", string2);
      
      int int0 = 58;
      boolean boolean0 = myClass0.isPrimeNum(58);
      assertFalse(boolean0);
      
      String string3 = "0W#W_U";
      String string4 = myClass0.reverseString("0W#W_U");
      assertFalse(string4.equals((Object)string0));
      assertFalse(string4.equals((Object)string1));
      assertFalse(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string2));
      assertNotNull(string4);
      assertEquals("U_W#W0", string4);
      
      boolean boolean1 = myClass0.IsPalindrome1(".kY*&Jl6)%");
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      boolean boolean2 = myClass0.IsPalindrome1(",:a-jj");
      assertTrue(boolean2 == boolean0);
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2);
      
      boolean boolean3 = myClass0.IsPalindrome1("AL:D05\"<c1A");
      assertTrue(boolean3 == boolean2);
      assertTrue(boolean3 == boolean0);
      assertTrue(boolean3 == boolean1);
      assertFalse(boolean3);
      
      // Undeclared exception!
      try { 
        myClass0.addBinary("4,v@>*G8$@A", "g,7kO)'({");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"4,v@>*G8$@A\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      int int0 = myClass0.getGCD(965, 965);
      assertEquals(965, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      String string0 = myClass0.reverseString("N]j;;w( Wz7`pTF:");
      assertNotNull(string0);
      assertEquals(":FTp`7zW (w;;j]N", string0);
      
      // Undeclared exception!
      myClass0.fib(48);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      // Undeclared exception!
      try { 
        myClass0.addBinary("AN ", "AN ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"AN \"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      String string0 = myClass0.reverseString("++5rQNQQ");
      assertNotNull(string0);
      assertEquals("QQNQr5++", string0);
      
      boolean boolean0 = myClass0.isLeapYear(621);
      assertFalse(boolean0);
      
      boolean boolean1 = myClass0.IsPalindrome1("v]tDsCs");
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      String string1 = myClass0.reverseString("v]tDsCs");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("sCsDt]v", string1);
      
      String string2 = myClass0.reverseString("");
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertNotNull(string2);
      assertEquals("", string2);
      
      boolean boolean2 = myClass0.containsString("", "v]tDsCs");
      assertTrue(boolean2 == boolean0);
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2);
      
      String string3 = myClass0.reverseString("(^,DcoOZOcop hFs");
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string2));
      assertNotNull(string3);
      assertEquals("sFh pocOZOocD,^(", string3);
      
      String string4 = myClass0.reverseString("9E.VXYW`h\"WoW");
      assertFalse(string4.equals((Object)string1));
      assertFalse(string4.equals((Object)string0));
      assertFalse(string4.equals((Object)string2));
      assertFalse(string4.equals((Object)string3));
      assertNotNull(string4);
      assertEquals("WoW\"h`WYXV.E9", string4);
      
      String string5 = myClass0.reverseString("");
      assertFalse(string5.equals((Object)string4));
      assertTrue(string5.equals((Object)string2));
      assertFalse(string5.equals((Object)string1));
      assertFalse(string5.equals((Object)string0));
      assertFalse(string5.equals((Object)string3));
      assertNotNull(string5);
      assertEquals("", string5);
      
      boolean boolean3 = myClass0.isHappy(0);
      assertTrue(boolean3 == boolean2);
      assertTrue(boolean3 == boolean0);
      assertTrue(boolean3 == boolean1);
      assertFalse(boolean3);
      
      boolean boolean4 = myClass0.isLeapYear(0);
      assertFalse(boolean4 == boolean0);
      assertFalse(boolean4 == boolean2);
      assertFalse(boolean4 == boolean3);
      assertFalse(boolean4 == boolean1);
      assertTrue(boolean4);
      
      String string6 = myClass0.reverseString("");
      assertFalse(string6.equals((Object)string4));
      assertFalse(string6.equals((Object)string1));
      assertFalse(string6.equals((Object)string3));
      assertTrue(string6.equals((Object)string5));
      assertFalse(string6.equals((Object)string0));
      assertTrue(string6.equals((Object)string2));
      assertNotNull(string6);
      assertEquals("", string6);
      
      boolean boolean5 = myClass0.isPrimeNum(621);
      assertTrue(boolean5 == boolean0);
      assertTrue(boolean5 == boolean1);
      assertTrue(boolean5 == boolean3);
      assertFalse(boolean5 == boolean4);
      assertTrue(boolean5 == boolean2);
      assertFalse(boolean5);
      
      String string7 = myClass0.reverseString("M61");
      assertFalse(string7.equals((Object)string3));
      assertFalse(string7.equals((Object)string0));
      assertFalse(string7.equals((Object)string5));
      assertFalse(string7.equals((Object)string2));
      assertFalse(string7.equals((Object)string4));
      assertFalse(string7.equals((Object)string6));
      assertFalse(string7.equals((Object)string1));
      assertNotNull(string7);
      assertEquals("16M", string7);
      
      boolean boolean6 = myClass0.isPrimeNum(0);
      assertFalse(boolean6 == boolean3);
      assertFalse(boolean6 == boolean2);
      assertTrue(boolean6 == boolean4);
      assertFalse(boolean6 == boolean5);
      assertFalse(boolean6 == boolean1);
      assertFalse(boolean6 == boolean0);
      assertTrue(boolean6);
      
      int int0 = myClass0.getNext(621);
      assertEquals(41, int0);
      
      boolean boolean7 = myClass0.isPrimeNum(0);
      assertFalse(boolean7 == boolean3);
      assertFalse(boolean7 == boolean0);
      assertTrue(boolean7 == boolean4);
      assertFalse(boolean7 == boolean1);
      assertFalse(boolean7 == boolean5);
      assertFalse(boolean7 == boolean2);
      assertTrue(boolean7 == boolean6);
      assertTrue(boolean7);
      
      boolean boolean8 = myClass0.selfDividing(0);
      assertTrue(boolean8 == boolean5);
      assertFalse(boolean8 == boolean7);
      assertTrue(boolean8 == boolean1);
      assertTrue(boolean8 == boolean0);
      assertFalse(boolean8 == boolean6);
      assertTrue(boolean8 == boolean3);
      assertFalse(boolean8 == boolean4);
      assertTrue(boolean8 == boolean2);
      assertFalse(boolean8);
      
      boolean boolean9 = myClass0.isHappy(0);
      assertTrue(boolean9 == boolean0);
      assertFalse(boolean9 == boolean6);
      assertTrue(boolean9 == boolean5);
      assertTrue(boolean9 == boolean8);
      assertTrue(boolean9 == boolean2);
      assertTrue(boolean9 == boolean1);
      assertTrue(boolean9 == boolean3);
      assertFalse(boolean9 == boolean4);
      assertFalse(boolean9 == boolean7);
      assertFalse(boolean9);
      
      boolean boolean10 = myClass0.isLeapYear(621);
      assertTrue(boolean10 == boolean3);
      assertTrue(boolean10 == boolean0);
      assertFalse(boolean10 == boolean4);
      assertFalse(boolean10 == boolean7);
      assertTrue(boolean10 == boolean9);
      assertTrue(boolean10 == boolean1);
      assertFalse(boolean10 == boolean6);
      assertTrue(boolean10 == boolean5);
      assertTrue(boolean10 == boolean2);
      assertTrue(boolean10 == boolean8);
      assertFalse(boolean10);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      String string0 = myClass0.reverseString("'|");
      assertNotNull(string0);
      assertEquals("|'", string0);
      
      boolean boolean0 = myClass0.isHappy(922);
      assertFalse(boolean0);
      
      int int0 = myClass0.lcm(922, 922);
      assertEquals(922, int0);
      
      String string1 = myClass0.reverseString("|'");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("'|", string1);
      
      boolean boolean1 = myClass0.isHappy(922);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      boolean boolean2 = myClass0.IsPalindrome1("'|");
      assertTrue(boolean2 == boolean0);
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2);
      
      boolean boolean3 = myClass0.containsString("'|", "evo.MyClass");
      assertTrue(boolean3 == boolean0);
      assertTrue(boolean3 == boolean2);
      assertTrue(boolean3 == boolean1);
      assertFalse(boolean3);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      String string0 = myClass0.reverseString("y)ic(.$V^~ 3$QO*`m");
      assertNotNull(string0);
      assertEquals("m`*OQ$3 ~^V$.(ci)y", string0);
      
      String string1 = myClass0.reverseString("y)ic(.$V^~ 3$QO*`m");
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("m`*OQ$3 ~^V$.(ci)y", string1);
      
      int int0 = myClass0.getNext((-1));
      assertEquals(0, int0);
      
      String string2 = myClass0.reverseString("");
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      assertEquals("", string2);
      
      boolean boolean0 = myClass0.containsString("", "y)ic(.$V^~ 3$QO*`m");
      assertFalse(boolean0);
      
      String string3 = myClass0.cal(179);
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string0));
      assertNotNull(string3);
      assertEquals("yes", string3);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      String string0 = myClass0.reverseString("");
      assertNotNull(string0);
      assertEquals("", string0);
      
      String string1 = myClass0.reverseString("o$7?K-|>7K}kl)G%5y");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("y5%G)lk}K7>|-K?7$o", string1);
      
      String string2 = myClass0.reverseString("y5%G)lk}K7>|-K?7$o");
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      assertEquals("o$7?K-|>7K}kl)G%5y", string2);
      
      String string3 = myClass0.reverseString("y5%G)lk}K7>|-K?7$o");
      assertFalse(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string1));
      assertNotNull(string3);
      assertEquals("o$7?K-|>7K}kl)G%5y", string3);
      
      int int0 = myClass0.lcm(15, 15);
      assertEquals(15, int0);
      
      int int1 = myClass0.fib(15);
      assertFalse(int1 == int0);
      assertEquals(610, int1);
      
      String string4 = myClass0.reverseString("y5%G)lk}K7>|-K?7$o");
      assertFalse(string4.equals((Object)string0));
      assertTrue(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string1));
      assertTrue(string4.equals((Object)string2));
      assertNotNull(string4);
      assertEquals("o$7?K-|>7K}kl)G%5y", string4);
      
      boolean boolean0 = myClass0.isLeapYear((-586));
      assertFalse(boolean0);
      
      int int2 = myClass0.getNext(15);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(26, int2);
      
      boolean boolean1 = myClass0.selfDividing((-586));
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
      
      boolean boolean2 = myClass0.isHappy(26);
      assertFalse(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertFalse(boolean2);
      
      int int3 = myClass0.lcm(1802, 1802);
      assertFalse(int3 == int1);
      assertFalse(int3 == int0);
      assertFalse(int3 == int2);
      assertEquals(1802, int3);
      
      int int4 = myClass0.lcm(15, 4);
      assertFalse(int4 == int2);
      assertFalse(int4 == int1);
      assertFalse(int4 == int0);
      assertFalse(int4 == int3);
      assertEquals(60, int4);
      
      boolean boolean3 = myClass0.isPrimeNum(15);
      assertFalse(boolean3 == boolean1);
      assertTrue(boolean3 == boolean2);
      assertTrue(boolean3 == boolean0);
      assertFalse(boolean3);
      
      boolean boolean4 = myClass0.containsString("5y2km0\u0002^Fjc48ns%", "y5%G)lk}K7>|-K?7$o");
      assertTrue(boolean4 == boolean3);
      assertFalse(boolean4 == boolean1);
      assertTrue(boolean4 == boolean0);
      assertTrue(boolean4 == boolean2);
      assertFalse(boolean4);
      
      String string5 = myClass0.reverseString("`?N^[-WHK'2");
      assertFalse(string5.equals((Object)string1));
      assertFalse(string5.equals((Object)string4));
      assertFalse(string5.equals((Object)string2));
      assertFalse(string5.equals((Object)string3));
      assertFalse(string5.equals((Object)string0));
      assertNotNull(string5);
      assertEquals("2'KHW-[^N?`", string5);
      
      boolean boolean5 = myClass0.isPrimeNum(0);
      assertFalse(boolean5 == boolean2);
      assertTrue(boolean5 == boolean1);
      assertFalse(boolean5 == boolean0);
      assertFalse(boolean5 == boolean4);
      assertFalse(boolean5 == boolean3);
      assertTrue(boolean5);
      
      int int5 = myClass0.lcm(4, 1802);
      assertFalse(int5 == int1);
      assertFalse(int5 == int3);
      assertFalse(int5 == int4);
      assertFalse(int5 == int0);
      assertFalse(int5 == int2);
      assertEquals(3604, int5);
      
      int int6 = myClass0.fib(0);
      assertFalse(int6 == int4);
      assertFalse(int6 == int3);
      assertFalse(int6 == int0);
      assertFalse(int6 == int2);
      assertFalse(int6 == int1);
      assertFalse(int6 == int5);
      assertEquals(0, int6);
      
      boolean boolean6 = myClass0.isPrimeNum(1029);
      assertTrue(boolean6 == boolean0);
      assertFalse(boolean6 == boolean1);
      assertTrue(boolean6 == boolean4);
      assertTrue(boolean6 == boolean3);
      assertFalse(boolean6 == boolean5);
      assertTrue(boolean6 == boolean2);
      assertFalse(boolean6);
      
      boolean boolean7 = myClass0.isLeapYear(26);
      assertTrue(boolean7 == boolean4);
      assertTrue(boolean7 == boolean0);
      assertFalse(boolean7 == boolean5);
      assertTrue(boolean7 == boolean2);
      assertTrue(boolean7 == boolean6);
      assertTrue(boolean7 == boolean3);
      assertFalse(boolean7 == boolean1);
      assertFalse(boolean7);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      String string0 = "evo.MyClass";
      String string1 = myClass0.reverseString("evo.MyClass");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("ssalCyM.ove", string1);
      
      String string2 = myClass0.reverseString("ssalCyM.ove");
      assertTrue(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      assertEquals("evo.MyClass", string2);
      
      String string3 = myClass0.reverseString("evo.MyClass");
      assertFalse(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string0));
      assertNotNull(string3);
      assertEquals("ssalCyM.ove", string3);
      
      boolean boolean0 = myClass0.isHappy(4557);
      assertFalse(boolean0);
      
      int int0 = (-1394);
      boolean boolean1 = myClass0.isLeapYear((-1394));
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      boolean boolean2 = myClass0.isHappy((-1394));
      assertTrue(boolean2 == boolean0);
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2);
      
      String string4 = myClass0.reverseString("ssalCyM.ove");
      assertFalse(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string1));
      assertTrue(string4.equals((Object)string0));
      assertTrue(string4.equals((Object)string2));
      assertNotNull(string4);
      assertEquals("evo.MyClass", string4);
      
      int int1 = myClass0.fib((-1394));
      assertTrue(int1 == int0);
      assertEquals((-1394), int1);
      
      String string5 = null;
      // Undeclared exception!
      try { 
        myClass0.IsPalindrome1((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("evo.MyClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      String string0 = "";
      String string1 = myClass0.reverseString("");
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("", string1);
      
      String string2 = myClass0.reverseString("");
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertNotNull(string2);
      assertEquals("", string2);
      
      String string3 = myClass0.reverseString("");
      assertTrue(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string2));
      assertNotNull(string3);
      assertEquals("", string3);
      
      String string4 = myClass0.reverseString("");
      assertTrue(string4.equals((Object)string2));
      assertTrue(string4.equals((Object)string3));
      assertTrue(string4.equals((Object)string1));
      assertTrue(string4.equals((Object)string0));
      assertNotNull(string4);
      assertEquals("", string4);
      
      String string5 = myClass0.reverseString("");
      assertTrue(string5.equals((Object)string0));
      assertTrue(string5.equals((Object)string3));
      assertTrue(string5.equals((Object)string1));
      assertTrue(string5.equals((Object)string4));
      assertTrue(string5.equals((Object)string2));
      assertNotNull(string5);
      assertEquals("", string5);
      
      int int0 = (-3762);
      int int1 = myClass0.lcm((-3762), (-3762));
      assertTrue(int1 == int0);
      assertEquals((-3762), int1);
      
      int int2 = myClass0.lcm((-1), (-3762));
      assertTrue(int2 == int1);
      assertTrue(int2 == int0);
      assertEquals((-3762), int2);
      
      boolean boolean0 = myClass0.selfDividing((-1));
      assertTrue(boolean0);
      
      String string6 = myClass0.reverseString("");
      assertTrue(string6.equals((Object)string1));
      assertTrue(string6.equals((Object)string2));
      assertTrue(string6.equals((Object)string4));
      assertTrue(string6.equals((Object)string3));
      assertTrue(string6.equals((Object)string5));
      assertTrue(string6.equals((Object)string0));
      assertNotNull(string6);
      assertEquals("", string6);
      
      int int3 = myClass0.getNext((-3762));
      assertFalse(int3 == int1);
      assertFalse(int3 == int0);
      assertFalse(int3 == int2);
      assertEquals(0, int3);
      
      // Undeclared exception!
      try { 
        myClass0.addBinary("", "");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      String string0 = myClass0.reverseString("");
      assertNotNull(string0);
      assertEquals("", string0);
      
      boolean boolean0 = myClass0.containsString("evo.MyClass", "");
      assertTrue(boolean0);
      
      boolean boolean1 = myClass0.isPrimeNum(0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      
      String string1 = myClass0.reverseString("");
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("", string1);
      
      int int0 = myClass0.getGCD(0, (-181));
      assertEquals(181, int0);
      
      String string2 = myClass0.reverseString("");
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertNotNull(string2);
      assertEquals("", string2);
      
      String string3 = myClass0.reverseString("C(vzx^VAGLFbD2");
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string0));
      assertNotNull(string3);
      assertEquals("2DbFLGAV^xzv(C", string3);
      
      int int1 = myClass0.lcm(0, (-181));
      assertFalse(int1 == int0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      assertNotNull(myClass0);
      
      String string0 = myClass0.reverseString("");
      assertNotNull(string0);
      assertEquals("", string0);
      
      String string1 = myClass0.reverseString("A h");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("h A", string1);
      
      String string2 = myClass0.reverseString("");
      assertTrue(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      assertEquals("", string2);
      
      String string3 = myClass0.reverseString("");
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string1));
      assertNotNull(string3);
      assertEquals("", string3);
      
      String string4 = myClass0.reverseString("");
      assertTrue(string4.equals((Object)string0));
      assertTrue(string4.equals((Object)string2));
      assertTrue(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string1));
      assertNotNull(string4);
      assertEquals("", string4);
      
      boolean boolean0 = myClass0.isHappy((-64));
      assertFalse(boolean0);
      
      int int0 = myClass0.lcm(48, 2211);
      assertEquals(35376, int0);
      
      int int1 = myClass0.lcm((-64), (-898));
      assertFalse(int1 == int0);
      assertEquals((-28736), int1);
      
      boolean boolean1 = myClass0.containsString("Evo.MyClass", "Evo.MyClass");
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
      
      String string5 = myClass0.reverseString("h A");
      assertFalse(string5.equals((Object)string4));
      assertFalse(string5.equals((Object)string3));
      assertFalse(string5.equals((Object)string1));
      assertFalse(string5.equals((Object)string2));
      assertFalse(string5.equals((Object)string0));
      assertNotNull(string5);
      assertEquals("A h", string5);
      
      boolean boolean2 = myClass0.IsPalindrome1("");
      assertFalse(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertFalse(boolean2);
      
      String string6 = myClass0.reverseString("");
      assertFalse(string6.equals((Object)string1));
      assertTrue(string6.equals((Object)string4));
      assertTrue(string6.equals((Object)string2));
      assertTrue(string6.equals((Object)string3));
      assertFalse(string6.equals((Object)string5));
      assertTrue(string6.equals((Object)string0));
      assertNotNull(string6);
      assertEquals("", string6);
      
      int int2 = myClass0.getNext(48);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals(80, int2);
      
      boolean boolean3 = myClass0.isHappy((-898));
      assertFalse(boolean3 == boolean1);
      assertTrue(boolean3 == boolean0);
      assertTrue(boolean3 == boolean2);
      assertFalse(boolean3);
      
      int int3 = myClass0.fib((-28736));
      assertFalse(int3 == int2);
      assertTrue(int3 == int1);
      assertFalse(int3 == int0);
      assertEquals((-28736), int3);
      
      boolean boolean4 = myClass0.isPrimeNum(2211);
      assertTrue(boolean4 == boolean2);
      assertTrue(boolean4 == boolean0);
      assertTrue(boolean4 == boolean3);
      assertFalse(boolean4 == boolean1);
      assertFalse(boolean4);
      
      int int4 = myClass0.getNext(0);
      assertFalse(int4 == int2);
      assertFalse(int4 == int3);
      assertFalse(int4 == int0);
      assertFalse(int4 == int1);
      assertEquals(0, int4);
      
      boolean boolean5 = myClass0.containsString("A h", "%z");
      assertTrue(boolean5 == boolean0);
      assertTrue(boolean5 == boolean4);
      assertTrue(boolean5 == boolean3);
      assertTrue(boolean5 == boolean2);
      assertFalse(boolean5 == boolean1);
      assertFalse(boolean5);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.reverseString("");
      myClass0.fib((-1352));
      myClass0.reverseString("");
      myClass0.reverseString("");
      myClass0.reverseString("cl<k'k'KSjy=7wFA\"");
      myClass0.reverseString("cl<k'k'KSjy=7wFA\"");
      myClass0.containsString("", "");
      myClass0.lcm(0, (-1352));
      myClass0.isPrimeNum(0);
      myClass0.lcm(1, 0);
      myClass0.containsString("kd^IejvaC", "");
      myClass0.isHappy(1);
      myClass0.getGCD(0, (-1352));
      myClass0.getGCD((-463), 0);
      myClass0.reverseString("");
      myClass0.lcm(0, 1992);
      // Undeclared exception!
      try { 
        myClass0.containsString((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("evo.MyClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.reverseString("?6x1\" Ll8-QB693Z_(]");
      myClass0.reverseString("3{oSU*/'R{#<D!R-");
      myClass0.reverseString("");
      myClass0.isLeapYear((-328));
      myClass0.selfDividing((-328));
      myClass0.reverseString("?6x1\" Ll8-QB693Z_(]");
      myClass0.reverseString("](_Z396BQ-8lL \"1x6?");
      myClass0.selfDividing(0);
      myClass0.isPrimeNum(0);
      myClass0.getNext(0);
      int int0 = (-82);
      myClass0.isHappy((-82));
      // Undeclared exception!
      try { 
        myClass0.reverseString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("evo.MyClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MyClass myClass0 = new MyClass();
      myClass0.reverseString("");
      myClass0.reverseString("evo.MyClass");
      myClass0.reverseString("");
      myClass0.isHappy(0);
      myClass0.reverseString("");
      myClass0.reverseString("Qq`[Y03O,$y|)51bet");
      boolean boolean0 = myClass0.IsPalindrome1("");
      myClass0.reverseString("");
      String string0 = myClass0.cal(0);
      assertEquals("no", string0);
      
      String string1 = myClass0.reverseString("IS[Haes9)8n1");
      assertEquals("1n8)9seaH[SI", string1);
      
      boolean boolean1 = myClass0.selfDividing(2475);
      int int0 = myClass0.lcm((-1), (-1));
      assertEquals((-1), int0);
      
      int int1 = myClass0.lcm((-1), 416);
      assertEquals(416, int1);
      
      myClass0.isPrimeNum((-1));
      boolean boolean2 = myClass0.containsString("evo.MyClass", "");
      assertFalse(boolean2 == boolean0);
      
      boolean boolean3 = myClass0.isHappy(0);
      assertTrue(boolean3 == boolean1);
      assertFalse(boolean3);
  }
}
