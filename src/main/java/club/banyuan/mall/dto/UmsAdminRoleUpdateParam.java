package club.banyuan.mall.dto;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author WM
 * @date 2020/6/15 9:29 上午
 * 描述信息：
 */

public class UmsAdminRoleUpdateParam {

    @NotEmpty
    private Long adminId;

    @NotEmpty
    private List<Long> roleIds;

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public List<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Long> roleIds) {
        this.roleIds = roleIds;
    }
}
