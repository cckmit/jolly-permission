package com.jolly.upms.rpc.api;

import com.jolly.insipid.permission.common.base.BaseServiceMock;
import com.jolly.upms.dao.mapper.UpmsSystemMapper;
import com.jolly.upms.dao.model.UpmsSystem;
import com.jolly.upms.dao.model.UpmsSystemExample;

/**
* 降级实现UpmsSystemService接口
* Created by jolly on 2017/3/20.
*/
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

}
