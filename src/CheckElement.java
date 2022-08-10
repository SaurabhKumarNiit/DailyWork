import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class CheckElement {
public boolean binarySearch(int[] arr,int searchElement){
    int start=0;
    int end=arr.length;
    //for(start=0;start<=end;start++){
   while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==searchElement){
            return true;
        }
                else if (searchElement<arr[mid]){
                    end=mid-1;
        }else{
                    start=end+1;
        }
    }

    return false;
}



    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int[] sorted = {10,20, 30, 40, 50, 60, 70,90,100};

        CheckElement obj = new CheckElement();
        System.out.println("Enter your Element");
        int searchElement = scan.nextInt();

        int start = 0;
        int end = sorted.length - 1;

//System.out.println("obj.binarySearch (sorted, start, end, searchElement) =

       boolean result = obj.binarySearch (sorted, searchElement);
        if (result) {

            System.out.println("element found");
        }
        else {

            System.out.println("not found");

        }
        


}
}
