package com.jpa.Spring_JPA_Dat_BTVN.enity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Entity ;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@DynamicUpdate
@Table(name="maybay")
@Entity
@Data
public class MayBay {
	@Id
	@GeneratedValue
	@Column(name="mamb")
	private String maMB;
	@Column(name = "loai")
	private String Loai;
	@Column(name="tambay")
	private int tamBay;
	
	

}
