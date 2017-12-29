package jp.ac.uryukyu.ie.week1.pair30;
import java.util.*;
public class Ex1_2{
    public static void main(String[] args){
        String data = "パタトクカシーー";
        int num = data.length();
        char[] red= new char[num/2];
        extraction(data,num,red);
        }
    public static void extraction(String data,int num,char[] red){
        int x=0;
        for(int i=1;i<num;i += 2){
            char w = data.charAt(i);
            red [x]= w;
            x++;
        }
        System.out.println(red);
    }
}
