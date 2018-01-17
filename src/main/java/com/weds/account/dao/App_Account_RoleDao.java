package com.weds.account.dao;

import com.weds.account.entity.App_Account_Role;
import com.weds.framework.core.annotation.MyBatisDao;

/**
 * 应用角色表数据库访问层
 * Created by Caoheyang on 2018-01-06.
 */
@MyBatisDao("app_Account_RoleDao")
public interface App_Account_RoleDao {

    public int add(App_Account_Role app_account_role);

    public int modify(App_Account_Role app_account_role);

    public App_Account_Role getOne(App_Account_Role app_account_role);
}
