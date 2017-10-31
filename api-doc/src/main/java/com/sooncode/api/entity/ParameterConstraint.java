
package com.sooncode.api.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class ParameterConstraint implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 约束编号 */ 
	 private String parameterConstraintId; 
	 /** 约束代码 */
	 private String parameterConstraintCode ;
	 /** 约束名称 */
	 private String parameterConstraintName ;
	 /** 创建时间 */
	 private java.util.Date creatDate ;
	 /** 约束说明 */
	 private String parameterConstraintExplain ;
	 /** 权重 */
	 private Integer weight ;
	 /** 参数_编号 */
	 private String parameterId ;

	 /** 约束代码 */
	 public String getParameterConstraintCode() { 
	 	 return parameterConstraintCode;
	 }
	 /** 约束代码 */
	 public void setParameterConstraintCode(String parameterConstraintCode) {
	 	 this.parameterConstraintCode = parameterConstraintCode;
	 }

	 /** 约束名称 */
	 public String getParameterConstraintName() { 
	 	 return parameterConstraintName;
	 }
	 /** 约束名称 */
	 public void setParameterConstraintName(String parameterConstraintName) {
	 	 this.parameterConstraintName = parameterConstraintName;
	 }

	 /** 创建时间 */
	 public java.util.Date getCreatDate() { 
	 	 return creatDate;
	 }
	 /** 创建时间 */
	 public void setCreatDate(java.util.Date creatDate) {
	 	 this.creatDate = creatDate;
	 }

	 /** 约束说明 */
	 public String getParameterConstraintExplain() { 
	 	 return parameterConstraintExplain;
	 }
	 /** 约束说明 */
	 public void setParameterConstraintExplain(String parameterConstraintExplain) {
	 	 this.parameterConstraintExplain = parameterConstraintExplain;
	 }

	 /** 权重 */
	 public Integer getWeight() { 
	 	 return weight;
	 }
	 /** 权重 */
	 public void setWeight(Integer weight) {
	 	 this.weight = weight;
	 }

	 /** 约束编号 */
	 public String getParameterConstraintId() { 
	 	 return parameterConstraintId;
	 }
	 /** 约束编号 */
	 public void setParameterConstraintId(String parameterConstraintId) {
	 	 this.parameterConstraintId = parameterConstraintId;
	 }

	 /** 参数_编号 */
	 public String getParameterId() { 
	 	 return parameterId;
	 }
	 /** 参数_编号 */
	 public void setParameterId(String parameterId) {
	 	 this.parameterId = parameterId;
	 }

}
