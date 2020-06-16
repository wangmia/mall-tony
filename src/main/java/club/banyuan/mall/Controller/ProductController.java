package club.banyuan.mall.Controller;

import club.banyuan.mall.common.api.CommonResult;
import club.banyuan.mall.dto.ProductParam;
import club.banyuan.mall.service.ProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WM
 * @date 2020/6/15 8:43 下午
 * 描述信息：
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "创建产品")
    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody ProductParam param) {
        productService.create(param);
        return CommonResult.success("OK");
    }

}

