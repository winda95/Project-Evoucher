package com.taksu.evoucher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.taksu.evoucher.model.Evoucher;
import com.taksu.evoucher.repo.EvoucherRepo;


@Service
@Repository
public class EvoucherService{
	private final EvoucherRepo evoucherRepo;
	@Autowired
	public EvoucherService(EvoucherRepo evoucherRepo) {
		this.evoucherRepo=evoucherRepo;
	}
	
	public Evoucher addEvoucher(Evoucher evoucher) {
		return evoucherRepo.save(evoucher);
	}
	
	public List<Evoucher> findAllEvoucher(){
		return  evoucherRepo.findAll();
	}
	
	public Evoucher updateEvoucher(Evoucher evoucher) {
		return evoucherRepo.save(evoucher);
	}
	
	public Evoucher findEvoucherbyId(Long id) {
		return evoucherRepo.findEvoucherbyId(id);
	}


	public void deleteEvoucher(Long id) {
		evoucherRepo.deleteEvoucherbyID(id);
	}
	
	
}
