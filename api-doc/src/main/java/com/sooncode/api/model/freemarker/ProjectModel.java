package com.sooncode.api.model.freemarker;

import java.io.Serializable;
import java.util.List;

public class ProjectModel implements  Serializable{
	  
	private static final long serialVersionUID = 1L;
	/** 项目编号 */ 
	 private String projectId; 
	 /** 是否发布 */
	 private String isIssue ;
	 /** 创建时间 */
	 private java.util.Date creatDate ;
	 /** 项目代码 */
	 private String projectCode ;
	 /** 作者姓名 */
	 private String authorName ;
	 /** 权重 */
	 private Integer weight ;
	 /** 资源前缀 */
	 private String urlPrefix ;
	 /** 项目名称 */
	 private String projectName ;
	 /** 项目简介 */
	 private String projectIntro ;
	 /** 公司编号 */
	 private String companyId ;
	 /** 版本号 */
	 private String versions ;

	private List<ModuleModel> modules;

	 
	 

	public List<ModuleModel> getModules() {
		return modules;
	}

	public void setModules(List<ModuleModel> modules) {
		this.modules = modules;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getIsIssue() {
		return isIssue;
	}

	public void setIsIssue(String isIssue) {
		this.isIssue = isIssue;
	}

	public java.util.Date getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(java.util.Date creatDate) {
		this.creatDate = creatDate;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getUrlPrefix() {
		return urlPrefix;
	}

	public void setUrlPrefix(String urlPrefix) {
		this.urlPrefix = urlPrefix;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectIntro() {
		return projectIntro;
	}

	public void setProjectIntro(String projectIntro) {
		this.projectIntro = projectIntro;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getVersions() {
		return versions;
	}

	public void setVersions(String versions) {
		this.versions = versions;
	}
	
	

}
