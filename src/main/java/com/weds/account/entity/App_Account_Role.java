package com.weds.account.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 应用角色表
 * Created by CaoheYang on 2018-01-05.
 */
public class App_Account_Role {

    @ApiModelProperty(required = true, dataType = "int", example = "123",
            value = "自增序号")
    //自增序号
    @Getter
    @Setter
    private Integer id;

    //应用编号
    @JsonIgnore
    @Getter
    @Setter
    private String app_no;

    //角色编号
    @ApiModelProperty(required = true, dataType = "string", example = "1001",
            value = "角色编号")
    @Getter
    @Setter
    private String role_no;

    //角色名称
    @ApiModelProperty(required = true, dataType = "string", example = "admin",
            value = "角色名称")
    @Getter
    @Setter
    private String role_name;

    //权限码
    @ApiModelProperty(required = true, dataType = "string", example = ";001;0005;",
            value = "权限码")
    @Getter
    @Setter
    private String access;

    //删除标志
    @JsonIgnore
    @Getter
    @Setter
    private Integer is_deleted;

    //插入时间
    @JsonIgnore
    @Getter
    @Setter
    private Date inserted_dt;

    //插入人
    @JsonIgnore
    @Getter
    @Setter
    private String inserted_by;

    //更新时间
    @JsonIgnore
    @Getter
    @Setter
    private Date updated_dt;

    //更新人
    @JsonIgnore
    @Getter
    @Setter
    private String updated_by;
}
