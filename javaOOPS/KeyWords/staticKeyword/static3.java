/*
static block used to initialize the static data member
it is executed before the main method at the time of class loading
*/

class static3{
static{
System.out.println("Static block invoked");
}
public static void main(String args[]){
System.out.println("Main method invoked");
}
}