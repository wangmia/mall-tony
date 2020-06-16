package club.banyuan.mall.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.util.Arrays;

/**
 * @author WM
 * @date 2020/6/16 6:30 下午
 * 描述信息：
 */
@EnableCaching
@Configuration
public class CacheConfig {
//    @Bean
//    public CacheManager cacheManager() {
//        SimpleCacheManager cacheManager = new SimpleCacheManager();
//        cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("default")));
//        return cacheManager;
//    }

    @Bean
    public CacheManager cacheManager(RedisConnectionFactory factory) {

        RedisCacheConfiguration c1 = RedisCacheConfiguration.defaultCacheConfig()
                .prefixKeysWith("mall:ums");

        RedisCacheConfiguration c2 = RedisCacheConfiguration.defaultCacheConfig()
                .prefixKeysWith("mall:pms");

        return RedisCacheManager.builder(factory)
                .withCacheConfiguration("ums", c1)
                .withCacheConfiguration("pm2", c2)
                .build();
    }
}
