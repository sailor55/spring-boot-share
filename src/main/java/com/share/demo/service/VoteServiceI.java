/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.share.demo.service;

import com.share.demo.model.Vote;

import java.util.List;

/**
 * @author linjp
 * @version V1.0
 * @since 2018-03-24 14:30
 */
public interface VoteServiceI {

    public List<Vote> getAllVoteResult();

    public void add(Vote vote);
}
