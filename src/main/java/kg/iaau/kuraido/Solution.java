package kg.iaau.kuraido;

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
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
        int length = s.length();


        int[] forward = new int[length];
        int[] backward = new int[length];

        for (int i = 0; i < length; i++) {
            forward[i] = s.charAt(i);
            backward[length - i - 1] = s.charAt(i);
        }
        System.out.println(Arrays.toString(forward));
        System.out.println(Arrays.toString(backward));

        if (length == 2) {
            if(Math.abs(forward[0] - forward[1]) == Math.abs(backward[0] - backward[1])){

                return "Funny";
            }else{
                return "Not Funny";
            }
        } else {
            if(Math.abs(forward[0] - forward[1]) !=  Math.abs(backward[0] - backward[1])){
                return "Not Funny";
            }
            if(Math.abs(forward[length - 1] - forward[length - 2]) != Math.abs(backward[length - 1] - backward[length - 2])){
                return "Not Funny";
            }
            for (int i = 1; i < length - 1; i++) {
                if( Math.abs(forward[i] - forward[i + 1]) != Math.abs(backward[i] - backward[i + 1])){
                    return "Not Funny";
                }
            }

        }


        return "Funny";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        System.out.println(Result.funnyString("acxz"));
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                String s = bufferedReader.readLine();
//
//                String result = Result.funnyString(s);
//
//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
