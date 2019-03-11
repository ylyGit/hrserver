package cn.hrserver.service.hr;

import cn.hrserver.mapper.hr.HrMapper;
import cn.hrserver.pojo.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author 杨丽园
 * @create 2019-03-08 10:35
 */
@Service("hrService")
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr=hrMapper.loadUserByUsername(s);
        if (hr==null) {
            throw new UsernameNotFoundException("用户名不存在！");
        }
        return hr;
    }

}
