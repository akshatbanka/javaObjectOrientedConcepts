class Student{
int roll;
String password;
int marks[];

Student(int r,String p){
this.roll=r;
this.password=p;
}


Student(Student s1){
    marks=new int[3];
this.roll=s1.roll;
this.marks=s1.marks;
}

void display(){
System.out.println(roll+" "+password);
for(int i : marks){
    System.out.print(marks[i]+" ");
}
}
}

class Constructor{
public static void main(String args[])
{
Student s1 = new Student(10,"abd");
s1.marks[0]=10;
s1.marks[1]=20;
s1.marks[2]=30;
s1.display();
Student s2 = new Student(s1);
s2.password="xyz";
s2.display();
}
}