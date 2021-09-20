package com.alexandreluissilva.recclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandreluissilva.recclientes.entities.id;

@Repository
public interface ClientRepository extends JpaRepository <id, Long>{
}
