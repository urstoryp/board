package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    // http://localhost:8080/userRegForm
    // classpath:/templates/userRegForm.html
    @GetMapping("/userRegForm")
    public String userRegForm(){
        return "userRegForm";
    }

    /**
     * 회원 정보를 등록한다.
     * @param name
     * @param email
     * @param password
     * @return
     */
    @PostMapping("/userReg")
    public String userReg(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ){
        System.out.println("name : " + name);
        System.out.println("email : " + email);
        System.out.println("password : " + password);

        // 어떤 기능이 필요한지 미리 알 수 있다.
        // 회원 정보를 저장한다. 동사는 메소드. 메소드만 선언하고 있는것은 인터페이스.

        return "redirect:/welcome"; //  브라우저에게 자동으로 http://localhost:8080/welcome 으로 이동
    }

    // http://localhost:8080/welcome
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/loginform")
    public String loginform(){
        return "loginform";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ){
        // email에 해당하는 회원 정보를 읽어온 후
        // 아이디 암호가 맞다면 세션에 회원정보를 저장한다.
        System.out.println("email : " + email);
        System.out.println("password : " + password);
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(){
        // 세션에서 회원정보를 삭제한다.
        return "redirect:/";
    }
}
