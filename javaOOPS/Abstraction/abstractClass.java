abstract class student{
abstract void display();
} 

class school extends student{
void display(){
System.out.println("abstract method called");
}
}

class abstractClass{
public static void main(String args[]){
school obj = new school();
obj.display();

}

}