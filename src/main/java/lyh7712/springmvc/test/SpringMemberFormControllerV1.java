package lyh7712.springmvc.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SpringMemberFormControllerV1 {

    @GetMapping("/springmvc/v1/members/new-form")
    public String process() {
        return "new-form";
    }
}
