package com.yang.pojo;



import java.sql.Timestamp;


public class CloudArea {
    private String id;//
    private String brandId;//品牌id
    private String poolId;//资源池id
    private String projectId;//项目id，cmdb 自己数据库表（cloud_project）id
    private String areaId;//区域id，底层虚拟化中的区域ID
    private String name;//名称
    private String coding;//编码
    private Integer sequence;//序列
    private String describe;//描述（text）
    private String connectionInformation;//连接信息，既是账号密码,json数据存储{ }（longtext）
    private String version;//版本号 例如 v6.5
    private String url;//url连接地址，就就填上，没有就不用填写，显示（无）（text）
    private String areaType;//区域类型
    private String status;//状态 （available 可用、forbid 禁止、delete 删除、abnormal 异常）
    private String synchronousType;//同步类型 （create 自创建、synchronous 自同步、manual_synchronous 手动同步）
    private String custom;//自定义新增的（longtext）
    private Timestamp createtime;//创建时间
    private String operationType;//操作类型
    private String resourceValue;//资源内容


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }



    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }


    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }


    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }


    public String getConnectionInformation() {
        return connectionInformation;
    }

    public void setConnectionInformation(String connectionInformation) {
        this.connectionInformation = connectionInformation;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getSynchronousType() {
        return synchronousType;
    }

    public void setSynchronousType(String synchronousType) {
        this.synchronousType = synchronousType;
    }


    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }


    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }


    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }


    public String getResourceValue() {
        return resourceValue;
    }

    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue;
    }
}
