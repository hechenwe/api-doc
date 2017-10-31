package com.sooncode.api.model.freemarker;

import java.io.Serializable;
import java.util.List;

public class ModuleModel implements  Serializable {

	 
	private static final long serialVersionUID = 1L;
	/** 模块编号 */ 
	 private String moduleId; 
	 /** 模块简介 */
	 private String moduleIntro ;
	 /** 模块名称 */
	 private String moduleName ;
	 /** 模块代码 */
	 private String moduleCode ;
	 /** 创建时间 */
	 private java.util.Date creatDate ;
	 /** 权重 */
	 private Integer weight ;
	 /** 项目_编号 */
	 private String projectId ;
	
	private List<InterfacModel> interfacs;

	 

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleIntro() {
		return moduleIntro;
	}

	public void setModuleIntro(String moduleIntro) {
		this.moduleIntro = moduleIntro;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public java.util.Date getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(java.util.Date creatDate) {
		this.creatDate = creatDate;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public List<InterfacModel> getInterfacs() {
		return interfacs;
	}

	public void setInterfacs(List<InterfacModel> interfacs) {
		this.interfacs = interfacs;
	}

	 
	
	
}
