package club.banyuan.mall.dto;

/**
 * @author WM
 * @date 2020/6/15 9:30 上午
 * 描述信息：
 */
public class UmsRoleCreateParam {

    private String name;

    private String description;

    private Integer sort;

    private Boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}