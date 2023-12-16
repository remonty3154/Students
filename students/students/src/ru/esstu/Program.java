package ru.esstu;

import java.util.Arrays;

public class Program {
    public static void main (String[] args){
        // -----------Реализация arrayList----------------
        /*
        StudentListArrayList arrayList = new StudentListArrayList();

        Student one = new Student("001","Ivan","Ivanov","Ivanovich","B761");
        Student two = new Student("002","Maksim","Ivanov","Ivanovich","B761");
        Student three = new Student("003","Kirill","Ivanov","Ivanovich","B761");

        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
         */

        //System.out.println(arrayList.getById("001").getFirstName()); // Тест получение студента по его id (Работает)

        //arrayList.delete("002");                                     // Тест удаления студента по его id (Работает)
        //arrayList.getToStringAll();

        /*                                                             // Тест обновления последнего студента в списке (Работает)
        String test_id = "Test004";
        String test_firstName = "Test1";
        String test_lastName = "Test2";
        String test_partonymicName = "Test3";
        String test_group = "TestB761";
        Student studentTest = new Student(test_id,test_firstName,test_lastName,test_partonymicName,test_group);
        arrayList.update(studentTest);
        arrayList.getToStringAll();
         */
        // --------------Реализация файл--------------
        StudentListFile listFile = new StudentListFile();
        Student one = new Student("001","Ivan","Ivanov","Ivanovich","B761");
        Student two = new Student("002","Maksim","Ivanov","Ivanovich","B761");
        //listFile.add(one);
        //listFile.add(two);
        //System.out.println(listFile.getById("004").getFirstName()); // Тест добавления студента по его id (Работает)
    }
}
