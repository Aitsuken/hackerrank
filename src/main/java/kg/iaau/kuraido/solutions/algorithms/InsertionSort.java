package kg.iaau.kuraido.solutions.algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        int x = arr.get(arr.size() - 1);
        int key = 0;
        for(int i = n - 2; i >= 0; i--){
            if(arr.get(i) > x){
                arr.set(i + 1, arr.get(i));
                printArray(arr);
            }else{
                arr.set(i + 1, x);
                printArray(arr);
                key++;
                break;
            }
        }
        if(key == 0){
            arr.set(0, x);
            printArray(arr);
        }

    }
    public static void printArray(List<Integer> arr){
        arr.forEach( i -> {
            System.out.print(i + " ");
        });
        System.out.println();
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}

