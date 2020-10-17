package org.javaboy.acl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.javaboy.acl.model.NoticeMessage;

import java.util.List;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Mapper
public interface NoticeMessageMapper {
    List<NoticeMessage> findAll();

    NoticeMessage findById(Integer id);

    void save(NoticeMessage noticeMessage);

    void update(NoticeMessage noticeMessage);
}
