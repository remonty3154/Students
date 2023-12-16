package ru.esstu;

import java.util.List;

public interface StudentList {
    List<Student> getAll();

    void add(Student student);

    Student getById(String id);

    void delete(String id);

    void update(Student student);
}
 // Создать три реализации интерфейса StudentList используя ArrayList, файл и БД.
 // Написать консольную программу для работы с этим интерфейсом
// 1. Получить список
// 2. Добавить
// 3. Редактировать
// 4. Удалить

