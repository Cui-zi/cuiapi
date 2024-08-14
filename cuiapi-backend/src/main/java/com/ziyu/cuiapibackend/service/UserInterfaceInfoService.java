package com.ziyu.cuiapibackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziyu.cuiapicommon.model.entity.UserInterfaceInfo;

/**
* @author ASUS-ExpertBook
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-08-12 23:29:06
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);


}
