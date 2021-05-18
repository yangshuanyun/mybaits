package com.yang.dao;

import com.yang.pojo.CloudAccount;
import com.yang.utils.MybaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author Ys
 * @Date 2021年05月16日 18:36
 * @Version 1.0
 */
public class CloudAccountTest {

    @Test
    public  void  test(){
        //获取sqlssssion对象
        SqlSession sqlSession =  MybaitsUtils.getSqlSession();
        //执行sql
        CloudAccountMapper cloudAccountMapper =  sqlSession.getMapper(CloudAccountMapper.class);

        List<CloudAccount> list =  cloudAccountMapper.getCloudAccountList();
        for (CloudAccount cloudAccount : list) {
            System.out.println(cloudAccount);

        }
        sqlSession.close();

    }


    @Test
    public  void  test1(){
        SqlSession sqlSession =  MybaitsUtils.getSqlSession();
        CloudAccountMapper cloudAccountMapper =  sqlSession.getMapper(CloudAccountMapper.class);
        CloudAccount cloudAccount = cloudAccountMapper.getCloudAccount("8a8a8a8c782f6a6001782f6b84620000");
        System.out.println(cloudAccount);

        sqlSession.close();
    }
}
