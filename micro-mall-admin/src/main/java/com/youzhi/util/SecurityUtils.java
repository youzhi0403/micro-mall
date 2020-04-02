package com.youzhi.util;

import com.youzhi.bo.AdminUserDetails;
import com.youzhi.model.AmsAdmin;
import com.youzhi.model.AmsPermission;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SecurityUtils {
    /**
     * 获取当前用户
     * @return
     */
    public static Authentication getCurrentUserAuthentication(){
        return SecurityContextHolder.getContext().getAuthentication();
    }

    /**
     * 获取当前用户
     * @return
     */
    public static Object getCurrentPrincipal(){
        return getCurrentUserAuthentication().getPrincipal();
    }

    /**
     * 获取当前用户信息
     * @return
     */
    public static AmsAdmin getAdmin(){
        AdminUserDetails adminUserDetails = (AdminUserDetails) getCurrentPrincipal();
        return adminUserDetails.getAdmin();
    }

    /**
     * 获取当前用户权限
     * @return
     */
    public static List<AmsPermission> getPermissions(){
        AdminUserDetails adminUserDetails = (AdminUserDetails) getCurrentPrincipal();
        return adminUserDetails.getPermissionList();
    }

}
