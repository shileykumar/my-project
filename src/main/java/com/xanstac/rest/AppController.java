package com.xanstac.rest;

import com.xanstac.domain.ContactUs;
import com.xanstac.domain.User;
import com.xanstac.repository.ContactRepository;
import com.xanstac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class AppController {

    @Autowired
    private UserService userService;

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("")
    public ModelAndView homePage() {
        return new ModelAndView("index");
    }

    @GetMapping("/register")
    public ModelAndView showRegistrationForm() {
        return new ModelAndView("registration","user",new User());
    }

    @PostMapping("/create")
    public ModelAndView createUser(@ModelAttribute User user) {
        userService.save(user);
        return new ModelAndView("registration-success");
    }

    @GetMapping("/items")
    public ModelAndView item() {
        return new ModelAndView("item");
    }

    @GetMapping("/contact-us")
    public ModelAndView contactUsForm() {
        return new ModelAndView("contact-us", "contact", new ContactUs());
    }

    @PostMapping("/contact-us/create")
    public ModelAndView createContactUs(@ModelAttribute ContactUs contactUs) {
        contactRepository.save(contactUs);
        return new ModelAndView("contact-us");
    }
}
