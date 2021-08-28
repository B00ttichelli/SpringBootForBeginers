package com.springcourse.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "firstView";
    }

    @RequestMapping("askDetails")
    public String askEmployeeDetail(Model model){

        Employee employee = new Employee();
        employee.setName("name");
        employee.setSurname("surname");
        employee.setSalary(500);
        model.addAttribute("employee",employee);
        return "ask-employe-detail-view";
    }



/*    @RequestMapping("showDetail")
    public String showEmployeeDetail(){
        return "show-employee-detail-view";
    }*/
   /* @RequestMapping("showDetail")
    public String showEmployeeDetail(HttpServletRequest request, Model model){

        String empName = request.getParameter("employeeName");
        empName = "Mr."+empName;
        model.addAttribute("nameAttribute",empName);
        model.addAttribute("description"," - sex Instructor");


        return "show-employee-detail-view";
    }*/

    @RequestMapping("showDetail")

    public String showEmployeeDetail(@Valid @ModelAttribute("employee") Employee employee , BindingResult bindingResult ){
     /*   System.out.println("surname lenght = " + employee.getSurname().length());*/
        return bindingResult.hasErrors()?"ask-employe-detail-view":"show-employee-detail-view";

    }
}
