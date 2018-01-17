package com.weds.account.entity.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 查询某个应用角色接口 返回数据结构
 * Created by Caoheyang on 2018-01-09.
 */
public class App_RoleQuery_Resp implements Serializable {
    //ID
    @ApiModelProperty(required = true, dataType = "int", example = "123",
            value = "角色ID")
    @Getter
    @Setter
    private int id;

    //应用编号
    @ApiModelProperty(required = true, dataType = "string", example = "100001",
            value = "应用编号")
    @Getter
    @Setter
    private String app_no;

    //角色编号
    @ApiModelProperty(required = true, dataType = "string", example = "100001",
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
    @ApiModelProperty(required = true, dataType = "string", example = ";0001;0098",
            value = "权限码 以”;权限码1;权限码2;”形式存储")
    @Getter
    @Setter
    private String access;

    //插入时间
    @ApiModelProperty(required = true, dataType = "date", example = "2011-10-12",
            value = "添加时间")
    @Getter
    @Setter
    private Date inserted_dt;

    //插入人
    @ApiModelProperty(required = true, dataType = "string", example = "zhangsan",
            value = "添加人")
    @Getter
    @Setter
    private String inserted_by;

    //更新时间
    @ApiModelProperty(required = true, dataType = "date", example = "2011-11-12",
            value = "更新时间")
    @Getter
    @Setter
    private Date updated_dt;

    //更新人
    @ApiModelProperty(required = true, dataType = "string", example = "lisi",
            value = "更新人")
    @Getter
    @Setter
    private String updated_by;
}
