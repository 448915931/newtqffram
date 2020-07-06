package com.tqfframe.test.algorihm;


/**
 * Created by Tang-QiFeng on 2020/7/4
 */
public class Sort {
    public static void main(String[] args) {
        int data[]={5,1,2,3,6,8,7,6,9,11,10};
        //冒泡排序
//        bubblin(data);
        //选择排序
//        choose(data);
        //插入排序
//        insert(data);
        //归并排序
        merge(data);

        for(int info:data){
            System.out.println(info);
        }
    }

    //每次从第一个开始相邻两个比较，大的往后走，直到最后。找最大放后面
    public static int [] bubblin(int[] data){
        for(int i=0;i<data.length;i++){             //遍历次数
            for(int j=0;j<data.length-i-1;j++){     //j=0表示每次都从第一位开始遍历
                if(data[j]>data[j+1]){
                    int tmp=data[j+1];             //交换位置
                    data[j+1]=data[j];
                    data[j]=tmp;
                }
            }
        }
        return data;
    }

    //先找最小的放一号，再找最小的放二号依次排序，找小放前面
    public static int [] choose(int[] data){
        for(int i=0;i<data.length;i++){         //遍历次数
            for(int j=i;j<data.length-1;j++){     //j=i表示每次都从i位开始遍历，j++往后遍历
               int minValue=data[i];
               int index=i;                 //记录已经到达的下标和用于交换位置
                if(data[j+1]<minValue){     //如果下一个比最小的值小，就交换位置
                    minValue=data[j+1];
                    index=j+1;
                }
                data[index]=data[i];        //交换位置
                data[i]=minValue;
            }
        }
        return data;
    }

    public static int [] insert(int[] data){
        for(int i=0;i<data.length;i++){         //遍历次数
           if(i>0){                                //第一个不需要比较
               for(int j=i;j>0;j--){            //遍历到i+1处,j--表示往前遍历
                   if(data[j]<data[j-1]){          //如果当前值小于前面值，就交换位置
                       int tep=data[j-1];
                       data[j-1]=data[j];
                       data[j]=tep;
                   }
               }
           }
        }
        return data;
    }

    public static int [] merge(int[] data){
        merge_solve(data,0,data.length);
        return data;
    }

    static void merge_solve(int [] data,int start,int end) {

    }

















}
