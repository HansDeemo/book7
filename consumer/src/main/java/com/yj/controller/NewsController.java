package com.yj.controller;

import com.yj.service.NewsService;
import com.yj.vo.NewsDetail;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class NewsController {
    @Resource
    private NewsService newsService;
   @RequestMapping("/list.do")
    @ResponseBody
    public List<NewsDetail> findAll(){
       return newsService.findall();
   }
}
