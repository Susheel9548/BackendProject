package sample.webmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

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
	public void saveUser(User user) {
		hibernateTemplate.save(user);
		System.out .println("userDao.saveUser");
		
	}
	
	//READ
	public User getUserById(int id) {
		
		System.out.println("UserDao.getUserById()");
		
		return hibernateTemplate.get(User.class , id);
		
	}
	
	//UPDATE
	public void updateUser(User user) {
		hibernateTemplate.update(user);
		System.out.println("userDao.updateUser()");
		
	}


	public void deleteUser(int id) {
		User user = hibernateTemplate.get(User.class, id);
		if(user != null) {
			hibernateTemplate.delete(user);
		}
		System.out.println("usreDao.deleteUser"); 
		
	}

}
