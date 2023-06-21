class emp{
void display(){
System.out.println("emp detail: ");
}
void display(String s){
System.out.println("emp name  : "+s);
}
void display(int i){
System.out.println("emp id    : "+i);
}
}

class overloading{
public static void main(String args[]){
emp obj = new emp();
obj.display();
obj.display("xyz");
obj.display(01);
}
}