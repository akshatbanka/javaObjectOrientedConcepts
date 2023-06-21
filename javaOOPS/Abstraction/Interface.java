interface student{
public abstract void display();
public static final int a=10;
}
class school implements student{
    @Override
public void display(){
System.out.println("school method called");
System.out.println("school variable a called : "+a);
}
}  
class Interface{
public static void main(String args[]){
school obj = new school();
obj.display();
}
}