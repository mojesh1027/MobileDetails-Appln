package com.mojesh.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private Integer modelno;
	private String modelname;
	private Integer ram_size;
	private Integer rom_siz;
	private String os_name;
	private String processer_name;
	private Integer fcam_size;
	private Integer bcam_size;
	private String copany_name;
	private Integer imei_no;
	private String comments;
	private Double ratings;
	public Mobile() {
		super();
	}
	public Integer getModelno() {
		return modelno;
	}
	public void setModelno(Integer modelno) {
		this.modelno = modelno;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public Integer getRam_size() {
		return ram_size;
	}
	public void setRam_size(Integer ram_size) {
		this.ram_size = ram_size;
	}
	public Integer getRom_siz() {
		return rom_siz;
	}
	public void setRom_siz(Integer rom_siz) {
		this.rom_siz = rom_siz;
	}
	public String getOs_name() {
		return os_name;
	}
	public void setOs_name(String os_name) {
		this.os_name = os_name;
	}
	public String getProcesser_name() {
		return processer_name;
	}
	public void setProcesser_name(String processer_name) {
		this.processer_name = processer_name;
	}
	public Integer getFcam_size() {
		return fcam_size;
	}
	public void setFcam_size(Integer fcam_size) {
		this.fcam_size = fcam_size;
	}
	public Integer getBcam_size() {
		return bcam_size;
	}
	public void setBcam_size(Integer bcam_size) {
		this.bcam_size = bcam_size;
	}
	public String getCopany_name() {
		return copany_name;
	}
	public void setCopany_name(String copany_name) {
		this.copany_name = copany_name;
	}
	public Integer getImei_no() {
		return imei_no;
	}
	public void setImei_no(Integer imei_no) {
		this.imei_no = imei_no;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Double getRatings() {
		return ratings;
	}
	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "Mobile [modelno=" + modelno + ", modelname=" + modelname + ", ram_size=" + ram_size + ", rom_siz="
				+ rom_siz + ", os_name=" + os_name + ", processer_name=" + processer_name + ", fcam_size=" + fcam_size
				+ ", bcam_size=" + bcam_size + ", copany_name=" + copany_name + ", imei_no=" + imei_no + ", comments="
				+ comments + ", ratings=" + ratings + "]";
	}
	
	
}
