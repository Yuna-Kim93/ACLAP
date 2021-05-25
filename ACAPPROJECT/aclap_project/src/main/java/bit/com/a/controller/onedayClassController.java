package bit.com.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}