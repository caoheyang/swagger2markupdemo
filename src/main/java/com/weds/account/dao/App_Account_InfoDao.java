package com.weds.account.dao;

import com.weds.account.entity.App_Account_Info;
import com.weds.framework.core.annotation.MyBatisDao;

/**
 * 应用账户列表数据库访问层
 * Created by Caoheyang on 2018-01-06.
 */
@MyBatisDao("app_Account_InfoDao")
public interface App_Account_InfoDao {
    public int add(App_Account_Info app_account_info);

    public int modify(App_Account_Info app_account_info);

    public App_Account_Info getOne(App_Account_Info app_account_info);
}
