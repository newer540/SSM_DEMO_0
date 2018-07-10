package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.StudentDao;
import web.Student;

@Service
public class StudentService {
   @Autowired
    StudentDao studentDao;



   public  void insertStu(Student student){
       studentDao.insertStu(student);
   }
    public void deleteStuById(int stuId){
       studentDao.deleteStuById(stuId);
    }
    public Student selectStuById(int stuId){
       return  studentDao.selectStuById(stuId);
    }
    public void updateNameById(String name,int stuId){
       studentDao.updateNameById(name,stuId);
    }

}
