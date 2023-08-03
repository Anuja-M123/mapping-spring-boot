package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long>{
    
}
