package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello!!");
        return "hello";//template의 hello를 실행하라고 한다
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }
    @GetMapping("hello-string")
    @ResponseBody //http의 body에 직접 넣어준다.
    public String helloString(@RequestParam("name") String name){
        return "hello" + name; // 문자를 그대로 내려간다. 소스 보기하면 문자만 나옴
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello; //123
    }

    static class Hello {
        private String name;//priavate라 외부에서 열기 위에 get set을 만듬

        public String getName() {
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }

}
