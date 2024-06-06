package com.asrtek.basicjava;

public class ForEachLoop {

    public static void main(String[] args) {
        String[] nameArray = {"Sami Vai", "Arif Vai", "Rana Vai", "Riyad Vai"};

        System.out.println(nameArray.length); // 4

        System.out.println(nameArray[0]);
        System.out.println(nameArray[1]);
        System.out.println(nameArray[2]);

        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }
        System.out.println("-------------------------------");

        String search = "Sami Vai";
        for (String name1 : nameArray) {
            if (name1.equals(search)) {
                System.out.println(name1);
                break;
            }
        }

        // Remove a name
        String nameToRemove = "Sami Vai";
        nameArray = removeNameFromArray(nameArray, nameToRemove);

        // Display the updated name array
        for (String name : nameArray) {
            System.out.println(name);
        }
    }

    public static String[] removeNameFromArray(String[] array, String nameToRemove) {
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(nameToRemove)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            String[] newArray = new String[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != indexToRemove) {
                    newArray[j++] = array[i];
                }
            }
            return newArray;
        }
        return array;
    }
}
