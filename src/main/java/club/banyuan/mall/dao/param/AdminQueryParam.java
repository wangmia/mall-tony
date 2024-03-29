package club.banyuan.mall.dao.param;

/**
 * @author WM
 * @date 2020/6/11 6:50 下午
 * 描述信息：
 */
public class AdminQueryParam {

    private String keyword;
    private Integer pageNum;
    private Integer pageSize;
    private Integer offset;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}



