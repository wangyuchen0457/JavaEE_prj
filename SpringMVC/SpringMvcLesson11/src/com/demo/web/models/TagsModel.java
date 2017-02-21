package com.demo.web.models;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TagsModel {

	private String username;
	private String password;
	private boolean testBoolean;
	private String[] selectArray;
	private String[] testArray;
	private Integer radiobuttonId;
	private Integer selectId;
	private List<Integer> selectIds;
	private Map<Integer, String> testMap;
	private String remark;

}
