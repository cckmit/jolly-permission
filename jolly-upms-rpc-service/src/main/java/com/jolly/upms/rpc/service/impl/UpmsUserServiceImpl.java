package com.jolly.upms.rpc.service.impl;

import com.jolly.upms.common.annotation.BaseService;
import com.jolly.upms.common.base.BaseServiceImpl;
import com.jolly.upms.dao.mapper.UpmsUserMapper;
import com.jolly.upms.dao.model.UpmsUser;
import com.jolly.upms.dao.model.UpmsUserExample;
import com.jolly.upms.rpc.api.UpmsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsUserService实现
* Created by jolly on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsUserServiceImpl extends BaseServiceImpl<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    private static Logger _log = LoggerFactory.getLogger(UpmsUserServiceImpl.class);

    @Autowired
    UpmsUserMapper upmsUserMapper;

    @Override
    public UpmsUser insert2(UpmsUser upmsUser) {
        upmsUserMapper.insert(upmsUser);
        return upmsUser;
    }
}