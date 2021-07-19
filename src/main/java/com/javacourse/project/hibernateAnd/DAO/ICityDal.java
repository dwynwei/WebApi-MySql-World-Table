package com.javacourse.project.hibernateAnd.DAO;
import com.javacourse.project.hibernateAnd.Entities.City;
import java.util.List;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void remove(City city);
	City getbyId(int id);
}
