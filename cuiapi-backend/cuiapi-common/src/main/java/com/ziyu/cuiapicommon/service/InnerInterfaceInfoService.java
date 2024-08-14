package com.ziyu.cuiapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziyu.cuiapicommon.model.entity.InterfaceInfo;


/**
* @author ASUS-ExpertBook
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-08-03 21:47:03
*/
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     */
    InterfaceInfo getInterfaceInfo(String path, String method);

}
