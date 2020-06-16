package club.banyuan.mall.Controller;

import club.banyuan.mall.common.api.CommonResult;
import club.banyuan.mall.common.mapper.UmsResourceCategoryMapper;
import club.banyuan.mall.common.mapper.UmsResourceMapper;
import club.banyuan.mall.common.model.UmsResource;
import club.banyuan.mall.common.model.UmsResourceCategory;
import club.banyuan.mall.common.model.UmsRole;
import club.banyuan.mall.service.UmsResourceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author WM
 * @date 2020/6/15 8:14 下午
 * 描述信息：
 */

@RestController
public class ResourceController {

    @Autowired
    private UmsResourceService resourceService;

    @ApiOperation(value = "创建资源分类")
    @PostMapping(value = "/resourceCategory/create")
    public CommonResult categoryCreate(@RequestBody UmsResourceCategory category) {
        resourceService.createCategory(category);
        return CommonResult.success("OK");
    }

    @ApiOperation(value = "创建资源")
    @PostMapping(value = "/resource/create")
    public CommonResult create(@RequestBody UmsResource resource) {
        resourceService.create(resource);
        return CommonResult.success("OK");
    }

    @ApiOperation(value = "查看所有资源分类")
    @GetMapping(value = "/resourceCategory/listAll")
    public CommonResult categoryListAll() {
        List<UmsResourceCategory> list = resourceService.listAllCategories();
        return CommonResult.success(list);
    }
}

