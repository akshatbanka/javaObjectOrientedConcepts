/*
this keyword can be used to refer current class instance variable
this keyword can be used to invoke current class method(implicitly)
this() can be used to invoke current class constructor
this can be used to pass as an argument in the method call
this can be used to pass as an argument in the constructor call
this can be used to return the current class instance from the method
*/

class A{

A(){
System.out.println("Non parametrized constructor called");
}
A(int a){
this();
System.out.println("parametrized constructor called");
}

}

class this2{
public static void main(String args[]){
A obj = new A(10);
}
}