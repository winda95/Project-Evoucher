package com.taksu.evoucher;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taksu.evoucher.model.Evoucher;
import com.taksu.evoucher.service.EvoucherService;

@RestController
@RequestMapping("/evoucher")
public class EvoucherResource {
	private final EvoucherService evoucherService;

	public EvoucherResource(EvoucherService evoucherService) {
		this.evoucherService = evoucherService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Evoucher>> getAllEvoucher(){
		List<Evoucher> evouchers = evoucherService.findAllEvoucher();
		return new ResponseEntity<>(evouchers, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Evoucher> getEvoucherbyId(@PathVariable("id") Long id){
		Evoucher evoucher = evoucherService.findEvoucherbyId(id);
		return new ResponseEntity<>(evoucher, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Evoucher> addEvoucher(@RequestBody Evoucher evoucher){
		Evoucher newEvoucher = evoucherService.addEvoucher(evoucher);
		return new ResponseEntity<>(newEvoucher, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Evoucher> updateEvoucher(@RequestBody Evoucher evoucher){
		Evoucher updEvoucher = evoucherService.updateEvoucher(evoucher);
		return new ResponseEntity<>(updEvoucher, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEvoucher(@PathVariable("id") Long id){
		evoucherService.deleteEvoucher(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
