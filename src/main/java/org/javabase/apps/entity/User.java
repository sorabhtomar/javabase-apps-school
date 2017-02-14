package org.javabase.apps.entity;
// Generated Feb 14, 2017 2:22:14 PM by Hibernate Tools 3.6.0

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "jschool")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="userId")
public class User implements java.io.Serializable {

	private static final long serialVersionUID = -5182659307195189767L;
	private Integer userId;
	private String email;
	private Date expiredDate;
	private boolean isActive;
	private boolean isAccountNonExpired;
	private boolean isCredintialNonExpired;
	private boolean isNonLocked;
	private String password;
	private Date createDate;
	private String username;
	private String firstName;
	private String lastName;
	private Date lastLogin;
	private GardianDetails gardianDetails;
	private EmployeeDetails employeeDetails;
	private Set<UserPermission> userPermissions = new HashSet<UserPermission>(0);
	private StudentDetails studentDetails;
	private TeacherDetails teacherDetails;
	private Role role;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "email", nullable = false, length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonIgnore
	@Column(name = "password", nullable = false, length = 20)
	public String getPassword() {
		return this.password;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expaired_Date", length = 19)
	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Column(name = "is_active", nullable = false)
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	@Column(name = "is_non_locked", nullable = false)
	public boolean isNonLocked() {
		return isNonLocked;
	}

	public void setNonLocked(boolean isNonLocked) {
		this.isNonLocked = isNonLocked;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "username", nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_login", length = 19)
	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	@JsonManagedReference
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
	public GardianDetails getGardianDetails() {
		return this.gardianDetails;
	}

	public void setGardianDetails(GardianDetails gardianDetails) {
		this.gardianDetails = gardianDetails;
	}

	@JsonManagedReference
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
	public EmployeeDetails getEmployeeDetails() {
		return this.employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	@JsonBackReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserPermission> getUserPermissions() {
		return userPermissions;
	}

	public void setUserPermissions(Set<UserPermission> userPermissions) {
		this.userPermissions = userPermissions;
	}

	@JsonManagedReference
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
	public StudentDetails getStudentDetails() {
		return this.studentDetails;
	}

	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	@JsonManagedReference
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
	public TeacherDetails getTeacherDetails() {
		return this.teacherDetails;
	}

	public void setTeacherDetails(TeacherDetails teacherDetails) {
		this.teacherDetails = teacherDetails;
	}

	@Column(name = "first_name", length = 50)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 50)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	@Column(name = "is_acc_non_expired", nullable = false)
	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}

	public void setAccountNonExpired(boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	@Column(name = "is_pass_non_expired", nullable = false)
	public boolean isCredintialNonExpired() {
		return isCredintialNonExpired;
	}

	public void setCredintialNonExpired(boolean isCredintialNonExpired) {
		this.isCredintialNonExpired = isCredintialNonExpired;
	}

	
	
}
