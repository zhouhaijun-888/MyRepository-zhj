package com.company.project.service.impl;

import com.company.project.dao.ZhjHaijunUserInfoMapper;
import com.company.project.model.ZhjHaijunUserInfo;
import com.company.project.service.ZhjHaijunUserInfoService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/20.
 */
@Service
@Transactional
public class ZhjHaijunUserInfoServiceImpl extends AbstractService<ZhjHaijunUserInfo> implements ZhjHaijunUserInfoService {
    @Resource
    private ZhjHaijunUserInfoMapper zhjHaijunUserInfoMapper;

}
