package company.Java;
import java.util.*;
public class day8A {

    public static int linear_Search(int numbers[], int key) {
        for(int i=0; i<=numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i< numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " +smallest);
        return largest;
    }

    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
       int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] +" ");

        }
    }
}
