package club.banyuan.mall;

import club.banyuan.mall.common.mapper.UmsRoleMapper;
import club.banyuan.mall.common.model.UmsRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author WM
 * @date 2020/6/9 2:27 下午
 * 描述信息：
 */
//@MapperScan({"club.banyuan.mall.common.mapper"})
@SpringBootApplication
@RestController

public class MallApplication{

    @Autowired
    private UmsRoleMapper roleMapper;


    public static void main( String[] args )
    {
        SpringApplication.run(MallApplication.class,args);
    }
    @GetMapping(value = "/")
    public String index(){
//        UmsRole role = new UmsRole();
//        role.setName("管理员");
//        role.setDescription("管理员不用介绍");
//        role.setStatus(true);
////        role.setCreateTime(new Date());
//        roleMapper.insert(role);

//        UmsRole role = new UmsRole();
//        role.setName("普通用户");
//        role.setDescription("用户没有介绍");
//        role.setStatus(true);
//        role.setCreateTime(new Date());
//        roleMapper.insert(role);


        UmsRole role = roleMapper.selectByPrimaryKey(1L);
//        roleMapper.selectByPrimaryKey(2L);

        return "<p>" + role.toString() + "</p>";

//        return "<h1>Hello Word!</h1>";
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping(value = "/hello2")
    public String hello2(){
        return "Hello";
    }

}

