package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

//    private final MemberService memberService = new MemberService();
    private final MemberService memberService;

    @Autowired // 스프링이 스프링빈에 등록된 멤버서비스를 가져다가 넣어준다.
    //DI 의존관계 주입이다.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
