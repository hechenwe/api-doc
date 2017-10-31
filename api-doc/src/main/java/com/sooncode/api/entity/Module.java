
package com.sooncode.api.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class Module implements Serializable{ 
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

	 /** 模块简介 */
	 public String getModuleIntro() { 
	 	 return moduleIntro;
	 }
	 /** 模块简介 */
	 public void setModuleIntro(String moduleIntro) {
	 	 this.moduleIntro = moduleIntro;
	 }

	 /** 模块名称 */
	 public String getModuleName() { 
	 	 return moduleName;
	 }
	 /** 模块名称 */
	 public void setModuleName(String moduleName) {
	 	 this.moduleName = moduleName;
	 }

	 /** 模块代码 */
	 public String getModuleCode() { 
	 	 return moduleCode;
	 }
	 /** 模块代码 */
	 public void setModuleCode(String moduleCode) {
	 	 this.moduleCode = moduleCode;
	 }

	 /** 创建时间 */
	 public java.util.Date getCreatDate() { 
	 	 return creatDate;
	 }
	 /** 创建时间 */
	 public void setCreatDate(java.util.Date creatDate) {
	 	 this.creatDate = creatDate;
	 }

	 /** 模块编号 */
	 public String getModuleId() { 
	 	 return moduleId;
	 }
	 /** 模块编号 */
	 public void setModuleId(String moduleId) {
	 	 this.moduleId = moduleId;
	 }

	 /** 权重 */
	 public Integer getWeight() { 
	 	 return weight;
	 }
	 /** 权重 */
	 public void setWeight(Integer weight) {
	 	 this.weight = weight;
	 }

	 /** 项目_编号 */
	 public String getProjectId() { 
	 	 return projectId;
	 }
	 /** 项目_编号 */
	 public void setProjectId(String projectId) {
	 	 this.projectId = projectId;
	 }

}
