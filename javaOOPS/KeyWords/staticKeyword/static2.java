/*
static method belongs to the class rather than the object
they can be invoked without the need for creating an instance of a class
the static method can not use non static data member or method directly
this and super cannot be used in static context
*/

import java.util.Scanner;
class Calculate{
static int cube(int r){
int c = r*r*r;
return c;
}
}

class static2{
public static void main(String args[]){
    System.out.println("Enter number");
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
int result = Calculate.cube(n);
System.out.println("cube of "+n+" is "+result);
}
}