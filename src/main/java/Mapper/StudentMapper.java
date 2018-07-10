package Mapper;

import web.Student;

public interface StudentMapper {
    void insertStu(Student student);
    void deleteStuById(int stuId);
    Student selectStuById(int stuId);
    void updateNameById(String name,int stuId);



}
