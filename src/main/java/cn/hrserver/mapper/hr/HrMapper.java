package cn.hrserver.mapper.hr;

import cn.hrserver.pojo.Hr;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 杨丽园
 * @create 2019-03-08 10:36
 */
@Mapper
public interface HrMapper {
    Hr loadUserByUsername(@Param("userName") String userName);
    Hr getRolesByHrId(Integer id);
}
