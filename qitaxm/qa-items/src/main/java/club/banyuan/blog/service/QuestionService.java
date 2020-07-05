package club.banyuan.blog.service;

import club.banyuan.blog.dto.QuestionCreateParam;
import club.banyuan.blog.model.User;

public interface QuestionService {

    /**
     * 创建问题接口
     */
    void create(QuestionCreateParam param, User user);
}
