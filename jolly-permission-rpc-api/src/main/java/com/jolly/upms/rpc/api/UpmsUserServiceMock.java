package com.jolly.upms.rpc.api;

import com.jolly.insipid.permission.common.base.BaseServiceMock;
import com.jolly.upms.dao.mapper.UpmsUserMapper;
import com.jolly.upms.dao.model.UpmsUser;
import com.jolly.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by jolly on 2017/3/20.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    @Override
    public UpmsUser insert2(UpmsUser upmsUser) {
        return null;
    }
}
