package org.example.MultiThreading.PrintNumbers1to100;

public class Client {
    public static void main(String[] args) {
        //create object of task class and pass it to thread obj
        // we need to print numbers from 1 to 100 so task is to print a number from each thread
        // so we have 100 tasks and we will create 100 threads
        for (int i=1;i<=100;i++){
            NumbersPrinter printer=new NumbersPrinter(i);
            Thread t=new Thread(printer);
            t.start();
        }
    }
}
//Numbers are not printed in order as multithreading does not give order
//It perform every task asynchronously :process that operates independently of the main program flow
/*
OUTPUT:
Number is 56 printed by thread Thread-55
Number is 52 printed by thread Thread-51
Number is 16 printed by thread Thread-15
Number is 14 printed by thread Thread-13
Number is 50 printed by thread Thread-49
Number is 71 printed by thread Thread-70
Number is 58 printed by thread Thread-57
Number is 28 printed by thread Thread-27
Number is 25 printed by thread Thread-24
Number is 33 printed by thread Thread-32
Number is 47 printed by thread Thread-46
Number is 53 printed by thread Thread-52
Number is 18 printed by thread Thread-17
Number is 49 printed by thread Thread-48
Number is 22 printed by thread Thread-21
Number is 64 printed by thread Thread-63
Number is 32 printed by thread Thread-31
Number is 35 printed by thread Thread-34
Number is 15 printed by thread Thread-14
Number is 31 printed by thread Thread-30
Number is 57 printed by thread Thread-56
Number is 12 printed by thread Thread-11
Number is 34 printed by thread Thread-33
Number is 73 printed by thread Thread-72
Number is 17 printed by thread Thread-16
Number is 13 printed by thread Thread-12
Number is 20 printed by thread Thread-19
Number is 60 printed by thread Thread-59
Number is 6 printed by thread Thread-5
Number is 10 printed by thread Thread-9
Number is 19 printed by thread Thread-18
Number is 51 printed by thread Thread-50
Number is 70 printed by thread Thread-69
Number is 2 printed by thread Thread-1
Number is 54 printed by thread Thread-53
Number is 38 printed by thread Thread-37
Number is 4 printed by thread Thread-3
Number is 42 printed by thread Thread-41
Number is 24 printed by thread Thread-23
Number is 61 printed by thread Thread-60
Number is 8 printed by thread Thread-7
Number is 36 printed by thread Thread-35
Number is 37 printed by thread Thread-36
Number is 48 printed by thread Thread-47
Number is 62 printed by thread Thread-61
Number is 59 printed by thread Thread-58
Number is 45 printed by thread Thread-44
Number is 67 printed by thread Thread-66
Number is 63 printed by thread Thread-62
Number is 27 printed by thread Thread-26
Number is 1 printed by thread Thread-0
Number is 39 printed by thread Thread-38
Number is 66 printed by thread Thread-65
Number is 3 printed by thread Thread-2
Number is 65 printed by thread Thread-64
Number is 30 printed by thread Thread-29
Number is 43 printed by thread Thread-42
Number is 11 printed by thread Thread-10
Number is 76 printed by thread Thread-75
Number is 69 printed by thread Thread-68
Number is 9 printed by thread Thread-8
Number is 74 printed by thread Thread-73
Number is 75 printed by thread Thread-74
Number is 72 printed by thread Thread-71
Number is 5 printed by thread Thread-4
Number is 44 printed by thread Thread-43
Number is 68 printed by thread Thread-67
Number is 41 printed by thread Thread-40
Number is 21 printed by thread Thread-20
Number is 29 printed by thread Thread-28
Number is 46 printed by thread Thread-45
Number is 7 printed by thread Thread-6
Number is 55 printed by thread Thread-54
Number is 26 printed by thread Thread-25
Number is 40 printed by thread Thread-39
Number is 23 printed by thread Thread-22
Number is 77 printed by thread Thread-76
Number is 79 printed by thread Thread-78
Number is 84 printed by thread Thread-83
Number is 87 printed by thread Thread-86
Number is 78 printed by thread Thread-77
Number is 89 printed by thread Thread-88
Number is 82 printed by thread Thread-81
Number is 85 printed by thread Thread-84
Number is 80 printed by thread Thread-79
Number is 83 printed by thread Thread-82
Number is 81 printed by thread Thread-80
Number is 88 printed by thread Thread-87
Number is 91 printed by thread Thread-90
Number is 92 printed by thread Thread-91
Number is 95 printed by thread Thread-94
Number is 96 printed by thread Thread-95
Number is 99 printed by thread Thread-98
Number is 100 printed by thread Thread-99
Number is 90 printed by thread Thread-89
Number is 93 printed by thread Thread-92
Number is 94 printed by thread Thread-93
Number is 97 printed by thread Thread-96
Number is 98 printed by thread Thread-97
Number is 86 printed by thread Thread-85
 */