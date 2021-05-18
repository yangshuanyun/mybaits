package com.yang.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class CloudAccount {


    private String id;//


    private String brandId;//品牌id


    private String account;//账号


    private String pwd;//密码


    private String name;//名称


    private String coding;//编码

    private Integer sequence;//序列


    private String describe;//描述（text）



    private String createAccountType;//创建者类型 管理员、用户


    private String version;//版本号 例如 v6.5


    private String createUserId;//创建者


    private String accountSource;//资源来源，枚举，platform 平台、pool 资源池，cloud_account 云账号、tenant 租户


    private String resourceId;//资源id，根据账号来源来存储不同的资源id


    private String attributionUserId;//归属用户


    private String status;//状态 （available 可用、forbid 禁止、delete 删除、abnormal 异常）


    private String custom;//自定义新增的（longtext）


    private Timestamp createtime;//创建时间

    private Timestamp updatetime;//更新时间

}
