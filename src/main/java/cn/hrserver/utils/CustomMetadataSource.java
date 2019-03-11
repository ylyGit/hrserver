package cn.hrserver.utils;

import cn.hrserver.pojo.Menu;
import cn.hrserver.pojo.Role;
import cn.hrserver.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * @author 杨丽园
 * @create 2019-03-08 10:45
 * 动态权限
 */
@Component
public class CustomMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    MenuService menuService;
    AntPathMatcher antPathMatcher=new AntPathMatcher();

    /**
     * 当前请求URL所需角色
     * @param o
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        //获取用户访问的路径
        String requestUrl=((FilterInvocation)o).getRequestUrl();
        //查询所有权限
        List<Menu> allMenu=menuService.getMenuAll();
        for (Menu menu : allMenu) {
            if (antPathMatcher.match(menu.getUrl(),requestUrl)&&menu.getRoles().size()>0) {
                List<Role> roles=menu.getRoles();
                int size=roles.size();
                String[] values=new String[size];
                for (int i = 0; i < size; i++) {
                    values[i]=roles.get(i).getName();
                }
                return SecurityConfig.createList(values);
            }
        }
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }
}
