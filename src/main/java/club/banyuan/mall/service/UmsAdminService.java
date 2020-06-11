package club.banyuan.mall.service;

import club.banyuan.mall.common.model.UmsAdmin;
import club.banyuan.mall.dto.UmsAdminCreateParam;
import club.banyuan.mall.exception.CommonException;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author WM
 * @date 2020/6/10 6:56 下午
 * 描述信息：
 */
public interface UmsAdminService {

    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    //  登录
    String login(String username, String password);

    //  根据用户名加载用户
    UserDetails loadUserByUsername(String username);

    //  创建用户
    void createUser(UmsAdminCreateParam param) throws CommonException;
}
