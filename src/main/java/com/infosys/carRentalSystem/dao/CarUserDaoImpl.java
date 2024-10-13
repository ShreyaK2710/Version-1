package com.infosys.carRentalSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.infosys.carRentalSystem.bean.carUser;

@Service
@Repository
public class CarUserDaoImpl implements CarUserDao {
	
	@Autowired
	private CarUserRepository repository;

	@Override
	public void save(carUser CarUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<carUser> displayAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public carUser findById(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
