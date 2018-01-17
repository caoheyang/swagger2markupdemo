package com.weds.account.entity.req;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 修改应用角色接口 入参
 * Created by Caoheyang on 2018-01-08.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class App_Role_Modofy_Req implements Serializable {

    //角色编号
    @ApiModelProperty(required = true, dataType = "string", value = "角色编号", example = "10000032")
    @Getter
    @Setter
    private String role_no;

    //角色名称
    @ApiModelProperty(required = true, dataType = "string", value = "角色名称", example = "admin")
    @Getter
    @Setter
    private String role_name;

    //权限码 以”;权限码1;权限码2;”形式存储
    @ApiModelProperty(required = false, dataType = "string", value = "权限码 以”;权限码1;权限码2;”形式存储", example = ";0001;0098")
    @Getter
    @Setter
    private String access;

    //更新人 默认值为system
    @ApiModelProperty(required = false,dataType ="string" ,value = "更新人 默认值为system",example = "zhangsan")
    @Getter
    @Setter
    private String updated_by;


}
