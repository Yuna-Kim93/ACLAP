package bit.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bit.com.a.dao.scheduleDao;
import bit.com.a.dto.scheduleDto;

@Service
@Transactional
public class scheduleService {
	
	@Autowired
	private scheduleDao scheduleDao;
	
	// mypage.html 에서 해당 월에 schedule을 얻어오기 위함
	public List<scheduleDto> getMySchedule(scheduleDto dto){
		return scheduleDao.getMySchedule(dto);
	}
	
	// mypage.html에서 master에 schedule을 얻어오기 위함
	public List<scheduleDto> myclsScheduleData(int memNum) {
		return scheduleDao.myclsScheduleData(memNum);	
	}
	
	// mypage.html에서 신청한 수업 count
	public int regiCount(scheduleDto dto) {
		return scheduleDao.regiCount(dto);	
	}
	
	// mypage.html에서 수강한 수업 count
	public int appendCount(scheduleDto dto) {
		return scheduleDao.appendCount(dto);	
	}

}
