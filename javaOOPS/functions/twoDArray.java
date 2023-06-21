public class twoDArray {
    public static void printSpiral(int a[][]){
        System.out.print("Spiral print of given matrix : ");
        int startrow=0;
        int startcol=0;
        int endrow=a.length-1;
        int endcol=a.length-1;
        while(startrow<=endrow && startcol<=endcol){
        //top
for(int j=startcol;j<=endcol;j++){
System.out.print(a[startrow][j]+" ");
}
//left
for(int i=startrow+1;i<=endrow;i++){
System.out.print(a[i][endcol]+" ");
}
//bottom
for(int j=endcol-1;j>=startcol;j--){
    if(endrow==startrow){
    break;
    }
System.out.print(a[endrow][j]+" ");
}
//right
for(int i=endrow-1;i>=startrow+1;i--){
    if(endcol==startcol){
    break;
    }
System.out.print(a[i][startcol]+" ");
}

endrow--;
endcol--;
startrow++;
startcol++;
System.out.println();
}
}
    
 public static int searchKey(int a[][],int key){
       int i=0;
       int j=a.length-1;
       while(i<=a.length-1 && j>=0){
           if(key==a[i][j]){
           System.out.println("key "+key+" found in cell ("+i+","+j+")");
           return key;
           }
      else if(key<a[i][j]){
       j--;
       }
       else if(key>a[i][j]){
       i++;
       }
       }
       System.out.println("key "+key+" not found");
       return 0;
    }
 public static int sumOfDia(int a[][]){
     int sum=0;
 for(int i=0;i<a.length;i++){
 sum += a[i][i];
 if(i!=a.length-i-1){
 sum +=a[i][a.length-i-1];
 }
 }
 System.out.println("Sum of diagonals : "+sum);
 return sum;
 }
 
 public static void transpose(int a[][]){
 for(int i=0;i<a.length;i++){
 for(int j=0;j<a.length;j++){
 System.out.print(a[j][i]+" ");
 }System.out.println();
 }
 }
 
 public static void add(int b[][],int c[][]){
 System.out.println("Addition of two matrix ");
 int sum[][]=new int [b.length][b.length];
 for(int i=0;i<b.length;i++){
 for(int j=0;j<b.length;j++){
 sum[i][j]=b[i][j]+c[i][j];
 System.out.print(sum[i][j]+" ");
 }System.out.println();
 }
 }
 

    public static void main(String args[]){
    int a[][]= {
        {11,12,13,14,15},
        {16,17,18,19,20},
        {21,22,23,24,25},
        {26,27,28,29,30},
        {31,32,33,34,35}
        };
    System.out.println("Given two-D array : ");
    for(int i=0;i<a.length;i++){
    for(int j=0;j<a.length;j++){
    System.out.print(a[i][j]+" ");
    }System.out.println();
    }
    printSpiral(a);
    searchKey(a,19);
    sumOfDia(a);
    transpose(a);
    
    int b[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
                };
    int c[][] = {
                {1,1,1},
                {2,2,2},
                {1,1,0}
                };
 
    add(b,c);
    
    }
}
