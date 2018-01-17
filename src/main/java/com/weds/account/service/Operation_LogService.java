package com.weds.account.service;

import com.weds.account.dao.Operation_LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 操作记录表数据库访问层
 * Created by Caoheyang on 2018-01-06.
 */
@Service
public class Operation_LogService {
    @Autowired
    private Operation_LogDao operation_logDao;
}
