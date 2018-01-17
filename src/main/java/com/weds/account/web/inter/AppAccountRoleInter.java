package com.weds.account.web.inter;

import com.weds.account.entity.req.App_Role_Add_Req;
import com.weds.account.entity.req.App_Role_Modofy_Req;
import com.weds.account.entity.resp.App_RoleQuery_Resp;
import com.weds.framework.core.common.model.JsonResult;
import com.weds.framework.core.common.model.PagedResponse;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Created by Administrator on 2018-01-06.
 */
@RestController
@RequestMapping(value = "/app/role", produces = {APPLICATION_JSON_VALUE})
public interface AppAccountRoleInter {

    /**
     * 新增应用角色接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @return
     */
    @PutMapping(path = "/add")
    public JsonResult add(@RequestBody App_Role_Add_Req req);

    /**
     * 修改应用角色接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @param req
     * @return
     */
    @PostMapping(path = "/modify")
    public JsonResult modify(@RequestBody App_Role_Modofy_Req req);

    /**
     * 删除应用角色接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @param role__no
     * @return
     */
    @DeleteMapping(path = "/delete/{role__no}")
    public JsonResult delete(@PathVariable("role__no") String role__no);

    /**
     * 查询某个应用角色接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @return
     */
    @PostMapping(path = "/searchone")
    public JsonResult<App_RoleQuery_Resp> searchone();

    /**
     * 查询应用角色列表接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @return
     */
    @PostMapping(path = "/search")
    public JsonResult<PagedResponse<App_RoleQuery_Resp>> search();
}
