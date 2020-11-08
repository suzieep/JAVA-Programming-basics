package HW.HW5;

import java.util.*;

public class Hw5_1 {


    public static void main(String[] args) {

        Integer[] arrInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        Double[] arrLong = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0 };
        BinarySearch<Integer> binaryInt = new BinarySearch<Integer>();
        BinarySearch<Double> binaryDouble = new BinarySearch<Double>();
        System.out.println("{ 1, 2, 3, ... 18, 19, 20 } 배열에 15가 있는가?");
        System.out.println(binaryInt.BSearch(arrInt,(Integer)15));

        System.out.println("{ 1.0, 2.0, ... 19.0, 20.0 } 배열에 14.5가 있는가?");
        System.out.println(binaryDouble.BSearch(arrLong,(Double)14.5));

        System.out.println("{ 1.0, 2.0, ... 19.0, 20.0 } 배열에 15.0이 있는가?");
        System.out.println(binaryDouble.BSearch(arrLong,(Double)15.0));



    }
}

class BinarySearch <T extends Comparable<T>> {
    
    
    public static <T extends Comparable<T>> int isGreater(T a, T b) {
        if (a.compareTo(b) > 0) {
            return 1;
        } else if (b.compareTo(a) > 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean BSearch(T[] arr, T target) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            //Box<T> myNum = new Box<>(arr[mid]);
            //Box<T> targetNum = new Box<>(target);
            if (arr[mid].compareTo(target)==0)
                return true;

                //isGreater(myNum.getClass(), targetNum.getClass())==1
            else if (arr[mid].compareTo(target)>0){
                high = mid - 1;}
            else
                low = mid + 1;
        }
        return false;

    }

}

class Box<T> {
    T value;

    public Box(T v) {
        value = v;
    }

    public T getValue() {
        return value;
    }

}
