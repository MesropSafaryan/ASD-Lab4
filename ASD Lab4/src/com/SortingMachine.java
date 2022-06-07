package com;

public class SortingMachine {

    public void Sort(Student array[], int size) {
        Student[] output = new Student[size + 1];

        int max = array[0].GetMonthOfBirth();
        for (int i = 1; i < size; i++) {
            if (array[i].GetMonthOfBirth() > max)
                max = array[i].GetMonthOfBirth();
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }
        for (int i = 0; i < size; i++) {
            count[array[i].GetMonthOfBirth()]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i].GetMonthOfBirth()] - 1] = array[i];
            count[array[i].GetMonthOfBirth()]--;
        }
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }
}

