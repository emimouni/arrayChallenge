package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int grades[] = new int[1000];
        boolean b = true;
        int i = 0;
        int response;
        while (b == true){
            System.out.println("Enter a grade");
            response = kb.nextInt();
            if (response <= (-1)){
                b = false;
            }else {
                grades[i] = response;
                i++;
            }1
        }
        int j;
        int sum = 0;
        for (j = 0; j < grades.length; j++)
        {
            sum = sum + grades[j];
        }
        int average = sum / i;
        System.out.println(average);
    }
}
