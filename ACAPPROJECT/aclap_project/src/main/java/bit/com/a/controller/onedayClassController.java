package bit.com.a.controller;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bit.com.a.dto.oneDayClassParam;
import bit.com.a.dto.onedayClassDto;
import bit.com.a.mail.MailSend;
import bit.com.a.service.onedayClassService;

@RestController
public class onedayClassController {
	@Autowired
	onedayClassService onedayClassService;
	
	// mypage.html에서 classDtail 정보를 얻기위함
	@RequestMapping(value = "/classDtail", method = RequestMethod.POST)
	public onedayClassDto classDtail(onedayClassDto dto) {
		System.out.println("classDtail dto =" + dto.toString());
		
		onedayClassDto oClass = onedayClassService.getOnedayClass(dto);
		System.out.println("oClass = " + oClass.toString());
		
		return oClass;
	}

	// TODO 문의메일 발송 
	@RequestMapping(value = "/contactMail", method = RequestMethod.POST)
	public boolean contactMail(String name, String mail, String content) {
		System.out.println("///// MemberController emailSend() /////");
		System.out.println("이름 : "+name);
		System.out.println("메일 : "+mail);
		System.out.println("내용 : "+content);

		boolean b = MailSend.contactMail(name, mail, content);
		if(b) 
			System.out.println("Mail send Success!");
		else
			System.out.println("Mail send Fail!");
		return b;
	}
	
	
	
	
	// 클래스 카테고리별 뷰 에서 클래스 리스트 가져오기
	@RequestMapping(value="/classListData", method = {RequestMethod.GET, RequestMethod.POST})
	public List<onedayClassDto> classListData(oneDayClassParam param){
		System.out.println("oneDayClassController classListData()" + new Date());
		
		System.out.println("파라미터 확인"+ param);
		
		
		List<onedayClassDto> cList = onedayClassService.classListData(param);
		
		return cList;
		
	}
	
	
	
	// Home_클래스 최신순 출력 
	@RequestMapping(value="/getNewestClassList", method = {RequestMethod.GET, RequestMethod.POST})
	public List<onedayClassDto> getNewestClassList(){
		System.out.println("////////// oneDayClassController getNewestClassList() //////////");

		List<onedayClassDto> list = onedayClassService.getNewestClassList();
		if(list.size() != 0) 
			System.out.println("getNewestClassList Success");		
		return list;
	}
	
	// Home_클래스 인기순 출력 
	@RequestMapping(value="/getBestClassList", method = {RequestMethod.GET, RequestMethod.POST})
	public List<onedayClassDto> getBestClassList(){
		System.out.println("////////// oneDayClassController getBestClassList() //////////");

		List<onedayClassDto> list = onedayClassService.getBestClassList();
		if(list.size() != 0) 
			System.out.println("getBestClassList Success");		
		return list;
	}
	
}