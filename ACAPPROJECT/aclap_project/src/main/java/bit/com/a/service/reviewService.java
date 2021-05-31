package bit.com.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bit.com.a.dao.reviewDao;
import bit.com.a.dto.reviewDto;

@Service
@Transactional
public class reviewService {

	@Autowired
	reviewDao reviewDao;
	
	public boolean writeReview(reviewDto dto) {
		return reviewDao.wirteReview(dto);
	}
}
