class empl{
private int empId; //data hiding

public void set(int ei){
empId=ei;
}

public int get(){
return empId;
}
}

class encapsulation{
public static void main(String args[]){
empl obj = new empl();
obj.set(101);
int result = obj.get();
System.out.println("emplId : "+result);
}
}