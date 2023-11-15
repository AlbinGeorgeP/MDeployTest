package com.ManualDeployTest.ManualDeployTest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<user,Integer> {


}
