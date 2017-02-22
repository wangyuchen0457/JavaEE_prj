package com.mybatis.test;

import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.domain.UserInfo;

public class Test {
	//mybatis�����ļ�
	private static final String resource = "mybatis-config.xml";
	//SqlSession����
	private SqlSession session=null;
	/**
	 * ��ʼ�������ļ���������sqlsession����
	 * @throws Exception
	 */
	public void init()throws Exception{
		//��ȡmybatis�����ļ�
		Reader reader = Resources.getResourceAsReader(resource);
		//����mybatis��session��������
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
		//����session�Ự
		session = sessionFactory.openSession();
	}
	public void init2()throws Exception{
		InputStream inputStream= Resources.getResourceAsStream(resource);
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory= builder.build(inputStream);
		session=factory.openSession();
	}
	/**
	 * �������
	 * @param userInfo
	 */
	public int insert(UserInfo userInfo){
		int id = session.insert("insertUserInfo",userInfo);
		session.commit();
		return id;
	}
	/**
	 * ���²���
	 * @param id
	 * @return
	 */
	public int update(UserInfo userInfo){
		int id = session.update("updateUserInfo", userInfo);
		session.commit();
		return id;
	}
	/**
	 * ɾ��s����
	 * @param id
	 * @return
	 */
	public int delete(int id){
		int idx = session.delete("deleteUserInfo",id);
		session.commit();
		return idx;
	}
	/**
	 * ��ȡ��������
	 * @param id
	 * @return
	 */
	public UserInfo getOne(int id){
		UserInfo userInfo= session.selectOne("getUserInfoById",id);
		return userInfo;
	}
	/**
	 * ��ȡ���ж���
	 * @param userInfo
	 * @return
	 */
	public List<UserInfo> getList(UserInfo userInfo){
		List<UserInfo> userInfoList=session.selectList("getUserInfoList",userInfo);
		return userInfoList;
	}
	public static void main(String[] args) throws Exception {
		Test test=new Test();
		test.init();
		UserInfo userInfo = new UserInfo();
		//���Բ�������
//		userInfo.setUsername("Jack");
//		userInfo.setPassword("Jack");
//		test.insert(userInfo);
		//���Ը�������
//		userInfo.setId(9);
//		userInfo.setUsername("lisi");
//		userInfo.setPassword("88888888");
//		test.update(userInfo);
		//ɾ������
//		test.delete(10);
		
//		System.out.println(test.getOne(1));
		
		//test.init();
		test.init2();
		List<UserInfo> userInfoList = test.getList(userInfo);
		for(UserInfo userInfoX:userInfoList){
			System.out.println(userInfoX);
		}
		test.session.close();
	}

}
