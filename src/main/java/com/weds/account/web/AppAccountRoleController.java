package com.weds.account.web;

import com.weds.account.entity.req.*;
import com.weds.account.entity.resp.App_RoleQuery_Resp;
import com.weds.account.web.inter.AppAccountRoleInter;
import com.weds.framework.core.common.model.JsonResult;
import com.weds.framework.core.common.model.PagedResponse;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;

/**
 * 应用角色相关的服务
 * Created by Caoheyang on 2018-01-06.
 */
@RestController
@Api(value = "应用账户角色管理", description = "应用账户角色管理")
public class AppAccountRoleController implements AppAccountRoleInter {

    @ApiOperation(value = "新增应用角色接口", notes = "新增应用角色接口")
    @Override
    public JsonResult add(
            @ApiParam(value = "入参", required = true) @RequestBody App_Role_Add_Req req) {
        return null;
    }

    @ApiOperation(value = "修改应用角色接口", notes = "修改应用角色接口")
    @Override
    public JsonResult modify(
            @ApiParam(value = "入参", required = true) @RequestBody App_Role_Modofy_Req req) {
        return null;
    }

    @ApiOperation(value = "删除应用角色接口", notes = "删除应用角色接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "role__no", value = "角色编号", required = true,paramType = "path", dataType = "string")
    })
    @Override
    public JsonResult delete(@PathVariable("role__no") String role__no) {
        return null;
    }

    @ApiOperation(value = "查询某个应用角色接口", notes = "查询某个应用角色接口")
    @Override
    public JsonResult<App_RoleQuery_Resp> searchone() {
        return null;
    }

    @ApiOperation(value = "查询应用角色列表接口", notes = "查询应用角色列表接口")
    @Override
    public JsonResult<PagedResponse<App_RoleQuery_Resp>> search() {
        return null;
    }
}
