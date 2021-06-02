package bit.com.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bit.com.a.dto.likesDto;

import bit.com.a.service.likesService;

@RestController
public class likesController {
	@Autowired
	likesService likesService;
	
	

	// like 유무 체크 : like == true
	@RequestMapping(value="/checkLike", method = {RequestMethod.GET, RequestMethod.POST})
	public boolean checkLike(likesDto dto){		
		boolean result = false;
		int n = likesService.checkLike(dto); 
		if(n>0)
			result = true;
		return result;
	}
	
	
	// like 추가
	@RequestMapping(value="/addLike", method = {RequestMethod.GET, RequestMethod.POST})
	public void addLike(likesDto dto){
		System.out.println("/////////////// likesController addLike() ///////////////");
		System.out.println("memNum : " +dto.getClassNum());
		System.out.println("classNum : "+dto.getMemNum());
		
		  int n = likesService.addLike(dto); 
		  if(n>0)
			  System.out.println("/// Insert Like success ///");
	}
	
	
	// like 삭제
	@RequestMapping(value="/delLike", method = {RequestMethod.GET, RequestMethod.POST})
	public void delLike(likesDto dto){
		System.out.println("/////////////// likesController delLike() ///////////////");
		System.out.println("memNum : " +dto.getClassNum());
		System.out.println("classNum : "+dto.getMemNum());
		
		int n = likesService.delLike(dto);
		if(n>0)
			System.out.println("/// delete Like success ///");
	}
	
	
	
	
}
