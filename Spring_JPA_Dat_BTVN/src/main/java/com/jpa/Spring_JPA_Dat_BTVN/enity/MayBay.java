package com.jpa.Spring_JPA_Dat_BTVN.enity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Entity ;

import lombok.Getter;
import lombok.Setter;

@DynamicUpdate
@Table(name="maybay")
@Entity
@Getter
@Setter
public class MayBay {
	@Id
	@GeneratedValue
	private String maMB;
	@Column
	private String Loai;
	@Column
	private int tamBay;
	
	

}
