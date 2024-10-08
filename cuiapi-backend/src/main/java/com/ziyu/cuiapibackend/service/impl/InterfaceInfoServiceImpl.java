package com.ziyu.cuiapibackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziyu.cuiapibackend.common.ErrorCode;
import com.ziyu.cuiapibackend.exception.BusinessException;
import com.ziyu.cuiapibackend.exception.ThrowUtils;
import com.ziyu.cuiapibackend.service.InterfaceInfoService;
import com.ziyu.cuiapibackend.mapper.InterfaceInfoMapper;
import com.ziyu.cuiapicommon.model.entity.InterfaceInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author ASUS-ExpertBook
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2024-08-03 21:47:03
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();

        // 创建时，参数不能为空
        if (add) {
            ThrowUtils.throwIf(StringUtils.isAnyBlank(name), ErrorCode.PARAMS_ERROR);
        }
        // 有参数则校验
        if (StringUtils.isNotBlank(name) && name.length() > 80) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }

    }

}




