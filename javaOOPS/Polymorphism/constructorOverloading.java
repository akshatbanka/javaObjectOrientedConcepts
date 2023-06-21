class area{

area(String s){
System.out.println("Name of shape : "+s);
}
area(int r){
System.out.println("Enter radius  : "+r);
}
area(double a){
System.out.println("Perimeter     : "+a);
}
}

class constructorOverloading{
public static void main(String args[]){
area obj = new area("circle");
area obj1 = new area(5);
area obj2 = new area(2*3.14*5);
}
}