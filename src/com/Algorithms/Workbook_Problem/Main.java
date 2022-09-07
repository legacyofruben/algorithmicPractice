package com.Algorithms.Workbook_Problem;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    private static int count;
    private static int[] a_count;
    private static int no_page=1;
    private static int no_chapter=1;
    private static int special = 0;
    private static ArrayList<chapter> result = new ArrayList<chapter>();
    private static int index=0;


    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(in);
        int no_chapters = scan.nextInt();
        int problemsXpage = scan.nextInt();

        for (int i=1;i<=no_chapters;i++){
            count =scan.nextInt();
            fillcount();
            while(count>0){
                result.add(new chapter(no_chapter,fillArray2(problemsXpage)));
                if(count==0) {
                    no_chapter++;
                    index=0;
                }
                no_page++;
            }
            }
        System.out.println(special);
        }
    public static void fillcount(){
        a_count = new int[count];
        for(int i =0; i<count; i++){
            a_count[i] = i+1;

        }
    }
    public static int[] fillArray2(int problemsXpage ){
        int[] array = null;
        array=(count<problemsXpage)?new int[count]:new int[problemsXpage];
        for(int i =0; count>0 && i<array.length; i++){
            array[i] = a_count[index];
            if(array[i] == no_page)
                special++;
            count--;
            index++;
        }
        return array;
    }

}
class chapter{
    int no_Chapter;
    int[] problems;

    public chapter(int no_Chapter, int[] problems) {
        this.no_Chapter = no_Chapter;
        this.problems = problems;
    }
}

/*while(count > 0){
                if(div >= 0 && mod > 0){
                    rest = count - xpage;
                    if(rest > 0 && xpage > rest){
                        result.add(new chapter(num_chapter,num_page,fillArray(xpage,num_page)));
                        num_page++;
                        count-=xpage;
                        div--;
                    }else{
                        result.add(new chapter(num_chapter,num_page,fillArray(count,num_page)));

                        count = 0;
                        num_chapter++;
                        num_page++;
                    }
                }else {
                    result.add(new chapter(num_chapter,num_page,fillArray(xpage,num_page)));

                    count-=xpage;
                    num_page++;
                    if(count == 0){
                        num_chapter++;
                    }
                }
            }*/
