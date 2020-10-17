package org.javaboy.acl.service;

import org.javaboy.acl.mapper.NoticeMessageMapper;
import org.javaboy.acl.model.NoticeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

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
@Service
public class NoticeMessageService {
    @Autowired
    NoticeMessageMapper noticeMessageMapper;

    @PostFilter("hasPermission(filterObject, 'READ')")
    public List<NoticeMessage> findAll() {
        List<NoticeMessage> all = noticeMessageMapper.findAll();
        return all;
    }

    @PostAuthorize("hasPermission(returnObject, 'READ')")
    public NoticeMessage findById(Integer id) {
        return noticeMessageMapper.findById(id);
    }

    @PreAuthorize("hasPermission(#noticeMessage, 'CREATE')")
    public NoticeMessage save(NoticeMessage noticeMessage) {
        noticeMessageMapper.save(noticeMessage);
        return noticeMessage;
    }

    @PreAuthorize("hasPermission(#noticeMessage, 'WRITE')")
    public void update(NoticeMessage noticeMessage) {
        noticeMessageMapper.update(noticeMessage);
    }

}