package com.Algorithms.Counting_Valleys;

class main {

    static int Counting_Valleys = 0;
    static boolean flag = false;

    public static void main(String[] args){

        System.out.println(countingValleys(8,"UDDDUDUU"));
    }

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int level_sea = 0;

        for(char c : s.toCharArray()){
            if(c == 'U'){
                level_sea++;
                checkStatus(level_sea);
            }else{
                level_sea--;
                checkStatus(level_sea);
            }
        }

        return (Counting_Valleys > 0 ? Counting_Valleys : 0);
    }
    public static void checkStatus(int level){
        if (level < 0 && flag == false) {
            Counting_Valleys++;
            flag = true;
        }else{
            if(level == 0 && flag == true){
                flag = false;
            }
        }
    }
}


