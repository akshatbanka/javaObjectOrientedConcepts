public class ArrayFunction {

    public static void display(int a[]) {
        System.out.print("Given array : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int linearSearch(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(int a[], int key) {
        int start = 0;
        int end = a.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (a[mid] == key) {
                return mid;
            }
            if (a[mid] > key) {
                end = mid - 1;
            }
            if (a[mid] < key) {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    public static void insertionSort(int a[]){
    for(int i=1;i<a.length;i++){
    int current=a[i];
    int j=i;
    while(j>0 && current<a[j-1]){
    a[j]=a[j-1];
    j--;
    }
    a[j]=current;
    }
    for(int i :a){
    System.out.print(i+" ");
    }System.out.println();
    }
    
    public static void selectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int current = i;
            for (int j = i + 1; j <= a.length - 1 - i; j++) {
                if (a[j] > a[current]) {
                    current = j;
                }
            }
            int temp = a[i];
            a[i] = a[current];
            a[current] = temp;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int a[]) {
        
        for (int i = 0; i < a.length - 1; i++) {
             boolean isSort = true;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSort=false;
                }
                if(isSort){
                break;
                }
            }
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int greatestNum(int a[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int smallestNum(int a[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public static void reverseArray(int a[]) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int temp = a[start];
            a[ start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void pairs(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int curr = a[i];
            for (int j = i + 1; j < a.length; j++) {
                System.out.print("(" + curr + "," + a[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void subarray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }

    }

    public static int bruteForce(int a[]) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                if (maxsum < sum) {
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }

    public static void kadanes(int a[]) {
         int start = 0;
        int end = 0;
        int s = 0;
        int maxsum = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < a.length; i++) {
            current = current + a[i];
            if (current > maxsum) {
                maxsum = current;
                start = s;
                end = i;
            }
            if (current < 0) {
                current = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum sum of sub array is : " + maxsum+" from index "+start+"-"+end);
    }

    public static void rotateRight(int a[], int k) {
        int split = a.length - k;
        k = split;


        int rotate[] = new int[a.length];
        int i = 0;
        while (split < a.length) {
            rotate[i] = a[split];

            i++;
            split++;
        }
        split = 0;

        while (split < k) {
            rotate[i] = a[split];

            i++;
            split++;
        }

        System.out.print("Right rotation of array when key is 4 : ");
        for (int val : rotate) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void rotateLeft(int a[], int k) {
        int split = k;


        int rotate[] = new int[a.length];
        int i = 0;
        while (split < a.length) {
            rotate[i] = a[split];
            i++;
            split++;
        }
        split = 0;

        while (split < k) {
            rotate[i] = a[split];
            i++;
            split++;
        }
        System.out.print("left Rotation of array when key is 4  : ");
        for (int val : rotate) {
            System.out.print(val + " ");
        }
        System.out.println();

    }

    public static void insertion(int a[], int pos, int ele) {
        for (int i = a.length - 1; i > pos - 1; i--) {
            a[i] = a[i - 1];
        }
        a[pos - 1] = ele;
        System.out.print("Element 10 is inserted at 3rd position : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void deletion(int a[], int ele) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele) {
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
            }
        }

        System.out.print("Element 10 deleted from array :");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int a[] = {6,5,3,4,1};
         display(a);
        int index = linearSearch(a, 6);
        System.out.println("Element 6 found using linear search at index " + index);
        int index2 = binarySearch(a, -2);
        System.out.println("Element -2 found using binary search at index " + index2); 
        System.out.print("Array sorted using insertion sort : ");
        insertionSort(a);
        System.out.print("Array sorted using selection sort : ");
        selectionSort(a);
        System.out.print("Array sorted using bubble sort    : ");
        bubbleSort(a);
        int greatest = greatestNum(a);
        System.out.println("Greatest number in the given array is " + greatest);
        int small = smallestNum(a);
        System.out.println("Smallest number in the given array is " + small);
        System.out.print("Reversed Array  : ");
        reverseArray(a);
        System.out.println("pairs of  Array : ");
        pairs(a);
        System.out.println("SubArraay of  Array : ");
        subarray(a);
        int max = bruteForce(a);
        System.out.println("Maximum sum of subarray using bruteForec is " + max);
        kadanes(a);
        System.out.println("Maximum sum of subarray using kadanesAlgo is ");
        rotateRight(a, 4);
        rotateLeft(a, 4);
        insertion(a, 3, 10);
        deletion(a, 10); 

    }
}
