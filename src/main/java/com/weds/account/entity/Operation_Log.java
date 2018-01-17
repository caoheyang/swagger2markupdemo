package com.weds.account.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 操作记录表
 * Created by CaoheYang on 2018-01-05.
 */
public class Operation_Log {
    //自增序号
    @Getter
    @Setter
    private Integer id;
    //应用编号
    @Getter
    @Setter
    private String app_no;
    //操作表名
    @Getter
    @Setter
    private String opt_table;
    //操作类型
    @Getter
    @Setter
    private String opt_type;
    //插入时间
    @Getter
    @Setter
    private Date inserted_dt;
    //插入人
    @Getter
    @Setter
    private String inserted_by;
}
