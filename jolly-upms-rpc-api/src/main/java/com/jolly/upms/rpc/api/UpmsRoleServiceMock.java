package com.jolly.upms.rpc.api;

import com.jolly.upms.common.base.BaseServiceMock;
import com.jolly.upms.dao.mapper.UpmsRoleMapper;
import com.jolly.upms.dao.model.UpmsRole;
import com.jolly.upms.dao.model.UpmsRoleExample;

/**
* 降级实现UpmsRoleService接口
* Created by jolly on 2017/3/20.
*/
public class UpmsRoleServiceMock extends BaseServiceMock<UpmsRoleMapper, UpmsRole, UpmsRoleExample> implements UpmsRoleService {

}
