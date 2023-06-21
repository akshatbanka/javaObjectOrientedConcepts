class student{
String name;
int roll;
}

class detail extends student{
void display1(String s, int r){
    name=s;
    roll=r;
System.out.println("Student name : "+name+" Student rollnumber : "+roll);
}
}
class parent extends detail{
int percent;

void display2(int p){
        percent=p;
        super.display1("xyz",01);
System.out.println("percent of "+name+" is "+percent);
}}

class multilevel{
public static void main(String args[]){
parent ob = new parent();
ob.display2(83);
}
}