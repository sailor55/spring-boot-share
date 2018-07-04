/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.share.demo.controller;

import com.share.demo.model.Vote;
import com.share.demo.model.VoteVO;
import com.share.demo.service.VoteServiceI;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author linjp
 * @version V1.0
 * @since 2018-03-24 14:40
 */
@Controller
@RequestMapping(value = "/vote")
public class VoteController {

    private VoteServiceI voteService;

    public VoteServiceI getVoteService() {
        return voteService;
    }

    @Autowired
    public void setVoteService(VoteServiceI voteService) {
        this.voteService = voteService;
    }

    //投票
    @RequestMapping(value = "/submit")
    public String vote(@ModelAttribute("form") VoteVO voteVO, HttpServletRequest request) throws ParseException {
        System.out.println("vote");
        Vote vote = new Vote();
        vote.setCreateTime(new Date());
        vote.setUserName(voteVO.getUserName());
        vote.setFightTime(voteVO.getFightTime());
        voteService.add(vote);
        return "redirect:/vote/listall";
    }

    @RequestMapping(value = "/listall")
    public String listAll(ModelMap map) {
        List<Vote> list = voteService.getAllVoteResult();
        map.addAttribute("voteList", list);
        return "vote";
    }
}
