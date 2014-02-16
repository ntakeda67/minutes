package org.nt67.minutes.entity;

// Generated 2014/02/17 1:32:41 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Member generated by hbm2java
 */
public class Member implements java.io.Serializable {

	private BigDecimal rid;
	private String surName;
	private String firstName;
	private String mailAddress;
	private String loginId;
	private String password;
	private Date registerDate;
	private Date modifyDate;
	private boolean available;
	private Date createDate;
	private String createUser;
	private Date updateDate;
	private String updateUser;
	private String comments;
	private Set meetingGroupMembers = new HashSet(0);
	private Set meetingMembers = new HashSet(0);

	public Member() {
	}

	public Member(BigDecimal rid, String surName, String firstName,
			String mailAddress, String loginId, Date registerDate,
			boolean available, Date createDate, String createUser,
			Date updateDate, String updateUser) {
		this.rid = rid;
		this.surName = surName;
		this.firstName = firstName;
		this.mailAddress = mailAddress;
		this.loginId = loginId;
		this.registerDate = registerDate;
		this.available = available;
		this.createDate = createDate;
		this.createUser = createUser;
		this.updateDate = updateDate;
		this.updateUser = updateUser;
	}

	public Member(BigDecimal rid, String surName, String firstName,
			String mailAddress, String loginId, String password,
			Date registerDate, Date modifyDate, boolean available,
			Date createDate, String createUser, Date updateDate,
			String updateUser, String comments, Set meetingGroupMembers,
			Set meetingMembers) {
		this.rid = rid;
		this.surName = surName;
		this.firstName = firstName;
		this.mailAddress = mailAddress;
		this.loginId = loginId;
		this.password = password;
		this.registerDate = registerDate;
		this.modifyDate = modifyDate;
		this.available = available;
		this.createDate = createDate;
		this.createUser = createUser;
		this.updateDate = updateDate;
		this.updateUser = updateUser;
		this.comments = comments;
		this.meetingGroupMembers = meetingGroupMembers;
		this.meetingMembers = meetingMembers;
	}

	public BigDecimal getRid() {
		return this.rid;
	}

	public void setRid(BigDecimal rid) {
		this.rid = rid;
	}

	public String getSurName() {
		return this.surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMailAddress() {
		return this.mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public boolean isAvailable() {
		return this.available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Set getMeetingGroupMembers() {
		return this.meetingGroupMembers;
	}

	public void setMeetingGroupMembers(Set meetingGroupMembers) {
		this.meetingGroupMembers = meetingGroupMembers;
	}

	public Set getMeetingMembers() {
		return this.meetingMembers;
	}

	public void setMeetingMembers(Set meetingMembers) {
		this.meetingMembers = meetingMembers;
	}

}
