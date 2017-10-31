
package com.sooncode.api.entity;

import java.io.Serializable;

/**
 *
 * @author hechen
 * 
 */
public class Control implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 控制编号 */
	private String controlId;
	/** 用户编号 */
	private String userId;
	/** 操作编号 */
	private String operationId;
	/** 项目编号 */
	private String projectId;

	/** 控制编号 */
	public String getControlId() {
		return controlId;
	}

	/** 控制编号 */
	public void setControlId(String controlId) {
		this.controlId = controlId;
	}

	/** 用户编号 */
	public String getUserId() {
		return userId;
	}

	/** 用户编号 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/** 操作编号 */
	public String getOperationId() {
		return operationId;
	}

	/** 操作编号 */
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	/** 项目编号 */
	public String getProjectId() {
		return projectId;
	}

	/** 项目编号 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
