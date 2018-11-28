package Lb1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class EntryPoint {

    public static void main(String[] args) throws IOException {

        int[] numbers = inputOfNubmers(5);
        for (int i = 0; i < numbers.length; i++);{
            System.out.print(numbers[1]  + " ");
        }
    System.out.println();
    System.out.println(Arrays.toString(numbers));
    int[] res = sort(numbers);
    System.out.println(Arrays.toString(res));
    }

    public static  int [] inputOfNubmers (int size) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[size];
        for (int i=0; i < arr.length; i++ ) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }

    public static int[] sort (int[] numbers) {

        int[] temp = numbers;
        int[] result = new int[numbers.length];
        int size = numbers.length;
        while (size > 0 ){
            int tempNumber = temp[0];
            for(int i = 0; i < temp.length - 1; i++){
                if(temp[i] > temp[i+1]){
                    tempNumber = temp[1];
                    temp[i] = temp[i+1];
                    temp[i+1] = tempNumber;
                }
            }
            result[size-1] = temp[temp.length - 1];
            size--;
            int[] tempArr = temp;
            temp = new int[size];
            for (int i = 0; i < tempArr.length - 1; i++){
                temp[i] = tempArr[i];
            }
        }
        return result;
    }
}

//    private static void main(String[] args) throws IOException {

//        BufferedRыeader reader = new BufferedReader(new InputStreamReader(System.in));
//        int[] numeral = new int[5];
//        System.out.println("Please write first value ");
//        for (int c = 0; c < numeral.length; c++) {
//           System.out.println(numeral[c] + " ");
//            numeral[c] = Integer.parseInt(reader.readLine());
//            if (c == 0)
//                System.out.println("Please write second value " );
//            if (c == 1)
//                System.out.println("Please write third value ");
//            if (c == 2)
//                System.out.println("Please write fourth value ");
//            if (c == 3)
//                System.out.println("Please write fifth value ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(numeral));
//        int[] res = sort(numeral);
//
//        private static int[] sort(int[] numberal){
//
//            int [] temp = numberal;
//            int [] result = new int[numberal.length];
//            int size = numberal.length;
//            while(size > 0) {
//                int tempNumber = temp[0];
//                for (int c = 0; c < temp.length - 1; c++)
//                    if (temp[c] > temp[c + 1]) {
//                        tempNumber = temp[c];
//                        temp[c] = temp[c + 1];
//                        temp[c + 1] = tempNumber;
//                    }
//            }
//
//        }
//
//    }