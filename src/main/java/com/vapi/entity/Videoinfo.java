package com.vapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Videoinfo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vId;
	
	private String vTitle;
	
	private String vUrl;
	
	private String tUrl;
	
	private String uploadDate;
	
	private String vDur;
	
	@Lob
	private String description;

	public Videoinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Videoinfo(int vId, String vTitle, String vUrl, String tUrl, String uploadDate, String vDur,
			String description) {
		super();
		this.vId = vId;
		this.vTitle = vTitle;
		this.vUrl = vUrl;
		this.tUrl = tUrl;
		this.uploadDate = uploadDate;
		this.vDur = vDur;
		this.description = description;
	}

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getvTitle() {
		return vTitle;
	}

	public void setvTitle(String vTitle) {
		this.vTitle = vTitle;
	}

	public String getvUrl() {
		return vUrl;
	}

	public void setvUrl(String vUrl) {
		this.vUrl = vUrl;
	}

	public String gettUrl() {
		return tUrl;
	}

	public void settUrl(String tUrl) {
		this.tUrl = tUrl;
	}

	public String getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getvDur() {
		return vDur;
	}

	public void setvDur(String vDur) {
		this.vDur = vDur;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Videoinfo [vId=" + vId + ", vTitle=" + vTitle + ", vUrl=" + vUrl + ", tUrl=" + tUrl + ", uploadDate="
				+ uploadDate + ", vDur=" + vDur + ", description=" + description + "]";
	}
	
}
