package com.ziyu.cuiapibackend.service.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziyu.cuiapibackend.common.ErrorCode;
import com.ziyu.cuiapibackend.exception.BusinessException;
import com.ziyu.cuiapibackend.exception.ThrowUtils;
import com.ziyu.cuiapibackend.mapper.PostMapper;
import com.ziyu.cuiapibackend.model.entity.Post;
import com.ziyu.cuiapibackend.service.PostService;
import com.ziyu.cuiapibackend.service.UserService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

/**
 * 帖子服务实现
 *
 */
@Service
@Slf4j
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

    @Resource
    private UserService userService;

    @Resource
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Override
    public void validPost(Post post, boolean add) {
        if (post == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String title = post.getTitle();
        String content = post.getContent();
        String tags = post.getTags();
        // 创建时，参数不能为空
        if (add) {
            ThrowUtils.throwIf(StringUtils.isAnyBlank(title, content, tags), ErrorCode.PARAMS_ERROR);
        }
        // 有参数则校验
        if (StringUtils.isNotBlank(title) && title.length() > 80) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "标题过长");
        }
        if (StringUtils.isNotBlank(content) && content.length() > 8192) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "内容过长");
        }
    }


}




