package com.ziyu.cuiapibackend.service.impl.inner;

import com.alibaba.nacos.common.utils.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ziyu.cuiapibackend.common.ErrorCode;
import com.ziyu.cuiapibackend.exception.BusinessException;
import com.ziyu.cuiapibackend.mapper.InterfaceInfoMapper;
import com.ziyu.cuiapicommon.model.entity.InterfaceInfo;
import com.ziyu.cuiapicommon.service.InnerInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        // 参数校验
        if (StringUtils.isAnyBlank(url, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 创建查询条件包装器
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url", url);
        queryWrapper.eq("method", method);

        // 使用 InterfaceInfoMapper 的 selectOne 方法查询接口信息
        return interfaceInfoMapper.selectOne(queryWrapper);
    }
}
