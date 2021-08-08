package mvc2.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// thymeleaf가 package 이름인거 까먹었었음..
// `@SpringBootApplication` 애노테이션과 같은 레벨에서 만들어줘야
// 스프링부트가 기본 설정에 의해 컴포넌트 스캔에서 찾아냄
@Controller
@RequestMapping("/basic")
public class BasicController {

    @GetMapping("/text-basic")
    public String textBasic(Model model) {
        model.addAttribute("data", "Hello <b>Spring!</b>");
        return "/basic/text-basic";
    }

    @GetMapping("/text-unescaped")
    public String textUnescaped(Model model) {
        model.addAttribute("data", "Hello <b>Spring!</b>");
        return "/basic/text-unescaped";
    }
}

