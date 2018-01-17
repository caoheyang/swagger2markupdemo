package com.weds.account.entity.resp;

import com.weds.account.entity.App_Account_Role;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 查询某个应用账户接口 返回数据结构
 * Created by Caoheyang on 2018-01-09.
 */
public class App_Account_Query_Resp implements Serializable {
    //基础账户编号
    @ApiModelProperty(required = true, dataType = "int", example = "123",
            value = "基础账户编号")
    @Getter
    @Setter
    private int basic_acc_no;

    //应用账户
    @ApiModelProperty(required = true, dataType = "string", example = "admin",
            value = "应用账户")
    @Getter
    @Setter
    private String app_account;

    //身份证号码
    @ApiModelProperty(required = false, dataType = "string", example = "370685199010111215",
            value = "身份证号码")
    @Getter
    @Setter
    private String id_card;

    //真实姓名
    @ApiModelProperty(required = true, dataType = "string", example = "张三",
            value = "真实姓名")
    @Getter
    @Setter
    private String name;

    //性别 男 女
    @ApiModelProperty(required = true, dataType = "int", example = "男",
            value = "性别")
    @Getter
    @Setter
    private String sex;

    //手机号码1
    @ApiModelProperty(required = false, dataType = "string", example = "18888888888",
            value = "手机号码1")
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

    //邮箱1
    @ApiModelProperty(required = false, dataType = "string", example = "weds@weds.com.cn",
            value = "邮箱1")
    @Getter
    @Setter
    private String email;

    //邮箱2
    @ApiModelProperty(required = false, dataType = "string", example = "weds1@weds.com.cn",
            value = "邮箱2")
    @Getter
    @Setter
    private String email2;

    //应用账户状态
    @ApiModelProperty(required = true, dataType = "int", example = "0",
            value = "应用账户状态")
    @Getter
    @Setter
    private int app_account_status;

    //标签  JSON数据体
    @ApiModelProperty(required = true, dataType = "string", example = "{\"class\":\"03\",\"type\":\"teacher\"}",
            value = "应用账户标签,json格式，根据平台入驻时与账户微服务预定义的标签，由平台应用自行存储")
    @Getter
    @Setter
    private Map<String, String> label;

    //角色,信息 JONS 数组
    @ApiModelProperty(required = true, dataType = "string", example = "admin",
            value = "角色数组")
    @Getter
    @Setter
    private List<App_Account_Role> role_nos;

    //备用标注,应用自定义存储，自行解析
    @ApiModelProperty(required = false, dataType = "string", example = "备注1",
            value = "备用标注,应用自定义存储，自行解析")
    @Getter
    @Setter
    private String column_1;

    //备用标注,应用自定义存储，自行解析
    @ApiModelProperty(required = false, dataType = "string", example = "备注2",
            value = "备用标注,应用自定义存储，自行解析")
    @Getter
    @Setter
    private String column_2;

    //备用标注,应用自定义存储，自行解析
    @ApiModelProperty(required = false, dataType = "string", example = "备注3",
            value = "备用标注,应用自定义存储，自行解析")
    @Getter
    @Setter
    private String column_3;

    //备用标注,应用自定义存储，自行解析
    @ApiModelProperty(required = false, dataType = "string", example = "备注4",
            value = "备用标注,应用自定义存储，自行解析")
    @Getter
    @Setter
    private String column_4;

    //备用标注,应用自定义存储，自行解析
    @ApiModelProperty(required = false, dataType = "string", example = "备注5",
            value = "备用标注,应用自定义存储，自行解析")
    @Getter
    @Setter
    private String column_5;
}
