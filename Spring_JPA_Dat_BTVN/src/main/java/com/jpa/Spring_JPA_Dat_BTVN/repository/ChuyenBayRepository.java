package com.jpa.Spring_JPA_Dat_BTVN.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.Spring_JPA_Dat_BTVN.enity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay,String>{
	public List<ChuyenBay> findChuyenBayByGaDen(String gaDen);
	public List<ChuyenBay> findChuyenBayByDoDai(int minDoDai, int maxDoDai);
    public List<ChuyenBay> findChuyenBayByGaDiAndGaDen(String gaDi, String gaDen);
    public Integer countChuyenbayByGaDi(String gaDi);
}
