package com.javacourse.project.hibernateAnd.Business;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javacourse.project.hibernateAnd.DAO.ICityDal;
import com.javacourse.project.hibernateAnd.Entities.City;

@Service
public class CityManager implements ICityService {

	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		this.cityDal.add(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	@Override
	@Transactional
	public void remove(City city) {
		this.cityDal.remove(city);
		
	}
	
	@Override
	@Transactional
	public City getById(int id) {
		return this.cityDal.getbyId(id);
		
	}

}
