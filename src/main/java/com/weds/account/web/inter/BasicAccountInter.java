package com.weds.account.web.inter;

import com.weds.account.entity.req.Basic_Account_Add_Req;
import com.weds.account.entity.req.Basic_Account_Modify_Media_Req;
import com.weds.account.entity.req.Basic_Account_Modify_Req;
import com.weds.framework.core.common.model.JsonResult;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * 基础账户相关的接口
 * Created by Caoheyang on 2018-01-06.
 */
@RestController
@RequestMapping(value = "/basic/account", produces = {APPLICATION_JSON_VALUE})
public interface BasicAccountInter {
    /**
     * 新增基础账户接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @param req
     * @return
     */
    @PutMapping(path = "/add")
    public JsonResult add(@RequestBody Basic_Account_Add_Req req);

    /**
     * 修改基础账户信息接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @param req
     * @return
     */
    @PostMapping(path = "/modify")
    public JsonResult modify(@RequestBody Basic_Account_Modify_Req req);

    /**
     * 维护基础账户身份识别介质接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @param req
     * @return
     */
    @PostMapping(path = "/modify_media")
    public JsonResult modifyMedia(@RequestBody Basic_Account_Modify_Media_Req req);

    /**
     * 根据基础账户INT编号查询基础账户介质接口
     * Created by Caoheyang on 2018-01-06.
     *
     * @param basci_acc_no
     * @return
     */
    @GetMapping(path = "/get_media/{basic_acc_no}")
    public JsonResult<Map<String,String>> getMedia(@PathVariable("basic_acc_no") String basci_acc_no);
}
