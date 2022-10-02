package com.jpa.Spring_JPA_Dat_BTVN.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.Spring_JPA_Dat_BTVN.enity.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, String>{

	@Query(value = "select * from maybay where tambay>=?1",nativeQuery = true)
    public List<MayBay> findByTambayMoreThanNKm(Integer tambay);

    @Query(value = "select  count(*) from maybay where loai like %?1%",nativeQuery = true)
    public Integer countMaybayByLoai(String loai);
}
