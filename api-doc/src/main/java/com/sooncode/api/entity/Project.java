
package com.sooncode.api.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class Project implements Serializable{ 
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

	 /** 是否发布 */
	 public String getIsIssue() { 
	 	 return isIssue;
	 }
	 /** 是否发布 */
	 public void setIsIssue(String isIssue) {
	 	 this.isIssue = isIssue;
	 }

	 /** 创建时间 */
	 public java.util.Date getCreatDate() { 
	 	 return creatDate;
	 }
	 /** 创建时间 */
	 public void setCreatDate(java.util.Date creatDate) {
	 	 this.creatDate = creatDate;
	 }

	 /** 项目代码 */
	 public String getProjectCode() { 
	 	 return projectCode;
	 }
	 /** 项目代码 */
	 public void setProjectCode(String projectCode) {
	 	 this.projectCode = projectCode;
	 }

	 /** 作者姓名 */
	 public String getAuthorName() { 
	 	 return authorName;
	 }
	 /** 作者姓名 */
	 public void setAuthorName(String authorName) {
	 	 this.authorName = authorName;
	 }

	 /** 权重 */
	 public Integer getWeight() { 
	 	 return weight;
	 }
	 /** 权重 */
	 public void setWeight(Integer weight) {
	 	 this.weight = weight;
	 }

	 /** 资源前缀 */
	 public String getUrlPrefix() { 
	 	 return urlPrefix;
	 }
	 /** 资源前缀 */
	 public void setUrlPrefix(String urlPrefix) {
	 	 this.urlPrefix = urlPrefix;
	 }

	 /** 项目编号 */
	 public String getProjectId() { 
	 	 return projectId;
	 }
	 /** 项目编号 */
	 public void setProjectId(String projectId) {
	 	 this.projectId = projectId;
	 }

	 /** 项目名称 */
	 public String getProjectName() { 
	 	 return projectName;
	 }
	 /** 项目名称 */
	 public void setProjectName(String projectName) {
	 	 this.projectName = projectName;
	 }

	 /** 项目简介 */
	 public String getProjectIntro() { 
	 	 return projectIntro;
	 }
	 /** 项目简介 */
	 public void setProjectIntro(String projectIntro) {
	 	 this.projectIntro = projectIntro;
	 }

	 /** 公司编号 */
	 public String getCompanyId() { 
	 	 return companyId;
	 }
	 /** 公司编号 */
	 public void setCompanyId(String companyId) {
	 	 this.companyId = companyId;
	 }

	 /** 版本号 */
	 public String getVersions() { 
	 	 return versions;
	 }
	 /** 版本号 */
	 public void setVersions(String versions) {
	 	 this.versions = versions;
	 }

}
