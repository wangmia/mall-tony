package club.banyuan.mall.service;

import club.banyuan.mall.common.model.UmsMenu;
import club.banyuan.mall.dto.MenuNode;

import java.util.List;

/**
 * @author WM
 * @date 2020/6/15 9:23 上午
 * 描述信息：
 */

public interface MenuService {
    /**
     * 创建菜单
     */
    void create(UmsMenu menu);

    /**
     * 获取树形结构菜单
     */
    List<MenuNode> getTreeList();
}
