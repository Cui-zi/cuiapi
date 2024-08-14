package com.ziyu.cuiapibackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziyu.cuiapicommon.model.entity.InterfaceInfo;

/**
* @author ASUS-ExpertBook
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-08-03 21:47:03
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
