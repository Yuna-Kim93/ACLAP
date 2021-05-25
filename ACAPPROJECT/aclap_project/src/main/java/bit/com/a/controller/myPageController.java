package bit.com.a.controller;

import java.text.SimpleDateFormat;
import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bit.com.a.dto.aclapMemberDto;
import bit.com.a.dto.scheduleDto;
import bit.com.a.service.aclapMemberService;
import bit.com.a.service.myPageService;
import bit.com.a.service.scheduleService;

@RestController
public class myPageController {

	@Autowired
	myPageService myPageService;
	
	@Autowired
	aclapMemberService aclapMemberService;
	
	@Autowired
	scheduleService scheduleService;
	
	@RequestMapping(value = "/myinfo", method = RequestMethod.POST)
	public aclapMemberDto myinfo(aclapMemberDto dto) {
		System.out.println("myinfo dto = " + dto.toString());
		
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd");
		
		Date date = new Date();
		
		String sdate = format.format(date);
		System.out.println(sdate);
		
		// aclapMemberDto mem = myPageService.login(dto);
		aclapMemberDto myinfo = aclapMemberService.myinfo(dto);
		
		System.out.println("dto = " + dto.toString());
		
		scheduleDto sdto = new scheduleDto();
		
		sdto.setRdate(sdate);
		sdto.setMemNum(dto.getMemNum());
		
		System.out.println("schedule = " + sdto.toString());
		
		int rCount = scheduleService.regiCount(sdto); 		// 신청한 수업
		int aCount = scheduleService.appendCount(sdto);		 // 수강한 수업
		
		System.out.println("schedule = " + sdto.toString());
		
		System.out.println(rCount + ", " + aCount);
		
		myinfo.setrCount(rCount);
		myinfo.setaCount(aCount);
		System.out.println("myinfo = " + myinfo.toString());
		
		return myinfo;
	}
	
}
