//package com.example.ms1.note.member;
//
//import jakarta.validation.Valid;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotEmpty;
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//@RequiredArgsConstructor
//public class MemberController {
//    private final MemberService memberService;
//
//    @Getter
//    @Setter
//    class MemberForm {
//        @NotEmpty(message = "아이디를 입력해주세요.")
//        private String loginId;
//        @NotEmpty(message = "비밀번호를 입력해주세요.")
//        private String password;
//        @NotEmpty(message = "닉네임을 입력해주세요.")
//        private String nickname;
//        @NotEmpty(message = "이메일을 입력해주세요.")
//        @Email(message = "이메일 형식이 아닙니다.")
//        private String email;
//    }
//
//    @GetMapping("/signup")
//    public String signup(MemberForm memberForm) {
//        return "signup_form";
//    }
//
//    @PostMapping("/signup")
//    public String signup(@Valid MemberForm memberForm, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "signup_form";
//        }
//
//        memberService.save(memberForm.getLoginId(), memberForm.getPassword(), memberForm.getNickname(), memberForm.getEmail());
//
//        return "redirect:/";
//
//    }
//
//    @GetMapping("/login")
//    public String login() {
//        return "login_form";
//    }
//
//    @PostMapping("/login/oauth2/code/google")
//    public String handleGoogleCallback(@RequestParam("code") String code, OAuth2AuthenticationToken token) {
//        // OAuth2 인증 코드를 사용하여 사용자 정보를 가져오고 처리하는 로직을 여기에 구현합니다.
//        // 이후 로그인이 성공하면 메인 페이지로 리디렉션합니다.
//    }
//}