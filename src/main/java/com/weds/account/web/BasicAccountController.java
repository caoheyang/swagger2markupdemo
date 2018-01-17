package com.weds.account.web;

import com.weds.account.entity.req.Basic_Account_Add_Req;
import com.weds.account.entity.req.Basic_Account_Modify_Media_Req;
import com.weds.account.entity.req.Basic_Account_Modify_Req;
import com.weds.account.web.inter.BasicAccountInter;
import com.weds.framework.core.common.model.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 基础账户相关服务的Controller
 * Created by Caoheyang on 2018-01-06.
 */
@RestController
@Api(value = "基础账户管理", description = "基础账户管理")
public class BasicAccountController implements BasicAccountInter {

    @ApiOperation(value = "新增基础账户接口", notes = "新增基础账户接口")
    @Override
    public JsonResult add(
            @ApiParam(value = "入参", required = true) @RequestBody Basic_Account_Add_Req req) {
        return null;
    }

    @ApiOperation(value = "修改基础账户信息接口", notes = "修改基础账户信息接口")
    @Override
    public JsonResult modify(
            @ApiParam(value = "入参", required = true) @RequestBody Basic_Account_Modify_Req req) {
        return null;
    }

    @ApiOperation(value = "维护基础账户身份识别介质接口", notes = "维护基础账户身份识别介质接口")
    @Override
    public JsonResult modifyMedia(
            @ApiParam(value = "入参", required = true) @RequestBody Basic_Account_Modify_Media_Req req) {
        return null;
    }

    @ApiOperation(value = "根据基础账户INT编号查询基础账户介质接口", notes = "根据基础账户INT编号查询基础账户介质接口")
    @Override
    public JsonResult<Map<String,String>> getMedia(
            @ApiParam(value = "入参", required = true) @PathVariable("basci_acc_no") String basci_acc_no) {
        return null;
    }
}
