package com.jolly.upms.rpc.service.impl;

import com.jolly.insipid.permission.common.annotation.BaseService;
import com.jolly.insipid.permission.common.base.BaseServiceImpl;
import com.jolly.upms.dao.mapper.UpmsLogMapper;
import com.jolly.upms.dao.model.UpmsLog;
import com.jolly.upms.dao.model.UpmsLogExample;
import com.jolly.upms.rpc.api.UpmsLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsLogService实现
* Created by jolly on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsLogServiceImpl extends BaseServiceImpl<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

    private static Logger _log = LoggerFactory.getLogger(UpmsLogServiceImpl.class);

    @Autowired
    UpmsLogMapper upmsLogMapper;

}