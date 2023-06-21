
import java.util.Scanner;

class NumberRangeFunction {

    public static void PrimeRange(int a, int b) {
        int num[] = new int[10000];
        for (int i = 2; i <= Math.sqrt(b); i++) {
            if (num[i] == 0) {
                for (int j = i * i; j <= b; j += i) {
                    num[j] = 1;
                }
            }
        }
        System.out.print("Prime numbers between " + a + " and " + b + " : ");
        for (int i = a; i <= b; i++) {
            if (num[i] == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void OddEveRange(int a, int b) {
        System.out.print("Even num : ");
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("odd num  : ");
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void StrongNumRange(int a, int b) {
        //sum of factorial of digits is equal to the number 
        int sum = 0;
        System.out.print("Strong number b/w " + a + " and " + b + " : ");
        for (int i = a; i <= b; i++) {
            int temp = i;
            sum = 0;
            while (temp != 0) {
                int n = temp % 10;
                int f = 1;
                for (int j = n; j >= 1; j--) {
                    f = f * j;
                }
                sum += f;

                temp = temp / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void PerfectNumRange(int a, int b) {
        //sum of their proper divisors is equal to the num
        System.out.print("Perfect number b/w " + a + " and " + b + " : ");
        for (int i = a; i <= b; i++) {
            int sum = 0;
            int j = 1;
            while (j != i) {
                if (i % j == 0) {
                    sum += j;
                }
                j++;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int Count(int x) {
        int count = 0;
        while (x != 0) {
            count++;
            x = x / 10;
        }
        return count;
    }

    public static void ArmstrongNumRange(int a, int b) {
        //sum of each digit raised to the power itself 1634 = 1^(1)+6^(6)+3^(3)+4^(4)

        System.out.print("Armstrong number b/w " + a + " and " + b + " : ");
        for (int i = a; i <= b; i++) {
            int temp = i;
            int sum = 0;
            int order = Count(temp);
            while (temp != 0) {
                int n = temp % 10;
                sum += (int) Math.pow(n, order);
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void Lcm(int a, int b) {
        System.out.print("LCM of " + a + " and " + b + " : ");
        int max = a > b ? a : b;
        for (int i = max; i <= a * b; i += max) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void Hcf(int a, int b) {
        int min = a < b ? a : b;
        System.out.print("HCF of " + a + " and " + b + " : ");
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.print(i);
                break;
            }
        }
        System.out.println();
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Lowerbound : " + a);
        System.out.println("Upperbound : " + b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lowerbound : ");
        int a = sc.nextInt();
        System.out.print("Enter Upperbound : ");
        int b = sc.nextInt();
        PrimeRange(a, b);
        OddEveRange(a, b);
        StrongNumRange(a, b);
        PerfectNumRange(a, b);
        ArmstrongNumRange(a, b);
        Lcm(a, b);
        Hcf(a, b);
        swap(a, b);

    }
}
