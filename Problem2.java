package com.exam;

import java.util.Scanner;
class Problem2 {
public static void main(String []args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number");
int a = scan.nextInt();
for(int i = 1; i <=a; i++){
for(int j = 1; j<= (i*2)-1; j++) {
if(j%2 != 0){
System.out.print(j);
}
}
System.out.println();
}
}
}