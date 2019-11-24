package test.spring.webmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @GetMapping("/t")
    public String t() {
        return "t";
    }

    @GetMapping("/test")
    public ModelAndView testPage() {
        return new ModelAndView("test_page")
                .addObject("value", "my_value");
    }
}
