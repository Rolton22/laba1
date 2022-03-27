package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
    }



    /** 29
     * Даны вещественное число а и натуральное число n.
     * Вычислить Р = а(а + 1) ... (а + n – 1).*/

    private static void task1() {
        //Даны вещественное число а и натуральное число n. Вычислить P = a(a+1)...(a+n-1).
        System.out.println("Task_1");
        Scanner Scanner = new Scanner(System.in);
        int a, n;
        System.out.print("Enter a: ");
        a = Scanner.nextInt();
        System.out.print("Enter n: ");
        n = Scanner.nextInt();
        double P = a * (a+1);
        for(int i = 1; i < n; i++)
        {
            P *= (a+i);
        }
        System.out.println(P);
    }
    private static void task2() {
        //Вычислить сумму: 1 + 1/2 + 1/3 + ... + 1/n.
        System.out.println("Task_2");
        Scanner Scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = Scanner.nextInt();
        double S = 1;
        for(int i = 2; i <= n; i++)
        {
            S += (double)1/i;
        }
        System.out.println(S);
    }
    private static void task3(){
        //S = 1/a + 1/a^2 + 1/a^4 + ... + 1/a^(2n-2)
        System.out.println("Task_3");
        Scanner Scanner = new Scanner(System.in);
        int a, n;
        System.out.print("Enter a: ");
        a = Scanner.nextInt();
        System.out.print("Enter n: ");
        n = Scanner.nextInt();
        double S = 0.5;
        for(int i = 2; i <= (2*n-2); i+=2)
        {
            S += 1/Math.pow(a, i);
        }
        System.out.println(S);
    }
    //В области K районов. Известны количество жителей (в тыс. чел.) и плотность населения (тыс. чел./км2) каждого района.
    // Определить самый густонаселённый район области.
    private static void task4() {
        System.out.println("Task_4");
        int k = (int)(Math.random()*50+1);
        int density = 0, point = 0, a, b, c = 0;
        for (int i = 0; i < k; i++) {
            point++;
            a = (int)(Math.random()*100+1);
            b = (int)(Math.random()*5+1);
            if(a/b > density) {
                density = a/b;
                c = point;
            }
        }
        System.out.println("самый густонаселённый район области: " + c);

    }
    private static void task5() {
        {
            boolean f = false;
            int n, d, s, i;

            for (i = 1000; i < 10000; i++) {
                n = i; s = 0;
                while (n!=0) {
                    d = n%10;
                    s += d*d*d*d*d;
                    n /= 10;
                }
                if (s == i) {
                    f = true;
                    break;
                }
            }

            if (f)
                System.out.println("Yes. N = " + i);
            else
                System.out.println("No.");
        }
    }
}





