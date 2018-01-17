package com.weds.account.dao;

import com.weds.account.entity.Basic_Account_Info;
import com.weds.framework.core.annotation.MyBatisDao;

/**
 * 基础账户信息表数据库访问层
 * Created by Caoheyang on 2018-01-06.
 */
@MyBatisDao("basic_Account_InfoDao")
public interface Basic_Account_InfoDao {
    public int add(Basic_Account_Info basic_account_info);

    public int modify(Basic_Account_Info basic_account_info);

    public Basic_Account_Info getOne(Basic_Account_Info basic_account_info);
}
