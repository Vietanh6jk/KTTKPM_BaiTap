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
@Entity
@Setter
@Getter
@Table(name="nhanvien")
public class NhanVien {
	@Id
	@GeneratedValue
	private String maNV;
	@Column
	private String ten;
	@Column
	private String luong;
}
