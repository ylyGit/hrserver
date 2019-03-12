package cn.hrserver.mapper.menu;

import cn.hrserver.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 杨丽园
 * @create 2019-03-08 10:47
 */
@Mapper
public interface MenuMapper {
    List<Menu> getMenuAll();
    List<Menu> getMenusByHrId(@Param("hrId") Long hrId);
}
