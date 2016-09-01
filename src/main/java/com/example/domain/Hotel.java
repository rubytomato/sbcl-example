package com.example.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Hotel implements Serializable {

	private static final long serialVersionUID = 2066853980856245769L;

	private Long city;

	private String name;

	private String address;

	private String zip;

}
