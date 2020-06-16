package club.banyuan.mall.service;

import club.banyuan.mall.common.mapper.PmsProductMapper;
import club.banyuan.mall.common.model.PmsProduct;
import club.banyuan.mall.dto.ProductParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WM
 * @date 2020/6/15 8:45 下午
 * 描述信息：
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private PmsProductMapper productMapper;

    @Override
    public void create(ProductParam param) {
        PmsProduct product = new PmsProduct();
        BeanUtils.copyProperties(param, product);
        productMapper.insertSelective(product);
    }
}