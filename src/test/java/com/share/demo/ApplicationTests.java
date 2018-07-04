package com.share.demo;

import com.share.demo.mapper.VoteMapper;
import com.share.demo.model.Vote;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javafx.application.Application;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private VoteMapper voteMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	@Rollback
	public void testUserMapper() throws Exception {
		List<Vote> voteList = voteMapper.selectAll();
		for(Vote vote : voteList) {
			System.out.println(vote.getUserName());
		}
	}

}
