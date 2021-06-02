package bit.com.a.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import bit.com.a.dto.likesDto;

@Mapper
@Repository
public interface likesDao {
	
	public int checkLike(likesDto dto);
	public int addLike(likesDto dto);
	public int delLike(likesDto dto);
}