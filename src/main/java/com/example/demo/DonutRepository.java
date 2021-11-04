
package com.example.demo;

import com.example.demo.Donut;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DonutRepository extends CrudRepository<Donut, Long> {  
    List<Donut> findByNameIgnoreCase(String name);  
}