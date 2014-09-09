package cn.cocho.sdk.http.test;

import java.io.Serializable;

public class UserRelationInfo implements Serializable{

	private String userRelationId;

	private String relationId;

	private String userId;

	private String relationType;// DEVICE：设备；PRINT：打印机；USER：用户

	public enum RelationType {
		DEVICE, // 设备
		PRINT, // 打印机
		USER// 用户
	}

	public String getUserRelationId() {
		return userRelationId;
	}

	public void setUserRelationId(String userRelationId) {
		this.userRelationId = userRelationId;
	}

	public String getRelationId() {
		return relationId;
	}

	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRelationType() {
		return relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

}
