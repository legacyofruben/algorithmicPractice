package com.Algorithms.IBM.Interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcess {
    /**
     * Write a method that, given an input string:  aaaabbccc, it determines if it is shorter than a string with the format: a4b2c3.
     * Input strings samples:
     *      ab;  a1b1
     *      aabbcccd; a2b2c3d1
     */
    public static String processString(String input){
        int runner = 0;
        int index = 0;
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = input.toCharArray();

        while(runner < array.length){
            if(array[index] == array[runner]){
                counter++;
                runner++;
            }else{
                stringBuilder.append(array[index]).append(counter);
                counter=0;
                index = runner;
            }
        }

        return stringBuilder.append(array[index]).append(counter).toString();
    }
}
class StringProcessTest{
    @Test
    public void processStringTest(){
        assertEquals("a1b1",
                StringProcess.processString("ab"));
        assertEquals("a2b2c3d1",
                StringProcess.processString("aabbcccd"));
        assertEquals("a2b2c3d1a2",
                StringProcess.processString("aabbcccdaa"));
    }
}
