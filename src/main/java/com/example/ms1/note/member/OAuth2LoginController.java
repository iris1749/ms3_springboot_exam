//package com.example.ms1.note.member;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class OAuth2LoginController {
//
//    private final OAuth2UserInfoService userInfoService;
//
//    @Autowired
//    public OAuth2LoginController(OAuth2UserInfoService userInfoService) {
//        this.userInfoService = userInfoService;
//    }
//
//    @GetMapping("/login/oauth2/code/google")
//    public String handleGoogleOAuth2Callback(Authentication authentication) {
//        OAuth2User oAuth2User = userInfoService.getOAuth2UserInfo("google");
//        if (oAuth2User != null) {
//            // 사용자 정보를 기반으로 추가적인 처리 수행
//            // 예: 회원가입 또는 로그인 처리
//            return "redirect:/"; // 로그인이 성공한 경우 메인 페이지로 리디렉션
//        } else {
//            return "redirect:/login?error"; // 로그인이 실패한 경우 로그인 페이지로 리디렉션
//        }
//    }
//}