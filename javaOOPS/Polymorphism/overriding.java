class school //Has Subclass
{
void show() //Is Overridden
{
System.out.println("class school method called");
}
}

class student extends school{
void show(){
System.out.println("class student method called");
}
}

class overriding{
public static void main(String args[]){
school obj1 = new school();
obj1.show();
student obj2 = new student();
obj2.show();
school s1 = new student();
s1.show();

}
}