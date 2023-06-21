//AutoMatic promotion : one data type is promoted to other, if no matching data type is found(ex: char-> int)
class auto{
void display(String s){
System.out.println("display one called");
}
void display(int i){
System.out.println("display two called");
}
}

class AutomaticPromo{
public static void main(String args[]){
auto obj = new auto();
obj.display('a');

}
}