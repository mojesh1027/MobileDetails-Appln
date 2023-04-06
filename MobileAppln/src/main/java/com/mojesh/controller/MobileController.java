package com.mojesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mojesh.model.Mobile;
import com.mojesh.repo.MobileRepo;

@RestController
public class MobileController {

	@Autowired
	private MobileRepo repo;
	
	@PostMapping("/save")
	public Mobile saveMobile(@RequestBody Mobile mobile)
	{
		Mobile m=repo.save(mobile);
		return m;
	}
	@DeleteMapping("/delete/{modelno}")
	public void deleteMobileDetails(@PathVariable int modelno) {
		repo.deleteById(modelno);
	}
	@GetMapping("/get/{modelno}")
	public Mobile getDetails(@PathVariable int modelno) {
		Mobile m1=repo.findById(modelno).get();
		return m1;
	}
	@GetMapping("/getAll")
	public List<Mobile> getAll(){
		List<Mobile> list=repo.findAll();
		return list;
	}
	@PutMapping("/update/{modelno}")
	public Mobile updateMobileDetails(@RequestBody Mobile mob,@PathVariable int modelno) {
		Mobile m2=repo.findById(modelno).get();
		m2.setRam_size(mob.getRam_size());
		m2.setRom_siz(mob.getRom_siz());
		m2.setOs_name(mob.getOs_name());
		m2.setProcesser_name(mob.getProcesser_name());
		m2.setFcam_size(mob.getFcam_size());
		m2.setBcam_size(mob.getBcam_size());
		m2.setCopany_name(mob.getCopany_name());
		m2.setImei_no(mob.getImei_no());
		m2.setComments(mob.getComments());
		m2.setRatings(mob.getRatings());
		return m2;
	}
}
