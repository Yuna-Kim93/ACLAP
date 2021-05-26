package bit.com.a.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bit.com.a.dao.onedayClassDao;
import bit.com.a.dto.oneDayClassParam;
import bit.com.a.dto.onedayClassDto;
import bit.com.a.dto.onedayParam;

@Service
@Transactional
public class onedayClassService {
	
	@Autowired
	private onedayClassDao onedayClassDao;
	
	public List<onedayClassDto> getClassList(onedayParam par){
		System.out.println("onedayClassService getClassList 왔음 " + new Date());
	//  System.out.println(par.getName() + par.getPage());
		
		return onedayClassDao.getClassList(par);
	}
	
	public int classCount(onedayParam par) {
		System.out.println("onedayClassService classCount 왔음 " + new Date());

		return onedayClassDao.classCount(par);
	}
	

	//------------------------------mypage-----------------------------
	public onedayClassDto getOnedayClass(onedayClassDto dto){
		onedayClassDto oClass = onedayClassDao.getOnedayClass(dto);
		System.out.println("onedayClassService oClass = " + oClass.toString());
		return oClass;
	}

	public List<onedayClassDto> classListData(oneDayClassParam param) {
		return onedayClassDao.classListData(param);
	}
	
}
