package com.weds.account.entity.req;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;

/**
 * 新增应用账户接口 入参
 * Created by Caoheyang on 2018-01-08.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class App_Account_Add_Req implements Serializable{

    //应用账户,用一个应用下的应用账户具有唯一性
    @ApiModelProperty(required = true, dataType = "string", example = "admin",
            value = "应用账户,用一个应用下的应用账户具有唯一性")
    @Getter
    @Setter
    private String app_account;

    //应用账户标签,json格式，根据平台入驻时与账户微服务预定义的标签，由平台应用自行存储
    @ApiModelProperty(required = true, dataType = "string", example = "{\"class\":\"03\",\"type\":\"teacher\"}",
            value = "应用账户标签,json格式，根据平台入驻时与账户微服务预定义的标签，由平台应用自行存储")
    @Getter
    @Setter
    private Map<String, String> label;

    //应用账户密码 DES加密之后的密文
    @ApiModelProperty(required = true, dataType = "string", example = "FFWERWRFGP34DFWE",
            value = "应用账户密码，DES加密之后的密文")
    @Getter
    @Setter
    private String password;

    //角色编码,以”;角色码1;角色码2;”形式存储
    @ApiModelProperty(required = false, dataType = "string", example = ";0011;0032;",
            value = "角色编码,以”;角色码1;角色码2;”形式存储")
    @Getter
    @Setter
    private String role_nos;

    //添加人 默认值为system
    @ApiModelProperty(required = false, dataType = "string", example = "system",
            value = "添加人 默认值为system")
    @Getter
    @Setter
    private String inserted_by;

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
