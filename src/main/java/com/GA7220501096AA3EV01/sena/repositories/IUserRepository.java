package com.GA7220501096AA3EV01.sena.repositories;

import com.GA7220501096AA3EV01.sena.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Integer>{

}
