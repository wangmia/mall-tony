package club.banyuan.blog.controller.api;

import club.banyuan.blog.common.CommonResult;
import club.banyuan.blog.dto.QuestionCreateParam;
import club.banyuan.blog.mapper.QuestionMapper;
import club.banyuan.blog.mapper.TagMapper;
import club.banyuan.blog.mapper.TagQuestionRelationMapper;
import club.banyuan.blog.model.*;
import club.banyuan.blog.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/api/question")
@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private TagQuestionRelationMapper relationMapper;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody QuestionCreateParam param, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return CommonResult.failed("您尚未登录！");
        }

        questionService.create(param, user);
        return CommonResult.success("OK");
    }

    @PostMapping(value = "/update")
    public CommonResult update(@RequestBody Question question) {
        questionMapper.updateByPrimaryKeySelective(question);
        return CommonResult.success("OK");
    }

    @Autowired
    private TagMapper tagMapper;

    @Autowired
    private TagQuestionRelationMapper tagQuestionRelationMapper;

    @GetMapping(value = "/getTags/{questionId}")
    public CommonResult getTags(@PathVariable("questionId") Integer questionId) {

        TagQuestionRelationExample example1 = new TagQuestionRelationExample();
        example1.createCriteria().andQuestionIdEqualTo(questionId);
        List<TagQuestionRelation> relations = tagQuestionRelationMapper.selectByExample(example1);

        List<Integer> tagIds = new ArrayList<>();
        for (TagQuestionRelation relation : relations) {
            tagIds.add(relation.getTagId());
        }

        // tag
        TagExample example2 = new TagExample();
        example2.createCriteria().andIdIn(tagIds);
        List<Tag> tags = tagMapper.selectByExample(example2);

        return CommonResult.success(tags);
    }

    @GetMapping(value = "/list")
    public CommonResult list() {

        List<Question> questions = questionMapper.selectByExample(new QuestionExample());
        return CommonResult.success(questions);
    }

    @GetMapping(value = "/detail/{id}")
    public CommonResult detail(@PathVariable("id") Integer id) {
        Question question = questionMapper.selectByPrimaryKey(id);
        return CommonResult.success(question);
    }
}
