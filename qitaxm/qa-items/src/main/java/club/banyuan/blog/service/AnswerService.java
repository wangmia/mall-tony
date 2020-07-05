package club.banyuan.blog.service;

import club.banyuan.blog.exception.CommonException;
import club.banyuan.blog.model.Answer;
import club.banyuan.blog.model.User;

public interface AnswerService {

    /**
     * 回答问题
     */
    void create(Answer answer, User user) throws CommonException;
}
