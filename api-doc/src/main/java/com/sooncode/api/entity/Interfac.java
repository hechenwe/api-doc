
package com.sooncode.api.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class Interfac implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 接口编号 */ 
	 private String interfacId; 
	 /** 接口名称 */
	 private String interfacName ;
	 /** JSON格式的参数 */
	 private String jsonParameters ;
	 /** 风格 */
	 private String style ;
	 /** 返回数据类型 */
	 private String returnDataType ;
	 /** 接口链接 */
	 private String url ;
	 /** 接口简介 */
	 private String interfacIntro ;
	 /** 接口代码 */
	 private String interfacCode ;
	 /** 参数格式 */
	 private String parameterFormat ;
	 /** 创建时间 */
	 private java.util.Date creatDate ;
	 /** 请求方式 */
	 private String requestType ;
	 /** 模块_编号 */
	 private String moduleId ;
	 /** 权重 */
	 private Integer weight ;

	 /** 接口名称 */
	 public String getInterfacName() { 
	 	 return interfacName;
	 }
	 /** 接口名称 */
	 public void setInterfacName(String interfacName) {
	 	 this.interfacName = interfacName;
	 }

	 /** JSON格式的参数 */
	 public String getJsonParameters() { 
	 	 return jsonParameters;
	 }
	 /** JSON格式的参数 */
	 public void setJsonParameters(String jsonParameters) {
	 	 this.jsonParameters = jsonParameters;
	 }

	 /** 风格 */
	 public String getStyle() { 
	 	 return style;
	 }
	 /** 风格 */
	 public void setStyle(String style) {
	 	 this.style = style;
	 }

	 /** 接口编号 */
	 public String getInterfacId() { 
	 	 return interfacId;
	 }
	 /** 接口编号 */
	 public void setInterfacId(String interfacId) {
	 	 this.interfacId = interfacId;
	 }

	 /** 返回数据类型 */
	 public String getReturnDataType() { 
	 	 return returnDataType;
	 }
	 /** 返回数据类型 */
	 public void setReturnDataType(String returnDataType) {
	 	 this.returnDataType = returnDataType;
	 }

	 /** 接口链接 */
	 public String getUrl() { 
	 	 return url;
	 }
	 /** 接口链接 */
	 public void setUrl(String url) {
	 	 this.url = url;
	 }

	 /** 接口简介 */
	 public String getInterfacIntro() { 
	 	 return interfacIntro;
	 }
	 /** 接口简介 */
	 public void setInterfacIntro(String interfacIntro) {
	 	 this.interfacIntro = interfacIntro;
	 }

	 /** 接口代码 */
	 public String getInterfacCode() { 
	 	 return interfacCode;
	 }
	 /** 接口代码 */
	 public void setInterfacCode(String interfacCode) {
	 	 this.interfacCode = interfacCode;
	 }

	 /** 参数格式 */
	 public String getParameterFormat() { 
	 	 return parameterFormat;
	 }
	 /** 参数格式 */
	 public void setParameterFormat(String parameterFormat) {
	 	 this.parameterFormat = parameterFormat;
	 }

	 /** 创建时间 */
	 public java.util.Date getCreatDate() { 
	 	 return creatDate;
	 }
	 /** 创建时间 */
	 public void setCreatDate(java.util.Date creatDate) {
	 	 this.creatDate = creatDate;
	 }

	 /** 请求方式 */
	 public String getRequestType() { 
	 	 return requestType;
	 }
	 /** 请求方式 */
	 public void setRequestType(String requestType) {
	 	 this.requestType = requestType;
	 }

	 /** 模块_编号 */
	 public String getModuleId() { 
	 	 return moduleId;
	 }
	 /** 模块_编号 */
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

}
