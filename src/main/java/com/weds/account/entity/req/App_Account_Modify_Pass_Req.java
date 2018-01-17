package com.weds.account.entity.req;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 修改应用账户密码接口 入参
 * Created by Caoheyang on 2018-01-08.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class App_Account_Modify_Pass_Req implements Serializable {

    //应用账户
    @ApiModelProperty(required = true, dataType = "string", example = "admin",
            value = "应用账户")
    @Getter
    @Setter
    private String app_account;

    //原始密码
    @ApiModelProperty(required = true, dataType = "string", example = "FFWERWRFGP34DFWE",
            value = "原始应用账户密码，DES加密之后的密文")
    @Getter
    @Setter
    private String old_password;

    //新密码
    @ApiModelProperty(required = true, dataType = "string", example = "CCCCWERWRFGP34DFWE",
            value = "新应用账户密码，DES加密之后的密文")
    @Getter
    @Setter
    private String new_password;
}
