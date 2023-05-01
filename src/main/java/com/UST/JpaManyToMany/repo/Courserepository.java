package com.UST.JpaManyToMany.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.UST.JpaManyToMany.entity.Cource;

public interface Courserepository extends JpaRepository<Cource, Long>{
//
//	List<Cource> findCourcelessthanprice(double price);

}
