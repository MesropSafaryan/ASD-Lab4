package com;

public class Main {

    public static void main(String[] args) {


        Student student1 = new Student("Серго", "Цвен", 11, 6, 2001);
        Student student2 = new Student("Ілля", "Сергійчук", 18, 9, 2002);
        Student student3 = new Student("Іван", "Мізюрко", 11,  4, 2003);
        Student student4 = new Student("Діана", "Радчук", 5, 4, 2001);
        Student student5 = new Student("Вікторія", "Калюшик", 10, 3, 2004);
        Student[] arr = new Student[]{student1, student2, student3, student4, student5};

        System.out.println("\nМасив до сортування: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }

        SortingMachine sorted = new SortingMachine();
        sorted.Sort(arr, arr.length);
        System.out.println("__________________________________________________");
        System.out.println("\nМасив після сортування (сортування за місяцем народження: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
