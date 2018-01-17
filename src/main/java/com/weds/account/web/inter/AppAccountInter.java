package com.weds.account.web.inter;

import com.weds.framework.core.common.model.PagedResponse;

import com.weds.account.entity.req.*;
import com.weds.account.entity.resp.App_Account_Query_Resp;
import com.weds.framework.core.common.model.JsonResult;

import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * 应用账户相关的接口
 * Created by Caoheyang on 2018-01-06.
 */
@RestController
@RequestMapping(value = "/app/account", produces = {APPLICATION_JSON_VALUE})
public interface AppAccountInter {
    /**
     * 新增应用账户接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @param req
     * @return
     */
    @PutMapping(path = "/add")
    public JsonResult add(@RequestBody App_Account_Add_Req req);

    /**
     * 修改应用账户信息接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @param req
     * @return
     */
    @PostMapping(path = "/modify")
    public JsonResult modify(@RequestBody App_Account_Modify_Req req);

    /**
     * 修改应用账户密码接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @param req
     * @return
     */
    @PostMapping(path = "/modify_pass")
    public JsonResult modifyPass(@RequestBody App_Account_Modify_Pass_Req req);

    /**
     * 删除应用账户接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @param app_account 应用账户
     * @return
     */
    @DeleteMapping(path = "/delete/{app_account}")
    public JsonResult delete(@PathVariable("app_account") String app_account);

    /**
     * 查询某个应用账户接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @return
     */
    @PostMapping(path = "/searchone")
    public JsonResult<App_Account_Query_Resp> searchOne();

    /**
     * 查询应用账户列表接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @return
     */
    @PostMapping(path = "/search")
    public JsonResult<PagedResponse<App_Account_Query_Resp>> search();

    /**
     * 应用账户登陆接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @param req
     * @return
     */
    @PostMapping(path = "/login")
    public JsonResult<App_Account_Query_Resp> login(@RequestBody App_Account_Login_Req req);
}
