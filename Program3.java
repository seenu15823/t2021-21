package com.exam;

import java.util.Scanner;
class Problem3 {
public static void main(String []args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number");
int a = scan.nextInt();
for(int i = 1; i <= a; i++){
for(int k = 1; k <= 1; k++) {
for(int j = 1; j<= i ; j++) {
if(j%2 != 0 && i%2 != 0){
System.out.print(j);
}
}
System.out.println();
}
}
}
}
