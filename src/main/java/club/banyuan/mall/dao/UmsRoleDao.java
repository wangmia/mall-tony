package club.banyuan.mall.dao;

import club.banyuan.mall.common.model.UmsRole;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author WM
 * @date 2020/6/15 8:17 下午
 * 描述信息：
 */
public interface UmsRoleDao {

    @Select("select * from ums_role")
    List<UmsRole> listAll();
}
