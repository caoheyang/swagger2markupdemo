package com.weds.account.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

/**
 * 基础账户信息表
 * Created by CaoheYang on 2018-01-05.
 */
public class Basic_Account_Info {
    //自增序号
    @Getter
    @Setter
    private Integer id;
    // 账户编号
    @Getter
    @Setter
    private String basic_acc_no;
    //身份证号
    @Getter
    @Setter
    private String id_card;
    //姓名
    @Getter
    @Setter
    private String name;
    //性别
    @Getter
    @Setter
    private Integer sex;
    //手机号
    @Getter
    @Setter
    private String mobilephone;
    //手机号2
    @Getter
    @Setter
    private String mobilephone2;
    //座机号
    @Getter
    @Setter
    private String telephone;
    //邮箱
    @Getter
    @Setter
    private String email;
    //邮箱2
    @Getter
    @Setter
    private String email2;
    //识别介质
    @Getter
    @Setter
    private Map<String, String> iden_medias;
    //介质版本号
    @Getter
    @Setter
    private Integer media_version;
    //删除标志
    @Getter
    @Setter
    private Integer is_deleted;
    //插入时间
    @Getter
    @Setter
    private Date inserted_dt;
    //插入人
    @Getter
    @Setter
    private String inserted_by;
    //更新时间
    @Getter
    @Setter
    private Date updated_dt;
    //更新人
    @Getter
    @Setter
    private String updated_by;
}
