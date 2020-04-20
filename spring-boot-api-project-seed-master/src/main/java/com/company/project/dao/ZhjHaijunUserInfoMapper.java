package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.ZhjHaijunUserInfo;
/**
 * 功能描述
 *
 * @Author Haijun Zhou
 * @Since 2020-4-20
*/
public interface ZhjHaijunUserInfoMapper extends Mapper<ZhjHaijunUserInfo> {
    void saveUserInfo(ZhjHaijunUserInfo userInfo);
}