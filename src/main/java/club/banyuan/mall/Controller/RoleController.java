package club.banyuan.mall.Controller;

import club.banyuan.mall.common.api.CommonResult;
import club.banyuan.mall.common.model.UmsRole;
import club.banyuan.mall.service.UmsRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author WM
 * @date 2020/6/15 9:28 上午
 * 描述信息：
 */

@Api(tags = "RoleController", description = "管理员相关接口")
@RestController
@RequestMapping(value = "/role")
public class RoleController {

    @Autowired
    private UmsRoleService roleService;

    @ApiOperation(value = "创建角色")
    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody UmsRole role) {
        roleService.create(role);
        return CommonResult.success("OK");
    }


    @ApiOperation(value = "给角色分配菜单")
    @PostMapping(value = "allocMenu")
    public CommonResult allocMenu(
            @RequestParam("roleId") Long roleId,
            @RequestParam("menuIds") String menuIds) {

        List<String> tmpMenuIds = Arrays.asList(menuIds.split(","));
        List<Long> todoMenuIds = new ArrayList<>();
        for (String tmpMenuId : tmpMenuIds) {
            todoMenuIds.add(Long.parseLong(tmpMenuId));
        }
        roleService.allocMenu(roleId, todoMenuIds);
        return CommonResult.success("OK");
    }

    @GetMapping(value = "/listAll")
    public CommonResult listAll() {

        List<UmsRole> roles = roleService.listAll();
        return CommonResult.success(roles);
    }
}