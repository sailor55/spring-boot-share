/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.share.demo.mapper;

import com.share.demo.model.Vote;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @author linjp
 * @version V1.0
 * @since 2018-07-04 22:59
 */
@Mapper
public interface VoteMapper {

    @Select("SELECT * FROM VOTE")
    List<Vote> selectAll();

    @Insert("INSERT INTO VOTE(id,user_name,fight_time,create_time) VALUES(#{id},#{userName},#{fightTime},#{createTime})")
    int insert(Vote vote);

}
