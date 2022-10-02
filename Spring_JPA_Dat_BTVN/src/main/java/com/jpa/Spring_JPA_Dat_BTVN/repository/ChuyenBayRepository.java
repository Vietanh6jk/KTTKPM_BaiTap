package com.jpa.Spring_JPA_Dat_BTVN.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.Spring_JPA_Dat_BTVN.enity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay,String>{
	public List<ChuyenBay> findByGaDen(String gaden);
	@Query("SELECT c FROM chuyenbay c WHERE (c.dodai) >=(:minDoDai) and (c.dodai) <(:maxDoDai)")
	public List<ChuyenBay> findChuyenBayByDoDai(@Param("minDoDai") int minDoDai,@Param("maxDoDai") int maxDoDai);
    public List<ChuyenBay> findByGaDiAndGaDen(String gaDi, String gaden);
    public Integer countByGaDi(String gadi);
}
