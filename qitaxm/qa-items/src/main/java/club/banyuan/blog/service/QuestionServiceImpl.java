package club.banyuan.blog.service;

import club.banyuan.blog.dto.QuestionCreateParam;
import club.banyuan.blog.mapper.QuestionMapper;
import club.banyuan.blog.mapper.TagQuestionRelationMapper;
import club.banyuan.blog.model.Question;
import club.banyuan.blog.model.TagQuestionRelation;
import club.banyuan.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private TagQuestionRelationMapper relationMapper;

    @Override
    public void create(QuestionCreateParam param, User user) {
        Question question = new Question();
        question.setTitle(param.getTitle());
        question.setContent(param.getContent());
        question.setUserId(user.getId());
        questionMapper.insertSelective(question);

        // 标签
        if (!CollectionUtils.isEmpty(param.getTagIds())) {
            for (Integer tagId : param.getTagIds()) {
                TagQuestionRelation relation = new TagQuestionRelation();
                relation.setQuestionId(question.getId());
                relation.setTagId(tagId);
                relationMapper.insertSelective(relation);
            }
        }
    }
}
