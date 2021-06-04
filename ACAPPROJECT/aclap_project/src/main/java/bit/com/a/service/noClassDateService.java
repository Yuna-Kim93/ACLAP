package bit.com.a.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bit.com.a.dao.noClassDateDao;
import bit.com.a.dto.noClassDateDto;
import bit.com.a.dto.onedayClassDto;

@Service
@Transactional
public class noClassDateService {
	
	@Autowired
	noClassDateDao noClassDateDao; 
	
	public void addNoClassDate(noClassDateDto dto) {
		noClassDateDao.addNoClassDate(dto);
		System.out.println("== addNoClassDate Success! ==");
	};
	public List<String> getNoClassDate(onedayClassDto dto){
		List <String> list = noClassDateDao.getNoClassDate(dto);
		List <String> output = new ArrayList<>();
		if(list!=null) {
			for (String str : list) 
				output.add(str.substring(0, 10));
			System.out.println("=== (Service) getNoClassDate Success ===");
		}
		return output;
	};
}