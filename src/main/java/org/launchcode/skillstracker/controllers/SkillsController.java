package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class SkillsController {


    @GetMapping
    @ResponseBody
    public String greeting() {
        return  "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here's a list of programming skills:</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>JavaScript</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }



    @GetMapping("form")
    @ResponseBody
    public String favProgrammingLangForm() {
        return  "<html>" +
                "<body>" +
                "<form method = 'post'>" +
                "<label for='name'>Name:</label>" +
                "<input type='text' name='name' id='name'>" +
                "<p></p>" +

                "<label for='programmingLang1'>My favorite language:</label>" +
                "<select name='programmingLang1'>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "</select>" +
                "<p></p>" +

                "<label for='programmingLang2'>My second favorite language:</label>" +
                "<select name='programmingLang2'>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "</select>" +
                "<p></p>" +

                "<label for='programmingLang3'>My third favorite language:</label>" +
                "<select name='programmingLang3'>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "</select>" +
                "<p></p>" +

                "<input type='submit' value='See my results!'>" +

                "</form>" +
                "</body>" +
                "</html>";
    }


    @PostMapping("form")
    @ResponseBody
    public String showFavoriteLangs(@RequestParam String name, @RequestParam String programmingLang1,
                                    @RequestParam String programmingLang2,
                                    @RequestParam String programmingLang3, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("programmingLang1", programmingLang1);
        model.addAttribute("programmingLang2", programmingLang2);
        model.addAttribute("programmingLang3", programmingLang3);
        return  "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                    "<li>" + programmingLang1 + "</li>" +
                    "<li>" + programmingLang2 + "</li>" +
                    "<li>" + programmingLang3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }



}
