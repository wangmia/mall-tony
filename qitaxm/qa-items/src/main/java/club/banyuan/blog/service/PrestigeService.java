package club.banyuan.blog.service;

public interface PrestigeService {

    /**
     * 声望变动
     */
    void change(Integer userId, Integer amount, Integer type, Integer linkId);
}
