package com.jolly.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.jolly.insipid.permission.common.base.BaseServiceMock;
import com.jolly.upms.dao.mapper.UpmsRolePermissionMapper;
import com.jolly.upms.dao.model.UpmsRolePermission;
import com.jolly.upms.dao.model.UpmsRolePermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsRolePermissionService接口
* Created by jolly on 2017/3/20.
*/
public class UpmsRolePermissionServiceMock extends BaseServiceMock<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsRolePermissionServiceMock.class);

    @Override
    public int rolePermission(JSONArray datas, int id) {
        _log.info("UpmsRolePermissionServiceMock => rolePermission");
        return 0;
    }

}
