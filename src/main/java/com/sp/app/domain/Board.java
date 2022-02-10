package com.sp.app.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Board implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="num", columnDefinition = "NUMBER")
	@SequenceGenerator(name="S_MY_SEQ", sequenceName = "bbs_seq", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "S_MY_SEQ")
	private long num;
	
	@Column(name = "name", nullable = false, length = 30)
	private String name;
	private String pwd;
	private String subject;
	private String content;
	private String ipAddr;
	private String reg_date;
	private int hitCount;
	
}
