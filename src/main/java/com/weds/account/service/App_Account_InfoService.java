package com.weds.account.service;

import com.weds.account.dao.App_Account_InfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 应用账户列表数据库访问层
 * Created by Caoheyang on 2018-01-06.
 */
@Service
public class App_Account_InfoService {
    @Autowired
    private App_Account_InfoDao app_account_infoDao;
}
