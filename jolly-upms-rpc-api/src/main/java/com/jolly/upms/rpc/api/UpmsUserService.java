package com.jolly.upms.rpc.api;

import com.jolly.upms.common.base.BaseService;
import com.jolly.upms.dao.model.UpmsUser;
import com.jolly.upms.dao.model.UpmsUserExample;

/**
* UpmsUserService接口
* Created by jolly on 2017/3/20.
*/
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {

    UpmsUser insert2(UpmsUser upmsUser);
}