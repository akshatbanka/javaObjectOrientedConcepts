/*
To refer parent class instance variable
To invoke parent class method
To invoke parent class constructor
*/

class School{
String name="xyz";
void show(){
System.out.println("Name  : "+name);
}
}

class Student extends School{
int roll=01;
void display(){
super.show();
System.out.println("RollNo : "+roll);
}
}

class super2{
public static void main(String args[]){
Student obj = new Student();
obj.display();
}
}