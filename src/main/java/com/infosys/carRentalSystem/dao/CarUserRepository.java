package com.infosys.carRentalSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infosys.carRentalSystem.bean.carUser;

public interface CarUserRepository extends JpaRepository<carUser, String> {

}
