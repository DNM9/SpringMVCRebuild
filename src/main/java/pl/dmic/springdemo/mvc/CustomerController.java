package pl.dmic.springdemo.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        // add customer object to the Model
        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult) {

        System.out.println(theBindingResult.hasErrors());

        if(theBindingResult.hasErrors())
            return "customer-form";
        else return "customer-confirmation";

    }
}
