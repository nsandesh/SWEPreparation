package dsa.problems;

import java.io.*;
import java.util.*;

public class RunLengthEncoder {

    public static String rle(String input) {

        if (input.isEmpty()) return "";

        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (Character c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            stringBuilder.append(entry.getValue()).append(entry.getKey());
        }

        return stringBuilder.toString();
    }

    public static String rleInPlace(String input) {

        if ( input == null || input.isEmpty() ) return "";

        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            count++;
            if ( i + 1 == input.length() || input.charAt(i) != input.charAt(i+1)) {
                sb.append(input.charAt(i));
                sb.append(count);
                count = 0;
            }

        }

        return sb.toString();

    }


    public static void main(String[] args)  {

        if("".equals(rleInPlace("")) &&
                "a1".equals(rleInPlace("a")) &&
                "a3".equals(rleInPlace("aaa"))){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }

}
