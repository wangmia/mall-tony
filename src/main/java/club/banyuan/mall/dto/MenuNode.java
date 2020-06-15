package club.banyuan.mall.dto;

import club.banyuan.mall.common.model.UmsMenu;

import java.util.List;

/**
 * @author WM
 * @date 2020/6/15 9:22 上午
 * 描述信息：
 */

public class MenuNode extends UmsMenu {

    private List<MenuNode> children;

    public List<MenuNode> getChildren() {
        return children;
    }

    public void setChildren(List<MenuNode> children) {
        this.children = children;
    }
}
