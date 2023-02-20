package by.teachmeskills.siniak.homework13;

import by.teachmeskills.siniak.homework13.util.IntList.IntList;

import java.util.Scanner;
import java.util.WeakHashMap;

public class homework13 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        IntList list = new IntList(array);
        Scanner sc = new Scanner(System.in);
        System.out.println(
                """
                        Choose task:
                        1. Print list
                        2. Get Index of element
                        3. Set element
                        4. Get size of list
                        5. Add element in list 
                        6. Remove element in list   
                        7. SubList [ )
                        8. SubList [...
                        9. LastIndexOf
                        0. Exit"""
        );
        while (true) {
            System.out.println("Task number: ");
            int numTask = sc.nextInt();
            switch (numTask) {
                case 1 -> {
                    System.out.println(list.toString());
                }
                case 2 -> {
                    System.out.println("Enter index of element: ");
                    int index = sc.nextInt();
                    System.out.println(list.get(index));
                }
                case 3 -> {
                    System.out.println("Enter index of element which will change: ");
                    int index = sc.nextInt();
                    System.out.println("Enter element for change: ");
                    int element = sc.nextInt();
                    list.set(index, element);
                }
                case 4 -> {
                    System.out.println(list.size());
                }
                case 5 -> {
                    System.out.println("Enter element for add: ");
                    int element = sc.nextInt();
                    list.add(element);
                }
                case 6 -> {
                    System.out.println("Index element for remove: ");
                    int index = sc.nextInt();
                    list.remove(index);
                    System.out.println();
                }
                case 7->{
                    System.out.println("Enter start index: ");
                    int startIndexInclusive = sc.nextInt();
                    System.out.println("Enter end index: ");
                    int endIndexExclusive = sc.nextInt();
                    System.out.println("SubList: "+list.subList(startIndexInclusive,endIndexExclusive));
                }
                case 8 ->{
                    System.out.println("Enter start index: ");
                    int startIndexInclusive = sc.nextInt();
                    System.out.println("SubList: "+list.subList(startIndexInclusive));
                }
                case  9->{
                    System.out.println("Enter element for search: ");
                    int element = sc.nextInt();
                    System.out.println("Index of elemetn: "+list.lastIndexOf(element));
                }
                case 0 -> {
                    return;
                }
                default -> System.err.println("Task doesn't exist");
            }
        }
    }
}