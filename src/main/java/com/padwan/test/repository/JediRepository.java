package com.padwan.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.padwan.test.entity.Jedi;

@Repository
public interface JediRepository extends JpaRepository<Jedi, Integer> {
	
	@Query(value="SELECT * "
			+ "FROM jedi "
			+ "WHERE status = 2", nativeQuery = true)
	List<Jedi> mestresEAprendizes();
	
	@Query(value="SELECT * "
			+ "FROM jedi "
			+ "WHERE midichlorians > 9000", nativeQuery = true)
	List<Jedi> midichlorians9K();
	
	@Query(value="SELECT status AS status, COUNT(id) AS quantidade "
			+ "FROM jedi "
			+ "GROUP BY status", nativeQuery = true)
	List<Object> quantidadeCategoria();
}
