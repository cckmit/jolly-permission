package com.jolly.upms.rpc.api;

import com.jolly.insipid.permission.common.base.BaseServiceMock;
import com.jolly.upms.dao.mapper.UpmsOrganizationMapper;
import com.jolly.upms.dao.model.UpmsOrganization;
import com.jolly.upms.dao.model.UpmsOrganizationExample;

/**
* 降级实现UpmsOrganizationService接口
* Created by jolly on 2017/3/20.
*/
public class UpmsOrganizationServiceMock extends BaseServiceMock<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

}
