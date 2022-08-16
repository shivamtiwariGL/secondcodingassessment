package com.java;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloController {

  @RequestMapping("/hello")

  public String display(@RequestParam("name") String name,@RequestParam("pass") String pass,@RequestParam("empId") String empId,@RequestParam("designation") String designation,@RequestParam("salary") Double salary, Model m)

  {

    if(pass.equals("admin"))

    {

      String msg="Hello "+ name;
      String password = "Password " + pass;
      String employeeId = "EmpId" + empId
      String dept = "Designation: " + designation;
      String sal = "Salary " + salary;
   

      //add a message to the model

      m.addAttribute("message", msg);
      m.addAttribute("password", password);
      m.addAttribute("EmpId", EmployeeId );
      m.addAttribute("Designation", dept);
      m.addAttribute("Salary", sal);
      

      return "viewpage";

    }

    else

    {

      String msg="Sorry "+ name+". You entered an incorrect password";

      m.addAttribute("message", msg);

      return "errorpage";

    }

  }

}



