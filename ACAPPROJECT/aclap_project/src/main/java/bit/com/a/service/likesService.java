package bit.com.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bit.com.a.dao.likesDao;
import bit.com.a.dto.likesDto;

@Service
@Transactional
public class likesService {
	
	@Autowired
	likesDao likesDao;
	
	public int checkLike(likesDto dto) {
		return likesDao.checkLike(dto);
	};
	public int addLike(likesDto dto) {
		return likesDao.addLike(dto);
	};
	public int delLike(likesDto dto) {
		return likesDao.delLike(dto);
	};
	
}