package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class StudentController {
    @RequestMapping(value = "/saveStudent",method = RequestMethod.POST)
    public String saveStu(Model model,Student student){

       // System.out.println("aa"+student);
        model.addAttribute("student",student);
        return "aa";

    }
}
