package com.jolly.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.jolly.insipid.permission.common.base.BaseService;
import com.jolly.upms.dao.model.UpmsPermission;
import com.jolly.upms.dao.model.UpmsPermissionExample;

/**
* UpmsPermissionService接口
* Created by jolly on 2017/3/20.
*/
public interface UpmsPermissionService extends BaseService<UpmsPermission, UpmsPermissionExample> {

    JSONArray getTreeByRoleId(Integer roleId);

    JSONArray getTreeByUserId(Integer usereId, Byte type);

}