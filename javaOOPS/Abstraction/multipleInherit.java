interface student1{
public abstract void display();
public static final int roll=1;
}

interface student2{
public abstract void show();
public static final int roll2 =2;
}

class school implements student1,student2{
    @Override
public void display(){
System.out.println("student1: xyz");
System.out.println("roll No.: "+roll);
}
    @Override
public void show(){
System.out.println("student2: abc");
System.out.println("roll No.: "+roll2);
}
}  
class multipleInherit{
public static void main(String args[]){
school obj = new school();
obj.display();
obj.show();
}
}