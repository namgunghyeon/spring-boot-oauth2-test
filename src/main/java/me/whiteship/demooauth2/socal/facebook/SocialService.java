package me.whiteship.demooauth2.socal.facebook;

import me.whiteship.demooauth2.users.UserService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class SocialService {
    public UsernamePasswordAuthenticationToken doAuthentication() {
        if (true) {
            // 기존 회원일 경우에는 데이터베이스에서 조회해서 인증 처리
        } else {
            // 새 회원일 경우 회원가입 이후 인증 처리
        }
        return setAuthenticationToken(null);
    }


    private UsernamePasswordAuthenticationToken setAuthenticationToken(Object user) {
        return new UsernamePasswordAuthenticationToken(user, null, getAuthorities("ROLE_USER"));
    }

    private Collection<? extends GrantedAuthority> getAuthorities(String role) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(role));
        return authorities;
    }

}
