package com.yang.dao;

import com.yang.pojo.CloudAccount;
import com.yang.pojo.User;
import com.yang.utils.MybaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.beans.Transient;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Ys
 * @Date 2021年05月16日 18:36
 * @Version 1.0
 */
public class CloudAccountTest {

    /**
     * 查询所有数据
     */
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

    /**
     * 根据id查数据
     */
    @Test
    public  void  test1(){
        SqlSession sqlSession =  MybaitsUtils.getSqlSession();
        CloudAccountMapper cloudAccountMapper =  sqlSession.getMapper(CloudAccountMapper.class);
        CloudAccount cloudAccount = cloudAccountMapper.getCloudAccount("8a8a8a8c782f6a6001782f6b84620000");
        System.out.println(cloudAccount);

        sqlSession.close();
    }


    /**
     * 查询数据
     */
    @Test
    public  void  test2(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper  userMapper = sqlSession.getMapper(UserMapper.class);
        // userMapper.addUser(new User("1","ys","sss"));
        List<User> list=  userMapper.getUserList();
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    //插入数据
    @Test
    public  void  test3(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper  userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.addUser(new User("11","ys","sss"));
        sqlSession.commit();
        sqlSession.close();
    }

    //更新数据
    @Test
    public  void  test4(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper  userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(new User("11","yangs","ssqqqws"));
        sqlSession.commit();
        sqlSession.close();
    }

    //删除数据
    @Test
    public  void  test5(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper  userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteUser("11");
        sqlSession.commit();
        sqlSession.close();
    }


    //MAP插入数据
    @Test
    public  void  test6(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper  userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();

        userMapper.deleteUser("11");
        sqlSession.commit();
        sqlSession.close();
    }


}
