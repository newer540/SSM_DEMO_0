package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.Service.StudentService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class RegisterController {
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register( Student student, Model model){
        studentService.insertStu(student);

       // model.addAttribute("student",student);
        return "success";
    }
}
