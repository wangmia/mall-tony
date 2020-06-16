package club.banyuan.mall.service;

import club.banyuan.mall.dto.ProductParam;

/**
 * @author WM
 * @date 2020/6/15 8:45 下午
 * 描述信息：
 */
public interface ProductService {

    /**
     * 创建商品
     */
    void create(ProductParam param);
}
