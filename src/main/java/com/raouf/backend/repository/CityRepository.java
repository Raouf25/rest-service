package com.raouf.backend.repository;

import com.raouf.backend.entity.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    @Query(value = "SELECT c FROM City c "
            + "WHERE UPPER(c.name) like CONCAT('%', UPPER(:searchTerm), '%') OR c.postalCode like CONCAT('%', :searchTerm, '%')")
    Page<City> findAllByNameOrPostalCodeIgnoreCaseContaining(@Param("searchTerm") String searchTerm, Pageable pageable);

    List<City> findByPostalCode(String postalCode);
}
