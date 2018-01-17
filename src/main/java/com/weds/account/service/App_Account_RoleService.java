package com.weds.account.service;

import com.weds.account.dao.App_Account_RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 应用角色表数据库访问层
 * Created by Caoheyang on 2018-01-06.
 */
@Service
public class App_Account_RoleService {
    @Autowired
    private App_Account_RoleDao app_account_roleDao;
}
