package club.banyuan.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author WM
 * @date 2020/6/11 6:44 下午
 * 描述信息：
 */
@Configuration
@MapperScan({"club.banyuan.mall.common.mapper","club.banyuan.mall.dao"})
public class MyBatisConfig {
}
