package com.weds.account.entity.req;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 修改基础账户接口 入参
 * Created by Caoheyang on 2018-01-08.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Basic_Account_Modify_Req implements Serializable {

    //账户编号
    @ApiModelProperty(required = true, dataType = "int", example = "123",
            value = "账户编号")
    @Getter
    @Setter
    private String basci_acc_no;

    //身份证号码，身份证号码，手机号码1，邮箱1三者中至少要有一个
    @ApiModelProperty(required = false, dataType = "string", example = "370685199010111215",
            value = "身份证号码 身份证号码，手机号码1，邮箱1三者中至少要有一个")
    @Getter
    @Setter
    private String id_card;

    //真实姓名 为NULL不修改
    @ApiModelProperty(required = false, dataType = "string", example = "张三",
            value = "真实姓名 为NULL不修改")
    @Getter
    @Setter
    private String name;

    //性别 0男1女 允许为NULL NULL不修改性别
    @ApiModelProperty(required = false , dataType = "int", example = "0",
            value = "性别 0男1女 允许为NULL NULL不修改性别")
    @Getter
    @Setter
    private Integer sex;

    //手机号码1，身份证号码，手机号码1，邮箱1三者中至少要有一个
    @ApiModelProperty(required = false, dataType = "string", example = "18888888888",
            value = "手机号码1 身份证号码，手机号码1，邮箱1三者中至少要有一个")
    @Getter
    @Setter
    private String mobilephone;

    //手机号码2
    @ApiModelProperty(required = false, dataType = "string", example = "18888888888",
            value = "手机号码2")
    @Getter
    @Setter
    private String mobilephone2;

    //固话
    @ApiModelProperty(required = false, dataType = "string", example = "0535-80888888",
            value = "固话")
    @Getter
    @Setter
    private String telephone;

    //邮箱1，身份证号码，手机号码1，邮箱1三者中至少要有一个
    @ApiModelProperty(required = false, dataType = "string", example = "weds@weds.com.cn",
            value = "邮箱1 身份证号码，手机号码1，邮箱1三者中至少要有一个")
    @Getter
    @Setter
    private String email;

    //邮箱2
    @ApiModelProperty(required = false, dataType = "string", example = "weds1@weds.com.cn",
            value = "邮箱2")
    @Getter
    @Setter
    private String email2;

    //修改人 默认值为system
    @ApiModelProperty(required = false, dataType = "string", value = "修改人 默认值为system", example = "zhangsan")
    @Getter
    @Setter
    private String updated_by;
}
