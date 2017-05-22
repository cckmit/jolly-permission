package com.jolly.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.jolly.upms.common.base.BaseService;
import com.jolly.upms.dao.model.UpmsRolePermission;
import com.jolly.upms.dao.model.UpmsRolePermissionExample;
import com.jolly.upms.rpc.vo.UpmsDataPermissionDTO;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
* UpmsDataPermissionService 数据权限
* Created by berkeley on 2017/5/19.
*/
public interface UpmsDataPermissionService extends BaseService<UpmsDataPermissionDTO, UpmsRolePermissionExample> {

    /**
     *
     * @param permssioId 权限主键
     * @param roleId     角色主键
     * @return    key为数据维度，Set<String>为数据维度的值
     * @return 举例  key为Language   Set<String> 为ar 阿拉伯语  ,fa 波斯语
     */
    Map<String,Set<String>> getDataDimensionPermssionMap(String permssioId, String roleId);


    /**
     *
     * @param permssioId 权限主键
     * @param roleId     角色主键
     * @return    List<UpmsDataPermissionDTO>集合
     */
    List<UpmsDataPermissionDTO> getDataDimensionPermssionList(String permssioId, String roleId);

}