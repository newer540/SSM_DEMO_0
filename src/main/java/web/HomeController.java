package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.DAO.StudentDao;

@Controller
public class HomeController {
    @Autowired
    StudentDao studentDao;
    @RequestMapping(value = "/homePage",method = RequestMethod.GET)
    public String homeMethod(Model model){
        Student student=new Student();
        student.setStuId(123);
        model.addAttribute(student);
        return "home";
    }

}
