package com.youzhi.config;

import com.youzhi.bo.AdminUserDetails;
import com.youzhi.mapper.AdminMapper;
import com.youzhi.model.Admin;
import com.youzhi.model.Permission;
import com.youzhi.model.User;
import com.youzhi.service.AdminService;
import com.youzhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/3 11:48
 * spring security配置类
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig {

    @Autowired
    private AdminService adminService;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        //获取登录用户信息
        return username -> {
            Admin admin = adminService.getAdminByUsername(username);
            if(admin != null){
                List<Permission> permissionList = adminService.getPermissionList(admin.getId());
                return new AdminUserDetails(admin,permissionList);
            }
            throw new UsernameNotFoundException("用户名或密码错误");
        };
    }

    /*public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter(){
        return new JwtAuthenticationTokenFilter();
    }*/

}
