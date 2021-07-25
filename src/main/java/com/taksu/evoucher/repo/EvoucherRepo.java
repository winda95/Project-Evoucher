package com.taksu.evoucher.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taksu.evoucher.model.Evoucher;

public interface EvoucherRepo extends JpaRepository<Evoucher, Long>{
	void deleteEvoucherbyID(Long id);

	Evoucher findEvoucherbyId(Long id);
}
