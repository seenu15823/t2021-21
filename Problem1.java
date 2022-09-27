package com.exam;

class Problem1 {
void calculator (double a, double b, String str) {
int c;
if(str.equals("+")) {
System.out.println(a+b);
}
else if(str.equals("-")) {
System.out.println(a-b);
}
else if(str.equals("*")) {
System.out.println(a*b);
}
else if(str.equals("/")){
System.out.println(a/b);
}
else{
System.out.println("Invalid operator type");
}
}
}