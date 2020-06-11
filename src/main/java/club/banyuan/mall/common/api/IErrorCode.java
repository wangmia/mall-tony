package club.banyuan.mall.common.api;

/**
 * @author WM
 * @date 2020/6/10 6:40 下午
 * 描述信息：封装API的错误代码
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}