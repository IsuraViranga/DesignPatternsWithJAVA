import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

      Scanner sc  = new Scanner(System.in);
      System.out.println("enter word name");
      String word = sc.nextLine();
      System.out.println("enter check name");
      String checkWord = sc.nextLine();

      Map<Character,Integer> letterCount = new HashMap();
      for(int i=0;i<checkWord.length();i++){
        letterCount.put(checkWord.charAt(i),letterCount.getOrDefault(checkWord.charAt(i),0)+1);
      }

      System.out.println(letterCount);
      int[] x = {1,2,3};
      int[] y = new int[4];
      int[][] f = {{1,2,3},{1,2,3}};


















      //int[] arr = {23,10,3,1,20};
      //App.bubbleSort(arr);
      //App.selectionSort(arr);
      //App.insertionSort(arr);
      // mergeSort(arr, 0, arr.length - 1);
      //pracMergeSort(arr,0,arr.length-1);
      //pracQuickSort(arr,0,arr.length-1);
      //App.print(arr);

      // /The Singleton Design Pattern is a creational design pattern that ensures a class has only one instance and provides a global point of access to that instance.
      //System.out.println(Singleton.getInstance());

      //The Factory Method is a creational design pattern used to create objects without directly specifying the exact class to instantiate.
      //VehicleFactory vehiclee = new VehicleFactory();
      //vehiclee.getVehicletoDrive("car").drive();
      
      //Adapter allows two incompatible classes/interfaces to work together.
      //Paypal paypal =new Paypal();
      //paypal.payPalPayment();
      //Payment payment = new PaypalAdapter(new Paypal());
      //payment.pay();

      //Decorator adds new behavior to an existing object without modifying its original class.
      //Coffe coffe = new SimpleCoffe();
      //coffe=new MilkCoffe(coffe);
      //System.out.println(coffe.getDescription());
      //System.out.println(coffe.getCost());

      //Observer Pattern allows one object to notify multiple other objects when its state changes.
      //YoutubeChannel youtubeChannel =new YoutubeChannel();
      //UserOne userOne = new UserOne("isura");
      //UserOne userTwo = new UserOne("gayani");
      //youtubeChannel.addObserver(userOne);
      //youtubeChannel.addObserver(userTwo);
      //youtubeChannel.updateNewVideo("spiderman");

      //Strategy Pattern allows you to define multiple ways of doing something and choose the required one at runtime.
      //PaymentService paymentService =new PaymentService(new PaypalPayment());
      //paymentService.paymentProcess(350);
      //PaymentService paymentServiceTwo =new PaymentService(new CardPayment());
      //paymentServiceTwo.paymentProcess(10000.01);

      //int[] x ={20,30,40,50,60,70,80,90,100};
      //System.out.println(binarySearch(x, 0, x.length-1, 200));
      //binarySerachUsingWhile(x);
       
    }

    static void pracQuickSort(int[] arr,int left,int right){
      if(left >= right){
        return;
      }
      int pivot = pivotPlace(arr,left,right);
      pracQuickSort(arr,left,pivot-1);
      pracQuickSort(arr, pivot+1, right);
    }

    static int pivotPlace(int[] arr,int left,int right){
      int pivot =arr[left];
      int leftPass=left+1;
      while (leftPass<=right) {
        while (leftPass<=right && arr[leftPass]<pivot ) {
          leftPass++;
        }
        while (leftPass<=right && arr[right]>= pivot ) {
          right--;
        }
        if(leftPass<=right){
          int temp = arr[leftPass];
          arr[leftPass]=arr[right];
          arr[right]=temp;

          leftPass++;
          right--;
        }
      }
        int temp = arr[right];
        arr[right]=pivot;
        arr[left]=temp;
      return right;
    }

// practice
    static void binarySerachUsingWhile(int[] x){
      int left=0,right=x.length-1,number =80;
      while (right>= left) {
        int mid = left + (right-left)/2;
        if(x[mid]==number){
          System.out.println("done");
          break;
        }else if(x[mid]>number){
          right=mid-1;
        }else if(x[mid]<number){
          left=mid+1;
        }
      }
    }

    static int binarySearch(int[] getX,int left,int right,int number){
      if(getX.length==0){
        return -1;
      }
      int mid = left + (right - left) / 2;
      if(getX[mid]==number){
        return mid;
      }else if(number<getX[mid]){
        if((mid-1)<left)
        {
          return -1;
        }
        return binarySearch(getX, left, mid-1, number);
      }else if(number>getX[mid]){
        if((mid+1)>right)
        {
          return -1;
        }
        return binarySearch(getX, mid+1,right, number);
      }
      return -1;
    }

    static int[] bubbleSort(int[] arr ){
       for(int i=0;i<arr.length-1;i++){
        for(int x =0;x<arr.length-(i+1);x++){
          if(arr[x]>arr[x+1]){
            int temp = arr[x+1];
            arr[x+1]=arr[x];
            arr[x]=temp;
          }
        }
      }
      return arr;
    }

    static void print(int[] arr){
      for(int z : arr){
        System.out.println(z);
      }
    }

    static int[] selectionSort(int[] arr){
      for(int i=0;i<arr.length-1;i++){
        int min = i;
        for(int x=i+1;x<arr.length;x++){
          if(arr[x]< arr[min]){
            min=x;
          }
        }
        int temp = arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
      }
      return arr;
    }

    static void insertionSort(int[] arr) {
      for (int i = 1; i < arr.length; i++) {
          int key = arr[i];
          int j = i - 1;
          while (j >= 0 && arr[j] > key) {
              arr[j + 1] = arr[j];
              j--;
          }
          arr[j + 1] = key;
      }
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    static void pracMergeSort(int[] arr,int left,int right){
      if(right<=left){
        return;
      }
      int mid = left+(right-left)/2;
      pracMergeSort(arr, left, mid);
      pracMergeSort(arr, mid+1, right);
      mergeTwoSortArrays(arr,left,mid,right);
    }

    static void mergeTwoSortArrays(int[]arr,int left,int mid,int right){
      int[] newSortArray = new int[arr.length];
      for (int x =0; x<arr.length;x++) {
        newSortArray[x]=arr[x];
      }
      int k=left;
      int lowOne =left;
      int highOne =mid;
      int lowTwo=mid+1;
      int highTwo=right;

      while (lowOne<=highOne && lowTwo<=highTwo) {
        if(arr[lowOne]<=arr[lowTwo]){
          newSortArray[k]=arr[lowOne];
          lowOne++;
        }else{
          newSortArray[k]=arr[lowTwo];
          lowTwo++;
        }
         k++;
      }
      while (lowOne<=highOne) {
        newSortArray[k]=arr[lowOne];
        k++;
        lowOne++;
      }
      while (lowTwo<=highTwo) {
        newSortArray[k]=arr[lowTwo];
        k++;
        lowTwo++;
      }
      for (int x =0; x<newSortArray.length;x++) {
        arr[x]=newSortArray[x];
      }
    }

}
