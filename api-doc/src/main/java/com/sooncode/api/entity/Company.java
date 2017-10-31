
package com.sooncode.api.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class Company implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 公司编号 */ 
	 private String companyId; 
	 /** 公司名称 */
	 private String companyName ;
	 /** 商标 */
	 private String logo ;

	 /** 公司名称 */
	 public String getCompanyName() { 
	 	 return companyName;
	 }
	 /** 公司名称 */
	 public void setCompanyName(String companyName) {
	 	 this.companyName = companyName;
	 }

	 /** 商标 */
	 public String getLogo() { 
	 	 return logo;
	 }
	 /** 商标 */
	 public void setLogo(String logo) {
	 	 this.logo = logo;
	 }

	 /** 公司编号 */
	 public String getCompanyId() { 
	 	 return companyId;
	 }
	 /** 公司编号 */
	 public void setCompanyId(String companyId) {
	 	 this.companyId = companyId;
	 }

}
