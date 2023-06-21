/*
To refer parent class instance variable
To invoke parent class method
to invoke parent class constructor
*/

class School{
String name="xyz";
}

class Student extends School{
String name="abc";
void display(){
System.out.println("Parent class instance variable   : "+super.name);
System.out.println("Child class instance variable    : "+name);
}
}

class super1{
public static void main(String args[]){
Student obj = new Student();
obj.display();

}
}