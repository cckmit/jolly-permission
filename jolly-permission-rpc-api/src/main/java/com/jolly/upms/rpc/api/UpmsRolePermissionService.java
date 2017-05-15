package com.jolly.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.jolly.insipid.permission.common.base.BaseService;
import com.jolly.upms.dao.model.UpmsRolePermission;
import com.jolly.upms.dao.model.UpmsRolePermissionExample;

/**
* UpmsRolePermissionService接口
* Created by jolly on 2017/3/20.
*/
public interface UpmsRolePermissionService extends BaseService<UpmsRolePermission, UpmsRolePermissionExample> {

    /**
     * 角色权限
     * @param datas 权限数据
     * @param id 角色id
     * @return
     */
    int rolePermission(JSONArray datas, int id);

}