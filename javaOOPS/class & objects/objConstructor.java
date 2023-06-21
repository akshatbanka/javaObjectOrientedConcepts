class student{
String name;
int roll;

student(String s,int r){
name=s;
roll=r;
System.out.println("Student name : "+name+" Student rollnumber :"+roll);
}
}

class objConstructor{
public static void main(String args[]){
student s1 = new student("xyz",01);
}
}