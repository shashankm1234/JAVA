// implementation & traversing
/*
class Arrays{
    public static void main(String args[]){
        int a[]=new int[5];//declaration and instantiation
        a[0]=10;//initialization
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;
//traversing array
        for(int i=0;i<a.length;i++)//length is the property of array
            System.out.println(a[i]);
    }}
 */

//Print the array elements using for-each loop
/* class Arrays{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
//printing array using for-each loop
        for(int i:arr)
            System.out.println(i);
    }}
 */

//int a[]={33,3,4,5};    //declaration, instantiation and initialization

//Java Program to demonstrate the way of passing an array to method.
/*class Arrays{
    //creating a method which receives an array as a parameter
    static void min(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];

        System.out.println(min);
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5};//declaring and initializing an array
        min(a);//passing array to method
    }}
 */

//Java Program to return an array from the method
/* class Arrays{
    //creating method which returns an array created by itself only
    static int[] get(){
        return new int[]{10,30,50,90,60};
    }

    public static void main(String args[]){
//calling method which returns an array
        int arr[]=get();
//printing the values of an array
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }}
 */

// 2-D(MULTI-DIMENSIONAL ARRAY)
class Arrays{
    public static void main(String args[]){
        //declaring and initializing 2D array
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
        //printing 2D array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}



