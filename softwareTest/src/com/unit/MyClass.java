package com.unit;

public class MyClass {


    /**
     * 求两个数的最大公约数
     * @param num1
     * @param num2
     * @return
     */
    public int getGCD(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }

    /**
     * 求两个数的最小公倍数
     * @param num1
     * @param num2
     * @return
     */
    public int lcm(int num1, int num2){
        int p1 = num1;
        int q1 = num2;

        while(num2 != 0){
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        return (p1*q1)/num1;
    }

    /**
     * 判断一个大于2的数是不是质数
     * @param n
     * @return
     */
    public boolean isPrimeNum(int n) {
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断是否闰年
     * @param year
     * @return
     */
    public boolean isLeapYear(int year){
        if(year % 4== 0 && year%100!=0||year%400==0)
        {
            return true;
        }
        return false;
    }

    /**
     * 判断father是否包含child
     * @param father
     * @param child
     * @return
     */
    public boolean containsString(String father,String child){
        if(father.indexOf(child)==-1)
            return false;
        return true;
    }

    /**
     * 判断字符串是否回文
     * @param A
     * @return
     */
    public boolean IsPalindrome1(String A){
        char[] arrayA = A.toCharArray();
        int top = 0;
        int end = arrayA.length-1;
        if(A.equals("") || A.equals(null))
            return false;
        while(top < end){
            if(arrayA[top++] != arrayA[end--])
                return false;
        }
        return true;
    }

    /**
     * 计算一个字符串的倒序
     * @param str
     * @return
     */
    public String reverseString(String str){
        char[] ch = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = ch.length - 1; i >= 0; i--) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    /**
     * 自除数 是指可以被它包含的每一位数除尽的数。
     * 自除数不允许包含 0 。
     * @param n
     * @return
     */
    public boolean selfDividing(int n) {
        for (char c: String.valueOf(n).toCharArray()) {
            if (c == '0' || (n % (c - '0') > 0))
                return false;
        }
        return true;
    }

    /**
     * 斐波那契数
     * @param N
     * @return
     */
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        return fib(N-1) + fib(N-2);
    }

    /**
     * 判断一个数 n 是不是快乐数。
     * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
     * 如果 n 是快乐数就返回 True ；不是，则返回 False 。
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

    public int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    /**
     * 二进制求和
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

}
