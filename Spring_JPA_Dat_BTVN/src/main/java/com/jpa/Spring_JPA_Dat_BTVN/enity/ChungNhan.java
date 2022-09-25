package com.jpa.Spring_JPA_Dat_BTVN.enity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChungNhan {
	@Column(name = "macb")
	private String maNV;
	@Column(name = "manv")
	private String maMB;
}
