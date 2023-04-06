package com.mojesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mojesh.model.Mobile;
@Repository
public interface MobileRepo extends JpaRepository<Mobile, Integer> {

}
