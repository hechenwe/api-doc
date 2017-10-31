package com.sooncode.api.model.freemarker;

import java.io.Serializable;
import java.util.List;

import com.sooncode.api.entity.Parameter;

public class InterfacModel implements  Serializable{
 
	private static final long serialVersionUID = 1L;
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
	
	private List<Parameter> parameters;

	 

	public String getInterfacId() {
		return interfacId;
	}

	public void setInterfacId(String interfacId) {
		this.interfacId = interfacId;
	}

	public String getInterfacName() {
		return interfacName;
	}

	public void setInterfacName(String interfacName) {
		this.interfacName = interfacName;
	}

	public String getJsonParameters() {
		return jsonParameters;
	}

	public void setJsonParameters(String jsonParameters) {
		this.jsonParameters = jsonParameters;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getReturnDataType() {
		return returnDataType;
	}

	public void setReturnDataType(String returnDataType) {
		this.returnDataType = returnDataType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getInterfacIntro() {
		return interfacIntro;
	}

	public void setInterfacIntro(String interfacIntro) {
		this.interfacIntro = interfacIntro;
	}

	public String getInterfacCode() {
		return interfacCode;
	}

	public void setInterfacCode(String interfacCode) {
		this.interfacCode = interfacCode;
	}

	public String getParameterFormat() {
		return parameterFormat;
	}

	public void setParameterFormat(String parameterFormat) {
		this.parameterFormat = parameterFormat;
	}

	public java.util.Date getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(java.util.Date creatDate) {
		this.creatDate = creatDate;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	 
	
	
}
