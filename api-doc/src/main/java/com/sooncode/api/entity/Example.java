
package com.sooncode.api.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class Example implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 事例编号 */ 
	 private String exampleId; 
	 /** 创建时间 */
	 private java.util.Date creatDate ;
	 /** 事例内容 */
	 private String exampleContent ;
	 /** 权重 */
	 private Integer weight ;
	 /** 接口_编号 */
	 private String interfacId ;
	 /** 事例名称 */
	 private String exampleType ;

	 /** 事例编号 */
	 public String getExampleId() { 
	 	 return exampleId;
	 }
	 /** 事例编号 */
	 public void setExampleId(String exampleId) {
	 	 this.exampleId = exampleId;
	 }

	 /** 创建时间 */
	 public java.util.Date getCreatDate() { 
	 	 return creatDate;
	 }
	 /** 创建时间 */
	 public void setCreatDate(java.util.Date creatDate) {
	 	 this.creatDate = creatDate;
	 }

	 /** 事例内容 */
	 public String getExampleContent() { 
	 	 return exampleContent;
	 }
	 /** 事例内容 */
	 public void setExampleContent(String exampleContent) {
	 	 this.exampleContent = exampleContent;
	 }

	 /** 权重 */
	 public Integer getWeight() { 
	 	 return weight;
	 }
	 /** 权重 */
	 public void setWeight(Integer weight) {
	 	 this.weight = weight;
	 }

	 /** 接口_编号 */
	 public String getInterfacId() { 
	 	 return interfacId;
	 }
	 /** 接口_编号 */
	 public void setInterfacId(String interfacId) {
	 	 this.interfacId = interfacId;
	 }

	 /** 事例名称 */
	 public String getExampleType() { 
	 	 return exampleType;
	 }
	 /** 事例名称 */
	 public void setExampleType(String exampleType) {
	 	 this.exampleType = exampleType;
	 }

}
