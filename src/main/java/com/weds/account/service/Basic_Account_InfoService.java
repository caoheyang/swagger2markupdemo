package com.weds.account.service;

import com.weds.account.dao.Basic_Account_InfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 基础账户信息表数据库访问层
 * Created by Caoheyang on 2018-01-06.
 */
@Service
public class Basic_Account_InfoService {
    @Autowired
    private  Basic_Account_InfoDao basic_account_infoDao;
}
