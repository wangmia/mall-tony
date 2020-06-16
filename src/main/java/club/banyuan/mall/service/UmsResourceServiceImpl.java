package club.banyuan.mall.service;

import club.banyuan.mall.common.mapper.UmsResourceCategoryMapper;
import club.banyuan.mall.common.mapper.UmsResourceMapper;
import club.banyuan.mall.common.model.UmsResource;
import club.banyuan.mall.common.model.UmsResourceCategory;
import club.banyuan.mall.common.model.UmsResourceCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author WM
 * @date 2020/6/15 8:19 下午
 * 描述信息：
 */

@Service
public class UmsResourceServiceImpl implements UmsResourceService {

    @Autowired
    private UmsResourceCategoryMapper categoryMapper;

    @Autowired
    private UmsResourceMapper resourceMapper;

    @Override
    public void createCategory(UmsResourceCategory category) {
        category.setCreateTime(new Date());
        categoryMapper.insert(category);
    }

    @Override
    public void create(UmsResource resource) {
        resource.setCreateTime(new Date());
        resourceMapper.insert(resource);
    }

    @Override
    public List<UmsResourceCategory> listAllCategories() {
        return categoryMapper.selectByExample(new UmsResourceCategoryExample());
    }


}