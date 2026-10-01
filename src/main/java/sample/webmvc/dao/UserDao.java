package sample.webmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sample.webmvc.entity.User;

import javax.sql.DataSource;

@Repository
public class UserDao {

    private final DataSource dataSource;
    
	@Autowired
	private HibernateTemplate hibernateTemplate;


    UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
	

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

    //SAVE
	@Transactional
	public User saveUser(User user) {
		hibernateTemplate.save(user);
		return user;
	}
	
	//READ
	public User getUserById(int id) {
		
		System.out.println("UserDao.getUserById()");
		
		return hibernateTemplate.get(User.class , id);
		
	}
	
	
}
