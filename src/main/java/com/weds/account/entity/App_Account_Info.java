package com.weds.account.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

/**
 * 应用账户列表
 * Created by CaoheYang on 2018-01-05.
 */
public class App_Account_Info {
    //自增序号
    @Getter
    @Setter
    private Integer id;
    //应用编号
    @Getter
    @Setter
    private String app_no;
    //基础账号唯一值
    @Getter
    @Setter
    private String basic_acc_no;
    //应用账户
    @Getter
    @Setter
    private String app_account;
    //应用账户状态
    @Getter
    @Setter
    private Integer app_account_status;
    //标签
    @Getter
    @Setter
    private Map<String, String> label;
    //密码
    @Getter
    @Setter
    private String password;
    //角色码
    @Getter
    @Setter
    private String role_nos;
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
    //备用1
    @Getter
    @Setter
    private String column_1;

    //备用2
    @Getter
    @Setter
    private String column_2;
    //备用3
    @Getter
    @Setter
    private String column_3;
    //备用4
    @Getter
    @Setter
    private String column_4;
    //备用5
    @Getter
    @Setter
    private String column_5;
}
