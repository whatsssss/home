package org.zerock.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
import org.zerock.mapper.MemberMapper;
import org.zerock.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class MapperTests {

	@Autowired
	private TimeMapper timeMapper;
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Test
	public void testMember() {
		
		MemberVO vo = memberMapper.read("admin95");
		
		log.info(vo);
		
	}
	
	@Test
	public void testTime() {
		
		log.info(timeMapper.getTime());
	}
}
