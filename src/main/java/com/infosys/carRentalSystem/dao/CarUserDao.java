package com.infosys.carRentalSystem.dao;

import java.util.List;

import com.infosys.carRentalSystem.bean.carUser;

public interface CarUserDao {
	public void save(carUser CarUser);
	public List<carUser> displayAll();
	public carUser findById(String email);

}
