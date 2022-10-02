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
@Entity
@Data
@Table(name="nhanvien")
public class NhanVien {
	@Id
	@GeneratedValue
	@Column(name="manv")
	private String maNV;
	@Column(name="ten")
	private String ten;
	@Column(name="luong")
	private String luong;
}
