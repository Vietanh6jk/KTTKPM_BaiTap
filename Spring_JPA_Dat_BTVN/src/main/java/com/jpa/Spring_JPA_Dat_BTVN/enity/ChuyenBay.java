package com.jpa.Spring_JPA_Dat_BTVN.enity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Entity ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@DynamicUpdate
@Table(name = "chuyenbay")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChuyenBay {
	
	@Id
	@GeneratedValue
	@Column(name = "macb",columnDefinition = "varchar(50)")
	private String maCB;
	@Column(name = "gadi")
	private String gaDi;
	@Column(name = "gaden")
	private String gaDen;
	@Column(name = "dodai")
	private int doDai;
	@Column(name = "giodi")
	private Date gioDi;
	@Column(name = "gioden")
    private Time gioden;
	@Column(name = "chiphi")
	private int chiPhi;
	
}
