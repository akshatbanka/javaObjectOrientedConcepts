import java.math.BigInteger;
import java.util.Scanner;

 class NumberFunction{
     public static int count(int n){
         int c=0;
     while(n!=0){
     int l =n%10;
     c++;
     n=n/10;
     }
     return c;
     }
     
     public static int sumOfdig(int n){
     int sum=0;
     while(n!=0){
     int l = n%10;
     sum=sum+l;
     n=n/10;
     }
     return sum;
     }
     public static int reverse(int n){
         int r=0;
     while(n!=0){
     int l = n%10;
     r=r*10+l;
     n=n/10;
     }
     return r;
     }
     
     public static void palindrome(int n){
     int r=reverse(n);
     if(r==n){
     System.out.println("palindrome");
     }
     else
         System.out.println("not palindrome");
     }
public static void oddEve(int n){

    if(n%2==0){
    System.out.println("even");
    }
    else
        System.out.println("odd");
    
}

public static boolean isprime(int n){
    if(n==2){
    return true;
    }
for(int i=2;i<n;i++){
if(n%i==0){
return false;
}
}
return true;
}

public BigInteger factorial(int n){
    BigInteger  fact=new BigInteger("1");
for(int i=n;i>=1;i--){
fact = fact.multiply(BigInteger.valueOf(i));
}
return fact;
}

public static void multiple(int n){
for(int i=1;i<=10;i++){
System.out.print(n*i+" ");
}System.out.println();
}
     
public static void factor(int n){
for(int i=1;i<=n;i++){
if(n%i==0){
System.out.print(i+" ");
}
}System.out.println();
}

public static void primeFactor(int n){

    int i=2;
    while(n!=1){
    if(n%i==0){
    System.out.print((i+" "));
    n=n/i;
    }
    else{
    i++;
    }
    }System.out.println();

}

public static void fibonacci(int n){
int i=0;
int j=1;
int sum=0;
System.out.print(i+" "+j+" ");
for(int x=2;x<n;x++){
    sum=i+j;
    System.out.print(sum+" ");
i=j;
j=sum;
}
System.out.println();
}

public static void tribonacci(int n){
int i=0;
int j=1;
int k=1;
int sum=0;
System.out.print(i+" "+j+" "+k+" ");
for(int x=3;x<n;x++){
   sum=i+j+k;
    System.out.print(sum+" ");
i=j;
j=k;
k=sum;

}System.out.println();
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number : ");
int n = sc.nextInt();

System.out.print("Digit count : ");
int c = count(n);
System.out.println(c);

int sum = sumOfdig(n);
System.out.println("Sum of digits : "+sum);

int re=reverse(n);
System.out.println("Reverse of "+n+" : "+re);

System.out.print("Palindrome or not : ");
palindrome(n);

System.out.print("odd or even : ");
oddEve(n);

boolean prime =isprime(n);
System.out.print("prime or composite : ");
if(prime){
System.out.println("prime");}
else{
System.out.println("Composite");}

NumberFunction obj = new NumberFunction();
BigInteger bi = obj.factorial(n);
System.out.println("factorial of "+n+" : "+bi);

System.out.print("Multiple of "+n+ " : ");
multiple(n);

System.out.print("Factors of "+n+" : ");
factor(n);

System.out.print("Prime factors of "+n+" : ");
primeFactor(n);

System.out.print("fibonacci series till "+n+" : ");
fibonacci(n);

System.out.print("tribonacci series till "+n+" : ");
tribonacci(n);
}
}