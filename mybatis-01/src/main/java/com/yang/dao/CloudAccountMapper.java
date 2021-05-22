package com.yang.dao;

import com.yang.pojo.CloudAccount;
import com.yang.pojo.User;

import java.util.List;

/**
 * @Author Ys
 * @Date 2021年05月16日 18:15
 * @Version 1.0
 */
public interface CloudAccountMapper {
    List<CloudAccount> getCloudAccountList();

    CloudAccount getCloudAccount(String id);

    int addCloudAccount();

}
