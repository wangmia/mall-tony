package club.banyuan.mall.service;

import club.banyuan.mall.common.model.UmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author WM
 * @date 2020/6/15 9:12 上午
 * 描述信息：
 */

public interface UmsRoleService {

    /**
     * 创建角色
     */
    void create(UmsRole role);

    /**
     * 查询一个用户的所有角色
     */
    List<UmsRole> getRolesByAdminId(Long adminId);

    /**
     * 查询一个用户的所有角色
     */
    List<UmsRole> findRolesByAdminId(Long adminId);

    /**
     * 查询所有角色
     */
    List<UmsRole> listAll();

    /**
     * 给角色分配菜单
     */
    @Transactional
    void allocMenu(Long roleId, List<Long> newMenuIds);
}