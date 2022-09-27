package com.exam;

import java.util.Scanner;
class Problem1App {
public static void main (String [] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter 2 numbers");
int a = scan.nextInt();
int b = scan.nextInt();
System.out.println("enter the operator");
String s = scan.next();
Problem1 pb = new Problem1();
pb.calculator(a, b, s);
}
}
