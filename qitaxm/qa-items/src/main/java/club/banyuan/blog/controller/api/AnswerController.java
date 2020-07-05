package club.banyuan.blog.controller.api;

import club.banyuan.blog.common.CommonResult;
import club.banyuan.blog.exception.CommonException;
import club.banyuan.blog.mapper.AnswerMapper;
import club.banyuan.blog.model.Answer;
import club.banyuan.blog.model.User;
import club.banyuan.blog.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/api/answer")
public class AnswerController {
    @Autowired
    private AnswerMapper answerMapper;


    @Autowired
    private AnswerService answerService;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Answer answer, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return CommonResult.failed("您尚未登录!");
        }

        try {
            answerService.create(answer, user);
            return CommonResult.success("OK");
        } catch (CommonException e) {
            return CommonResult.failed(e.getMessage());
        }
    }

    @PostMapping(value = "/update")
    public CommonResult update(@RequestBody Answer answer, HttpSession session) {
        User user = (User) session.getAttribute("user");

        Answer answer2 = answerMapper.selectByPrimaryKey(answer.getId());
        if (!answer2.getUserId().equals(user.getId())) {
            return CommonResult.failed("你不能修改别人的回答");
        }

        Answer answer1 = answerMapper.selectByPrimaryKey(answer.getId());
        if (answer1.getContent().equals(answer.getContent())) {
            return CommonResult.failed("你需要修改一些内容");
        }
        answerMapper.updateByPrimaryKeySelective(answer);

        return CommonResult.success("OK");
    }
}
