package com.revenue.revenueCollection.Models;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "userassignedrights")
public class UserAssignedRights  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private boolean AllowView;
	private boolean AllowAdd;
	private boolean AllowEdit;
	private boolean AllowDelete;
	private int CreatedBy;
	private int rightId;
	@ManyToOne
	@JoinColumn(name = "group_id")
	@JsonBackReference
	private UserGroup GroupId;

	public   UserAssignedRights() {
		super();
	}

	public UserAssignedRights(boolean allowView, boolean allowAdd, boolean allowEdit, boolean allowDelete,
							  int createdBy, int rightId, UserGroup groupId) {
		super();
		AllowView = allowView;
		AllowAdd = allowAdd;
		AllowEdit = allowEdit;
		AllowDelete = allowDelete;
		CreatedBy = createdBy;
		this.rightId = rightId;
		GroupId = groupId;
	}

	public boolean isAllowView() {
		return AllowView;
	}

	public void setAllowView(boolean allowView) {
		AllowView = allowView;
	}

	public boolean isAllowAdd() {
		return AllowAdd;
	}

	public void setAllowAdd(boolean allowAdd) {
		AllowAdd = allowAdd;
	}

	public boolean isAllowEdit() {
		return AllowEdit;
	}

	public void setAllowEdit(boolean allowEdit) {
		AllowEdit = allowEdit;
	}

	public boolean isAllowDelete() {
		return AllowDelete;
	}

	public void setAllowDelete(boolean allowDelete) {
		AllowDelete = allowDelete;
	}

	public int getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(int createdBy) {
		CreatedBy = createdBy;
	}

	public int getRightId() {
		return rightId;
	}

	public void setRightId(int rightId) {
		this.rightId = rightId;
	}

	@JsonIgnore
	public UserGroup getGroupId() {
		return GroupId;
	}

	public void setGroupId(UserGroup groupId) {
		GroupId = groupId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
