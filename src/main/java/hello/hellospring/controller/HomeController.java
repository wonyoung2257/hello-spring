package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //이 Controller가 먼저 mapping되어 index 실행 안됨
    @GetMapping("/")
    public  String home(){
        return "home";
    }
}
