class student{
String name;
int roll;
char section;

}
class detail extends student{

void display(String n,int r,char s){
    name=n;
    roll=r;
    section=s;
System.out.println("Student name : "+name+" Student rollnumber :"+roll+" Studnet Section "+section);

}
}
class singleIn{
public static void main(String args[]){
detail d1 = new detail();
d1.display("xyz",01, 'A');
}
}