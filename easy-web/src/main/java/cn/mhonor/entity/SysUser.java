package cn.mhonor.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author Mr.mhonor
 * @date 2021/3/6 23:48
 */
@Data
@TableName("sys_user")
public class SysUser extends BaseEntity {

    @TableId(value = "id", type = IdType.INPUT)
    private long id;

    @TableField("user_name")
    private String userName;

    @TableField("password")
    private String password;

    @TableField("gender")
    private String gender;

    @TableField("age")
    private Integer age;

    @TableLogic
    @TableField("is_delete")
    private Boolean isDelete;
}
