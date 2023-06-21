/*
before JDK 5.0 it was not possible to override a method by changing the retrun type.
java 5.0 onwards it is possible to have different return type a overriding method in child class,
but child's return type should be sub type of parent's return type. so this is known as covarient 
return type
*/
class student{
Object show(){
System.out.println("Studnet method called");
return 0;
}
}

class school extends student {
String show(){
System.out.println("school method called");
return null;
}   }

class covariantReturnType {
public static void main(String []args){
        
        student obj1 = new student();
        obj1.show();
        school obj2 = new school();
        obj2.show();
     }
}
