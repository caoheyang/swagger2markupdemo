package com.weds.account.web;

import com.weds.account.entity.req.*;
import com.weds.account.entity.resp.App_Account_Query_Resp;
import com.weds.account.web.inter.AppAccountInter;
import com.weds.framework.core.common.model.JsonResult;
import com.weds.framework.core.common.model.PagedResponse;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * 应用账户相关服务的Controller Created by Caoheyang on 2018-01-06.
 */
@RestController
@Api(value = "应用账户管理", description = "应用账户相关的接口")
public class AppAccountController implements AppAccountInter {

    @ApiOperation(value = "新增应用账户接口", notes = "新增应用账户接口")
    @Override
    public JsonResult add(
            @ApiParam(value = "入参", required = true) @RequestBody App_Account_Add_Req req) {
        return null;
    }

    @ApiOperation(value = "修改应用账户信息接口", notes = "修改应用账户信息接口")
    @Override
    public JsonResult modify(
            @ApiParam(value = "入参", required = true) @RequestBody App_Account_Modify_Req req) {
        return null;
    }

    @ApiOperation(value = "修改应用账户密码接口", notes = "修改应用账户密码接口")
    @Override
    public JsonResult modifyPass(
            @ApiParam(value = "入参", required = true) @RequestBody App_Account_Modify_Pass_Req req) {
        return null;
    }

    @ApiOperation(value = "删除应用账户接口", notes = "删除应用账户接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "app_account", value = "应用账户", required = true, paramType = "path", dataType = "string")})
    @Override
    public JsonResult delete(@PathVariable("app_account") String app_account) {
        return null;
    }

    @ApiOperation(value = "查询某个应用账户接口", notes = "查询某个应用账户接口")
    @Override
    public  JsonResult<App_Account_Query_Resp>  searchOne() {
        return null;
    }

    @ApiOperation(value = "查询应用账户列表接口", notes = "查询应用账户列表接口")
    @Override
    public JsonResult<PagedResponse<App_Account_Query_Resp>>  search() {
        return null;
    }

    @ApiOperation(value = "应用账户登陆接口", notes = "应用账户登陆接口")
    @Override
    public  JsonResult<App_Account_Query_Resp>  login(
            @ApiParam(value = "入参", required = true) @RequestBody App_Account_Login_Req req) {
        return null;
    }
}