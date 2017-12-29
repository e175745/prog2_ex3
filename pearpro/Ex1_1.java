package jp.ac.uryukyu.ie.week1.pair30;
import java.util.*;
import java.util.Scanner;
public class Ex1_1{
    public static void main(String[] args){
        String data = "stressed";
        int num = data.length();
        char[] redata = new char[num] ;
        for(int i =0;i<num;i++){
            redata[i] = data.charAt(i);
        }
        revers(redata,num);
    }
    public static void revers(char[] data,int num){
        for(int j= num -1;j>=0;j--){
            System.out.print(data[j]);
        }
    }
}
