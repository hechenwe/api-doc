
package com.sooncode.api.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class Email implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 验证编号 */ 
	 private String verificationId; 
	 /** 验证码 */
	 private Integer code ;
	 /** 邮箱 */
	 private String email ;

	 /** 验证码 */
	 public Integer getCode() { 
	 	 return code;
	 }
	 /** 验证码 */
	 public void setCode(Integer code) {
	 	 this.code = code;
	 }

	 /** 验证编号 */
	 public String getVerificationId() { 
	 	 return verificationId;
	 }
	 /** 验证编号 */
	 public void setVerificationId(String verificationId) {
	 	 this.verificationId = verificationId;
	 }

	 /** 邮箱 */
	 public String getEmail() { 
	 	 return email;
	 }
	 /** 邮箱 */
	 public void setEmail(String email) {
	 	 this.email = email;
	 }

}
