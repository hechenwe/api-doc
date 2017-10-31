
package com.sooncode.api.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class Operation implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 操作编号 */ 
	 private String operationId; 
	 /** 操作代码 */
	 private String operationCode ;
	 /** 操作名称 */
	 private String operationName ;

	 /** 操作代码 */
	 public String getOperationCode() { 
	 	 return operationCode;
	 }
	 /** 操作代码 */
	 public void setOperationCode(String operationCode) {
	 	 this.operationCode = operationCode;
	 }

	 /** 操作名称 */
	 public String getOperationName() { 
	 	 return operationName;
	 }
	 /** 操作名称 */
	 public void setOperationName(String operationName) {
	 	 this.operationName = operationName;
	 }

	 /** 操作编号 */
	 public String getOperationId() { 
	 	 return operationId;
	 }
	 /** 操作编号 */
	 public void setOperationId(String operationId) {
	 	 this.operationId = operationId;
	 }

}
