package web.DAO;

import Mapper.StudentMapper;
import web.Student;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    private SqlSession sqlSession;
    private StudentMapper studentMapper;

    @Autowired
    public StudentDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
        studentMapper = this.sqlSession.getMapper(StudentMapper.class);
    }

    public void insertStu(Student student) {
        studentMapper.insertStu(student);
    }

    public void deleteStuById(int stuId) {
        studentMapper.deleteStuById(stuId);
    }

    public Student selectStuById(int stuId) {
        return studentMapper.selectStuById(stuId);

}

    public void updateNameById(String name, int stuId) {
        studentMapper.updateNameById(name, stuId);

    }

}
