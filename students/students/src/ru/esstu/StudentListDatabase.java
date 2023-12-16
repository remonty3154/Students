package ru.esstu;

import java.util.List;

public class StudentListDatabase implements  StudentList{
    @Override
    public List<Student> getAll() {
        // select * from student
        return null;
    }

    @Override
    public void add(Student student) {

    }

    @Override
    public Student getById(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(Student student) {

    }
}
