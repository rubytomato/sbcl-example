package com.example.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class City implements Serializable {

	private static final long serialVersionUID = -6979108452063457678L;

	private Long id;

	private String name;

	private String state;

	private String country;
}
