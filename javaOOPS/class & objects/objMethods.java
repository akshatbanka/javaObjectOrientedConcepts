class student{
String name;
int roll;
void student(String s, int r){
name = s;
roll=r;
System.out.println("Student name "+name+" Student roll " +roll);
}
}

class objMethod{
public static void main(String args[]){
student s1 = new student();
s1.student("xyz",01);
}
}