package com.weds.account.entity.req;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 应用账户登陆接口 入参
 * Created by Caoheyang on 2018-01-08.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class App_Account_Login_Req implements Serializable {

    //应用账户
    @ApiModelProperty(required = true, dataType = "string", example = "admin",
            value = "应用账户")
    @Getter
    @Setter
    private String app_account;


    @ApiModelProperty(required = true, dataType = "string", example = "FFWERWRFGP34DFWE",
            value = "应用账户密码，DES加密之后的密文")
    //应用账户密码
    @Getter
    @Setter
    private String password;
}
