package com.ziyu.cuiapibackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ziyu.cuiapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author ASUS-ExpertBook
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-08-12 23:29:06
* @Entity com.ziyu.cuiapibackend.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);

}




