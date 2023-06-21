/* 
static variable can be used to refer common property
They gets memory only once in the class area at the time of class loading
*/
class Student{

int rollNo;
String name;
static String clgName="AITR";

Student(int r,String n){
rollNo=r;
name=n;
System.out.println(name+" "+rollNo+" "+clgName);
}
}

class static1{
public static void main(String args[]){
Student s1 = new Student(001,"xyz");
Student s2 = new Student(002,"abc");
}
}