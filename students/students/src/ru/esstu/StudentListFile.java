package ru.esstu;

import java.io.*;
import java.util.List;

public class StudentListFile implements StudentList {
    File listFile = new File("ListFile.txt"); // Создание текстового файла ListFile.txt
    static private int count = 0;
    public void testToPrintFile(){ // Вывод содержимого текстового файла
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ListFile.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e){
            System.out.println("Ошибка при чтении файла");
            e.printStackTrace();
        }
    }
    @Override
    public List<Student> getAll() {
        return null;
        // прочитать из файла
    }

    @Override
    public void add(Student student) { // Добавить студента в текстовый файл
        try{
            FileWriter writer = new FileWriter(listFile, true);
            writer.write("[" + count + "]" + " " + student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " " + student.getPartonymicName() + " " + student.getGroup() + " " + "\n");
            count++;
            writer.close();
        } catch (IOException e){
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }
    @Override
    public Student getById(String id) { // Получить студента по его id
        String studentStrNoSplit = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ListFile.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(id)){
                    studentStrNoSplit = line;
                    Student student = new Student("000","TEST","TESTOV","TESTOVICH","B761");
                    String[] wordsStudentStrNoSplit = studentStrNoSplit.split(" ");
                    student.setId(wordsStudentStrNoSplit[1]);
                    student.setFirstName(wordsStudentStrNoSplit[2]);
                    student.setLastName(wordsStudentStrNoSplit[3]);
                    student.setPartonymicName(wordsStudentStrNoSplit[4]);
                    student.setGroup(wordsStudentStrNoSplit[5]);
                    return student;
                }
            }
            reader.close();
        } catch (IOException e){
            System.out.println("Ошибка при чтении файла");
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(Student student) {

    }
}
