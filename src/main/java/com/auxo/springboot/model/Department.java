package com.auxo.springboot.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "department")
@EntityListeners(AuditingEntityListener.class)



public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long dprtid;

	public long getDprtid() {
		return dprtid;
	}

	public void setDprtid(long dprtid) {
		this.dprtid = dprtid;
	}

//	enum roll {
//		HR, Development, Marketing, Support;
//	}

	
}
