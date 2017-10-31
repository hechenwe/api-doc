
package com.sooncode.api.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class User implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 用户编号 */ 
	 private String userId; 
	 /** 密码 */
	 private String password ;
	 /** 手机号码 */
	 private String mobileNumber ;
	 /**  */
	 private String roleId ;
	 /** 用户名 */
	 private String userName ;
	 /** 注册时间 */
	 private java.util.Date registerDate ;
	 /** 邮箱 */
	 private String email ;
	 /**  */
	 private String companyId ;

	 /** 密码 */
	 public String getPassword() { 
	 	 return password;
	 }
	 /** 密码 */
	 public void setPassword(String password) {
	 	 this.password = password;
	 }

	 /** 手机号码 */
	 public String getMobileNumber() { 
	 	 return mobileNumber;
	 }
	 /** 手机号码 */
	 public void setMobileNumber(String mobileNumber) {
	 	 this.mobileNumber = mobileNumber;
	 }

	 /** 用户编号 */
	 public String getUserId() { 
	 	 return userId;
	 }
	 /** 用户编号 */
	 public void setUserId(String userId) {
	 	 this.userId = userId;
	 }

	 /**  */
	 public String getRoleId() { 
	 	 return roleId;
	 }
	 /**  */
	 public void setRoleId(String roleId) {
	 	 this.roleId = roleId;
	 }

	 /** 用户名 */
	 public String getUserName() { 
	 	 return userName;
	 }
	 /** 用户名 */
	 public void setUserName(String userName) {
	 	 this.userName = userName;
	 }

	 /** 注册时间 */
	 public java.util.Date getRegisterDate() { 
	 	 return registerDate;
	 }
	 /** 注册时间 */
	 public void setRegisterDate(java.util.Date registerDate) {
	 	 this.registerDate = registerDate;
	 }

	 /** 邮箱 */
	 public String getEmail() { 
	 	 return email;
	 }
	 /** 邮箱 */
	 public void setEmail(String email) {
	 	 this.email = email;
	 }

	 /**  */
	 public String getCompanyId() { 
	 	 return companyId;
	 }
	 /**  */
	 public void setCompanyId(String companyId) {
	 	 this.companyId = companyId;
	 }

}
