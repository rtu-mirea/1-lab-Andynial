package com.company;
import java.util.Scanner;
/*
        Упорядочить элементы массива по правилу:
        сначала все числа, у которых последняя цифра равна 1,
        затем числа, у которых последняя цифра равна 2 и так
        далее до 9.*/
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Введите значение: ");
        int zad = scan.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Введите " + ( i + 1) + "-е значение массива:");
            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == max)
                count++;

        if (count > zad)
            System.out.println("Максимальное значение встречается больше заданного числа.");
        else
            System.out.println("Максимальное значение встречается меньше заданного числа.");

        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j]%10 > arr[j+1]%10)
                {
                    int buff= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buff;
                }
        System.out.println("Отсортированный массив:");
        for (int i = 1; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
