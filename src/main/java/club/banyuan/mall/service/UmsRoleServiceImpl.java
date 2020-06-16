package club.banyuan.mall.service;

import club.banyuan.mall.common.mapper.UmsAdminRoleRelationMapper;
import club.banyuan.mall.common.mapper.UmsRoleMapper;
import club.banyuan.mall.common.mapper.UmsRoleMenuRelationMapper;
import club.banyuan.mall.common.model.*;
import club.banyuan.mall.dao.UmsAdminDao;
import club.banyuan.mall.dao.UmsRoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author WM
 * @date 2020/6/15 9:14 上午
 * 描述信息：
 */

@Service
public class UmsRoleServiceImpl implements UmsRoleService {

    @Autowired
    private UmsRoleMapper roleMapper;

    @Autowired
    private UmsAdminRoleRelationMapper relationMapper;

    @Override
    public void create(UmsRole role) {
        role.setCreateTime(new Date());
        roleMapper.insert(role);
    }

    @Override
    public List<UmsRole> getRolesByAdminId(Long adminId) {
        UmsAdminRoleRelationExample relationExample = new UmsAdminRoleRelationExample();
        relationExample.createCriteria().andAdminIdEqualTo(adminId);
        List<UmsAdminRoleRelation> relations = relationMapper.selectByExample(relationExample);

        // 取出所有的角色 ID
        List<Long> roleIds = new ArrayList<>();
        for (UmsAdminRoleRelation relation : relations) {
            roleIds.add(relation.getRoleId());
        }

        // 查出所有的角色
        UmsRoleExample example = new UmsRoleExample();
        example.createCriteria().andIdIn(roleIds);
        return roleMapper.selectByExample(example);
    }

    @Autowired
    private UmsAdminDao adminDao;

    @Override
    public List<UmsRole> findRolesByAdminId(Long adminId) {
        return adminDao.findRolesByAdminId(adminId);
    }

    @Autowired
    private UmsRoleDao roleDao;

    @Override
    public List<UmsRole> listAll() {
        System.out.println("[查询数据库] Role::listALl...");
        return roleDao.listAll();
    }

    @Autowired
    private UmsRoleMenuRelationMapper roleMenuRelationMapper;

    @Override
    public void allocMenu(Long roleId, List<Long> newMenuIds) {

        // 第一步: 查询出这个角色(roleId)所有的 menuId
        UmsRoleMenuRelationExample example = new UmsRoleMenuRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        List<UmsRoleMenuRelation> relations = roleMenuRelationMapper.selectByExample(example);

        // 第二步: 删除被取消的菜单
        List<Long> currentMenuIds = new ArrayList<>();
        for (UmsRoleMenuRelation relation : relations) {
            if (!newMenuIds.contains(relation.getMenuId())) {
                // 删除
                roleMenuRelationMapper.deleteByPrimaryKey(relation.getId());
            }

            currentMenuIds.add(relation.getMenuId());
        }

        // 第三步: 新增之前没有的菜单
        for (Long newMenuId : newMenuIds) {
            if (!currentMenuIds.contains(newMenuId)) {
                // 删除
                UmsRoleMenuRelation relation = new UmsRoleMenuRelation();
                relation.setMenuId(newMenuId);
                relation.setRoleId(roleId);
                roleMenuRelationMapper.insert(relation);
            }
        }
    }


}

