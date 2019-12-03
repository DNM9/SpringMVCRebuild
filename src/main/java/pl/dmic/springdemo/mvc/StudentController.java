package pl.dmic.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{cityOptions}")
    private Map<String, String> cityOptions;

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        // create a student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student",theStudent);

        // add the city options to the model
        theModel.addAttribute("theCityOptions", cityOptions);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        // log the input data
        System.out.println("theStudent: " + theStudent.getFirstName());
        System.out.println("theStudent: " + theStudent.getLastName());
        System.out.println("theStudent: " + theStudent.getCountry());
        System.out.println("theStudent: " + theStudent.getCity());

        return "student-confirmation";
    }
}
