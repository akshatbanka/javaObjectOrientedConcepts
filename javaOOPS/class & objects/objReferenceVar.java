class student{
String name;
int roll;
public void display(){
System.out.println("Student name : "+name+"Student rollnumber :"+roll);
}
}

class objReferenceVar{
public static void main(String args[]){
student s1 = new student();
s1.name="xyz";
s1.roll=01;
s1.display();

}}