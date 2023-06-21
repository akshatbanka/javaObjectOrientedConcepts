/*
this keyword can be used to refer current class instance variable
this keyword can be used to invoke current class method(implicity)
this() can be used to invoke current class constructor
this can be used to pass as an argument in the method call
this can be used to pass as an argument in the constructor call
this can be used to return the current class instance from the method
*/

class student {

    int rollno;
    String name;
    float fee;

    void detail(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void Display() {
        System.out.println("roll number : " + rollno + " Name : " + name + " fee : " + fee);
    }
}

class this1 {

    public static void main(String args[]) {
        student s1 = new student();
        s1.detail(001, "abc", 5000f);
        s1.Display();
    }
}