package com.yj.service;

import com.yj.mapper.NewsMapper;
import com.yj.service.NewsService;
import com.yj.vo.NewsDetail;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper newsMapper;
    @Override
    public List<NewsDetail> findall() {
        return newsMapper.findall();
    }
}
