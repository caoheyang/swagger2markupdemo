package com.weds.account.entity.req;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 维护基础账户身份识别介质接口 入参
 * Created by Caoheyang on 2018-01-08.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Basic_Account_Modify_Media_Req implements Serializable {

    //账户INT编号
    @ApiModelProperty(required = true, dataType = "int", example = "123",
            value = "账户INT编号")
    @Getter
    @Setter
    private int basci_acc_no;

    //识别介质名称
    @ApiModelProperty(required = true, dataType = "string", example = "张三",
            value = "识别介质名称")
    @Getter
    @Setter
    private String iden_medianame;

    //Y或者N，Y代表开启该识别方式，N代表关闭，目前总用有11中识别介质，分别是hand,finger_0到finger_9，默认在添加账户的时候这11中识别介质的默认值都是N
    @ApiModelProperty(required = true, dataType = "string", example = "Y",
            value = "Y或者N，Y代表开启该识别方式，N代表关闭，目前总用有11中识别介质，" +
                    "分别是hand,finger_0到finger_9，默认在添加账户的时候这11中识别介质的默认值都是N")
    @Getter
    @Setter
    private char iden_mediavalue;

}
