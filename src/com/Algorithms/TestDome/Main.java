package com.Algorithms.TestDome;

/**
 * Created by LEGACY on 02/04/2019.
 */
public class Main {

    public static class TextInput {
        String str = "";
        public void add(char c)
        {
            str = str + c;
        }
        public String getValue()
        {
            return str;
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(char c){
            switch(c){
                case '0': super.str = super.str + c;
                    break;
                case '1': super.str = super.str + c;
                    break;
                case '2': super.str = super.str + c;
                    break;
                case '3': super.str = super.str + c;
                    break;
                case '4': super.str = super.str + c;
                    break;
                case '5': super.str = super.str + c;
                    break;
                case '6': super.str = super.str + c;
                    break;
                case '7': super.str = super.str + c;
                    break;
                case '8': super.str = super.str + c;
                    break;
                case '9': super.str = super.str + c;
                    break;
            }
        }
    }

    public static void main (String[] args){
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
