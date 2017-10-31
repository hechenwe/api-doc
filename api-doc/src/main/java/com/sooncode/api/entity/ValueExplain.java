
package com.sooncode.api.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class ValueExplain implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 参数值说明编号 */ 
	 private String valueExplainId; 
	 /** 值含义 */
	 private String valueMeaning ;
	 /** 常数值 */
	 private String value ;
	 /** 权重 */
	 private Integer weight ;
	 /** 参数_编号 */
	 private String parameterId ;

	 /** 值含义 */
	 public String getValueMeaning() { 
	 	 return valueMeaning;
	 }
	 /** 值含义 */
	 public void setValueMeaning(String valueMeaning) {
	 	 this.valueMeaning = valueMeaning;
	 }

	 /** 常数值 */
	 public String getValue() { 
	 	 return value;
	 }
	 /** 常数值 */
	 public void setValue(String value) {
	 	 this.value = value;
	 }

	 /** 参数值说明编号 */
	 public String getValueExplainId() { 
	 	 return valueExplainId;
	 }
	 /** 参数值说明编号 */
	 public void setValueExplainId(String valueExplainId) {
	 	 this.valueExplainId = valueExplainId;
	 }

	 /** 权重 */
	 public Integer getWeight() { 
	 	 return weight;
	 }
	 /** 权重 */
	 public void setWeight(Integer weight) {
	 	 this.weight = weight;
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
