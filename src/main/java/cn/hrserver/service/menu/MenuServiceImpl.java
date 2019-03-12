package cn.hrserver.service.menu;

import cn.hrserver.common.HrUtils;
import cn.hrserver.mapper.menu.MenuMapper;
import cn.hrserver.pojo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 杨丽园
 * @create 2019-03-08 10:58
 */
@Service("menuService")
@Transactional
@CacheConfig(cacheNames = "menus_cache")
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Cacheable(key = "#root.methodName")
    @Override
    public List<Menu> getMenuAll() {
        List<Menu>menus=menuMapper.getMenuAll();
        return menus;
    }

    @Override
    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(HrUtils.getCurrentHr().getId());
    }
}
