package com.javacourse.project.hibernateAnd.Business;
import java.util.List;
import com.javacourse.project.hibernateAnd.Entities.City;

public interface ICityService {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void remove(City city);
	City getById(int id);
}
