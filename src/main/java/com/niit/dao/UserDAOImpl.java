package com.niit.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.models.Users;

@Repository("usersDAO")
public class UserDAOImpl implements UsersDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveOrUpdate(Users users) {
		
		Session session=sessionFactory.openSession();
		session.save(users);
		Transaction t=session.beginTransaction();
		t.commit();
		session.close();
	}

	public void delete(Users users) {
		// TODO Auto-generated method stub
		
	}

	public Users get(int username) {
		// TODO Auto-generated method stub
		return null;
	}

}
