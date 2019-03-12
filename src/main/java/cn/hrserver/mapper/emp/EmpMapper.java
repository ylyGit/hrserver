package cn.hrserver.mapper.emp;

import cn.hrserver.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author 杨丽园
 * @create 2019-03-12 16:05
 */
@Mapper
public interface EmpMapper {
    List<Employee> getEmployeeByPage(@Param("start") Integer start, @Param("size") Integer size,
                                     @Param("keywords") String keywords, @Param("politicId") Long politicId,
                                     @Param("nationId") Long nationId, @Param("posId") Long posId,
                                     @Param("jobLevelId") Long jobLevelId, @Param("engageForm") String engageForm,
                                     @Param("departmentId") Long departmentId,
                                     @Param("startBeginDate") Date startBeginDate,
                                     @Param("endBeginDate") Date endBeginDate);

    Long getCountByKeywords(@Param("keywords") String keywords,
                            @Param("politicId") Long politicId,
                            @Param("nationId") Long nationId,
                            @Param("posId") Long posId,
                            @Param("jobLevelId") Long jobLevelId,
                            @Param("engageForm") String engageForm,
                            @Param("departmentId") Long departmentId,
                            @Param("startBeginDate") Date startBeginDate,
                            @Param("endBeginDate") Date endBeginDate);
}
