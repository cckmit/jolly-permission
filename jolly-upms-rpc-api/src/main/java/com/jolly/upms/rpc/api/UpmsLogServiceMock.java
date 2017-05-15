package com.jolly.upms.rpc.api;

import com.jolly.upms.common.base.BaseServiceMock;
import com.jolly.upms.dao.mapper.UpmsLogMapper;
import com.jolly.upms.dao.model.UpmsLog;
import com.jolly.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by jolly on 2017/3/20.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
