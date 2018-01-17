package com.weds.account.dao;

import com.weds.account.entity.Operation_Log;
import com.weds.framework.core.annotation.MyBatisDao;

/**
 * 操作记录表数据库访问层
 * Created by Caoheyang on 2018-01-06.
 */
@MyBatisDao("operation_LogDao")
public interface Operation_LogDao {
    public int add(Operation_Log operation_log);

    public int modify(Operation_Log operation_log);

    public Operation_Log getOne(Operation_Log operation_log);
}
