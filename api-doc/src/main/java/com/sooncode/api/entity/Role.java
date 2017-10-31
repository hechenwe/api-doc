
package com.sooncode.api.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class Role implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /**  */ 
	 private String roleId; 
	 /** 角色名称 */
	 private String roleName ;
	 /**  */
	 private String roleCode ;

	 /**  */
	 public String getRoleId() { 
	 	 return roleId;
	 }
	 /**  */
	 public void setRoleId(String roleId) {
	 	 this.roleId = roleId;
	 }

	 /** 角色名称 */
	 public String getRoleName() { 
	 	 return roleName;
	 }
	 /** 角色名称 */
	 public void setRoleName(String roleName) {
	 	 this.roleName = roleName;
	 }

	 /**  */
	 public String getRoleCode() { 
	 	 return roleCode;
	 }
	 /**  */
	 public void setRoleCode(String roleCode) {
	 	 this.roleCode = roleCode;
	 }

}
