/*
To refer parent class instance variable
to invoke parent class method
to invoke parent class constructor
*/

class School{
   String name="xyz";
School(){
    System.out.println("Name   : "+name);
}
}

class Student extends School{
int roll=01;
Student(){
super();
System.out.println("rollNo : "+roll);
}
}

class super3{
public static void main(String args[]){
Student obj = new Student();

}
}