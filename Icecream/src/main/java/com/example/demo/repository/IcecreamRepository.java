package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Icecream;
@Repository
public interface IcecreamRepository extends JpaRepository<Icecream,Integer> {

}
