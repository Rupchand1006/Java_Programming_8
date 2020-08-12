package com.dell.emc.lambda;

interface Drawable{  
    public void draw();  
}  
public class ExpressionExample {  
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable withoutLambda =new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        withoutLambda.draw();   
    }  
} 
