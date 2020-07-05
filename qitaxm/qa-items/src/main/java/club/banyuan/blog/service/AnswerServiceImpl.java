package club.banyuan.blog.service;

import club.banyuan.blog.consts.PrestigeConst;
import club.banyuan.blog.exception.CommonException;
import club.banyuan.blog.mapper.AnswerMapper;
import club.banyuan.blog.mapper.PrestigeFlowMapper;
import club.banyuan.blog.mapper.UserMapper;
import club.banyuan.blog.model.Answer;
import club.banyuan.blog.model.AnswerExample;
import club.banyuan.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    @Autowired
    private PrestigeFlowMapper flowMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PrestigeService prestigeService;

    @Override
    @Transactional
    public void create(Answer answer, User user) throws CommonException {
        // 判断是否已回答过这个问题
        AnswerExample example = new AnswerExample();
        example.createCriteria()
                .andQuestionIdEqualTo(answer.getQuestionId())
                .andUserIdEqualTo(user.getId());
        long count = answerMapper.countByExample(example);
        if (count > 0) {
            throw new CommonException("您已经回答过这个问题了");
        }

        answer.setUserId(user.getId());
        answerMapper.insertSelective(answer);

        // 给用增加声望
        prestigeService.change(user.getId(),
                PrestigeConst.AMOUNT_ANSWER_A_QUESTION,
                PrestigeConst.TYPE_ANSWER_A_QUESTION,
                answer.getId());
    }
}
