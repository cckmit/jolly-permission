package com.jolly.upms.rpc.api;

import com.jolly.upms.common.base.BaseService;
import com.jolly.upms.dao.model.UpmsUserRole;
import com.jolly.upms.dao.model.UpmsUserRoleExample;

/**
* UpmsUserRoleService接口
* Created by jolly on 2017/3/20.
*/
public interface UpmsUserRoleService extends BaseService<UpmsUserRole, UpmsUserRoleExample> {

    /**
     * 用户角色
     * @param roleIds 角色ids
     * @param id 用户id
     * @return
     */
    int role(String[] roleIds, int id);

}