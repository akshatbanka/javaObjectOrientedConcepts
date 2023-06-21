class student{
 String name;
 int roll;
 
 void display(){
 System.out.println("Student info : ");
 }
} 

class detail extends student{
void dispName(String n){
name=n;
super.display();
System.out.println("Studnet name : "+name);
}
}

class detail2 extends student{
void dispRoll(int r){
roll=r;
System.out.println("Student roll : "+roll);
}
}

class hierarchal{
public static void  main(String args[]) {
 detail obj1 = new detail();
obj1.dispName("xyz");
detail2 obj2 = new detail2();
obj2.dispRoll(01);
     
} 
}


