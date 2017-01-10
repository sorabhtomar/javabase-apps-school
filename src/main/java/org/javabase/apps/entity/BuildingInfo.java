package org.javabase.apps.entity;
// Generated Jan 10, 2017 12:47:22 PM by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BuildingInfo generated by hbm2java
 */
@Entity
@Table(name = "building_info", catalog = "jschool"
)
public class BuildingInfo implements java.io.Serializable {

    private Integer buildingId;
    private Integer insId;
    private String buildName;
    private String totalRoom;
    private String floor;
    private String constructionType;
    private String details;
    private Date entryDate;
    private Date updateDate;
    private Integer entryUser;
    private Integer updateuser;

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "building_id", unique = true, nullable = false)
    public Integer getBuildingId() {
        return this.buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    @Column(name = "ins_id")
    public Integer getInsId() {
        return this.insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    @Column(name = "build_name", length = 45)
    public String getBuildName() {
        return this.buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    @Column(name = "total_room", length = 45)
    public String getTotalRoom() {
        return this.totalRoom;
    }

    public void setTotalRoom(String totalRoom) {
        this.totalRoom = totalRoom;
    }

    @Column(name = "floor", length = 45)
    public String getFloor() {
        return this.floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Column(name = "construction_type", length = 45)
    public String getConstructionType() {
        return this.constructionType;
    }

    public void setConstructionType(String constructionType) {
        this.constructionType = constructionType;
    }

    @Column(name = "details", length = 45)
    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "entryDate", length = 19)
    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updateDate", length = 19)
    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Column(name = "entryUser")
    public Integer getEntryUser() {
        return this.entryUser;
    }

    public void setEntryUser(Integer entryUser) {
        this.entryUser = entryUser;
    }

    @Column(name = "updateuser")
    public Integer getUpdateuser() {
        return this.updateuser;
    }

    public void setUpdateuser(Integer updateuser) {
        this.updateuser = updateuser;
    }

}
