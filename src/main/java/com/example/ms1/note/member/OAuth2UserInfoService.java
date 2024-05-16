//package com.example.ms1.note.member;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.security.oauth2.core.user.OAuth2UserAuthority;
//import org.springframework.security.oauth2.core.user.OAuth2UserAuthorityService;
//import org.springframework.stereotype.Service;
//
//@Service
//public class OAuth2UserInfoService {
//
//    private final OAuth2AuthorizedClientService authorizedClientService;
//    private final ClientRegistrationRepository clientRegistrationRepository;
//    private final OAuth2UserAuthorityService userAuthorityService;
//
//    @Autowired
//    public OAuth2UserInfoService(OAuth2AuthorizedClientService authorizedClientService,
//                                 ClientRegistrationRepository clientRegistrationRepository,
//                                 OAuth2UserAuthorityService userAuthorityService) {
//        this.authorizedClientService = authorizedClientService;
//        this.clientRegistrationRepository = clientRegistrationRepository;
//        this.userAuthorityService = userAuthorityService;
//    }
//
//    public OAuth2User getOAuth2UserInfo(String clientRegistrationId) {
//        OAuth2AuthorizedClient authorizedClient = authorizedClientService.loadAuthorizedClient(clientRegistrationId, null);
//        OAuth2User user = authorizedClient != null ? new OAuth2UserAuthority(authorizedClient.getAccessToken(), userAuthorityService) : null;
//        return user;
//    }
//
//    public OAuth2User getOAuth2UserInfoByEmail(String clientRegistrationId, String email) {
//        OAuth2User user = getOAuth2UserInfo(clientRegistrationId);
//        if (user != null && user.getAttribute("email").equals(email)) {
//            return user;
//        }
//        return null;
//    }
//}
