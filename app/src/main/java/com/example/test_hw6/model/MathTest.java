package com.example.test_hw6.model;

public
class MathTest {

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int div(int a, int b){
        return a/b;
    }

    public int exponentiation(int a, int b){
        return (int) Math.pow( a,b );
    }

    public int sqrt(int a){
        return (int) Math.sqrt( a );
    }

}
