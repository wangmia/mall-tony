package club.banyuan.blog.service;

import club.banyuan.blog.consts.PrestigeConst;
import club.banyuan.blog.mapper.PrestigeFlowMapper;
import club.banyuan.blog.mapper.UserMapper;
import club.banyuan.blog.model.PrestigeFlow;
import club.banyuan.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PrestigeServiceImpl implements PrestigeService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PrestigeFlowMapper flowMapper;


    @Transactional
    @Override
    public void change(Integer userId, Integer amount, Integer type, Integer linkId) {
        User tmpUser = userMapper.selectByPrimaryKey(userId);
        int finalPrestige = tmpUser.getPrestige();
        if (type > 0) {
            finalPrestige += amount;
        } else {
            finalPrestige -= amount;
        }

        // 第一步：创建一条声望变动记录
        PrestigeFlow flow = new PrestigeFlow();
        flow.setUserId(userId);
        flow.setAmount(amount);
        flow.setPrestige(finalPrestige);
        flow.setType(type);
        flow.setLinkId(linkId);
        flowMapper.insertSelective(flow);

        // 第二步：更新 User 表里的 prestige 字段
        tmpUser.setPrestige(finalPrestige);
        userMapper.updateByPrimaryKeySelective(tmpUser);
    }
}
