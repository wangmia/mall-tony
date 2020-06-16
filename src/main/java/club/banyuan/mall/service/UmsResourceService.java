package club.banyuan.mall.service;

import club.banyuan.mall.common.model.UmsResource;
import club.banyuan.mall.common.model.UmsResourceCategory;

import java.util.List;

/**
 * @author WM
 * @date 2020/6/15 8:17 下午
 * 描述信息：
 */
public interface UmsResourceService {

     // 创建资源分类
    void createCategory(UmsResourceCategory category);

     // 创建资源
    void create(UmsResource resource);

     // 列出所有资源分类
    List<UmsResourceCategory> listAllCategories();

}

