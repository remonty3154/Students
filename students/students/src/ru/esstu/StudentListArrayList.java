package ru.esstu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentListArrayList implements StudentList {
    private List<Student> studentArrayList = new ArrayList<Student>(); // Создание списка ArrayList
    @Override
    public List<Student> getAll() { // Получить список ArrayList
        return studentArrayList;
    }

    @Override
    public void add(Student student) { // Добавление студента в список ArrayList
        studentArrayList.add(student);
    } // Добавить студента в список ArrayList

    @Override
    public Student getById(String id) { // Получить студента по его id
        for (int i = 0; i < studentArrayList.size(); i++){
            Student student = studentArrayList.get(i);
            if (Objects.equals(student.getId(), id)){
                return studentArrayList.get(i);
            }
        }
        return null;
    }

    @Override
    public void delete(String id) { // Удаление по id студента из списка ArrayList
        for (int i = 0; i < studentArrayList.size(); i++){
            Student student = studentArrayList.get(i);
            if (Objects.equals(student.getId(), id)){
                    studentArrayList.remove(i);
            }
        }
    }

    @Override
    public void update(Student student) { // Обновить данные последнего студента
        studentArrayList.get(studentArrayList.size() - 1).setId(student.getId());
        studentArrayList.get(studentArrayList.size() - 1).setGroup(student.getGroup());
        studentArrayList.get(studentArrayList.size() - 1).setFirstName(student.getFirstName());
        studentArrayList.get(studentArrayList.size() - 1).setLastName(student.getLastName());
        studentArrayList.get(studentArrayList.size() - 1).setPartonymicName(student.getPartonymicName());
    }

    public void getToStringAll(){ // Вывод списка arrayList
        for (int i = 0; i < studentArrayList.size(); i++){
            System.out.println("{" + "id: " + studentArrayList.get(i).getId() + "; " + "firstName: " + studentArrayList.get(i).getFirstName() +
                    "; " + "lastName: " + studentArrayList.get(i).getLastName() +
                    "; " + "partonymicName: " + studentArrayList.get(i).getPartonymicName() +
                    "; " + "group: " + studentArrayList.get(i).getGroup() + "}" );
        }
    }
}
