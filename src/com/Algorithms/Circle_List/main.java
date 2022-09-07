package com.Algorithms.Circle_List;

class main {

    private static int[] array = new int[]{7,8,9,10,1,2,3,11,12,6};

    public static void main (String[] args){

        int pivot = 0;
        int count = 0;
        int sumMax = 0;
        int index = 0;
        boolean flag = true;
        boolean flagPivot = false;
        boolean last = false;
        pivot = getValue(index);
        while (flag && last == false ) {

            if(index == 9){
                if ((getValue(index) + 1) == getValue(0)){
                    count += getValue(index);
                }else{
                    count += getValue(index);
                    if(count > sumMax) {
                        sumMax = count;
                    }
                }
            }else{
                if ((getValue(index) + 1) == getNext(index) && last == false){
                    count += getValue(index);
                }else{
                    if((getValue(index) + 1) != getNext(index) && last == false){
                        count += getValue(index);
                        if(count > sumMax) {
                            sumMax = count;
                        }
                        count = 0;

                        if(last){
                            flag = true;
                        }

                    }else{
                        if ((getValue(index) + 1) == getNext(index) && last == true){
                            count += getValue(index);
                        }else{
                            count += getValue(index);
                            if(count > sumMax) {
                                sumMax = count;
                            }
                            count = 0;
                            if(last){
                                flag = true;
                            }
                        }
                    }

                    //continue;
                }
            }


            if (index == 9) {
                index = 0;
            }else{
                index++;
                if ( last == false && getValue(index + 1) == pivot)  {
                    last = true;
                }
            }


        }

        System.out.println(sumMax);
    }
    public static int getValue (int index){
        return array[index];
    }
    public static int getNext(int index){
        return array[index+1];
    }
}
