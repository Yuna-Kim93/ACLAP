package bit.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import bit.com.a.dto.scheduleDto;

@Mapper
@Repository
public interface scheduleDao {

	// mypage.html 에서 해당 월에 schedule을 얻어오기 위함
	public List<scheduleDto> getMySchedule(scheduleDto dto);
	
	// mypage.html에서 master에 schedule을 얻어오기 위함
	public List<scheduleDto> myclsScheduleData(int memNum);
	
	// mypage.html에서 신청한 수업 count
	public int regiCount(scheduleDto dto);
	
	// mypage.html에서 수강한 수업 count
	public int appendCount(scheduleDto dto);
	
}
