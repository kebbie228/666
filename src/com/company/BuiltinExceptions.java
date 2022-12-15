package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class BuiltinExceptions {
    public static void main(String[] args) {
     // processArithmeticException();
       //processInputMismatchException();

       // processIOException();
        //processArray();
        //processClass();
       // processField();
    processNullPointer();
    }
    static void processArithmeticException(){
        //delenie na 0
        int a=1,b;
        try {
            b = a / 0;
        }
        catch (ArithmeticException e) {
            System.err.println("Деление на 0");
        }

    }
    static void processInputMismatchException(){
        //исключение ввода
        int a=0;
        while (a==0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a");

            try {
                a=scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Error,enter an integer number");

            }
        }
    }


    //обработка исключения из файла
    static void processIOException(){
        try {
            InputStream input = new FileInputStream("src\\data\\words.txt");
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.err.println("File not found");
        }
        System.out.println("File opened...");
    }
//выход ха пределы массива
    static void processArray(){
        int[] a={1,2,3};
        try {
            int b=a[4];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("выход за передлы");
        }
    }

    //проверка существования класса
    static void processClass(){
        Class<?> clazz=null;
        try {
       clazz=Class.forName("com.company.Main");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clazz.getSimpleName());
    }

    static void processField(){
        Person person=new Person();
        Class<?> clazz=person.getClass();
        //Class<?> clazz=Person.class;
        try {
            Field field=clazz.getDeclaredField("name");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println(clazz.getSimpleName());
    }

    static void processNullPointer(){
       Person person=null;
       try {
           person.getName();

       }
       catch (NullPointerException e) {
          e.printStackTrace();
       }

    }
}
