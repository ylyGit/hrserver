package cn.hrserver.service.menu;

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
    MenuService menuService;

    @Cacheable(key = "#root.methodName")
    @Override
    public List<Menu> getMenuAll() {
        return menuService.getMenuAll();
    }
}
