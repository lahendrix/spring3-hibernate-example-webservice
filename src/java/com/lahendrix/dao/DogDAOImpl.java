package com.lahendrix.dao;
 
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.lahendrix.domain.Dog;
 
public class DogDAOImpl implements DogDAO {
 
    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @Override
    public void saveDog(Dog dog) {
        hibernateTemplate.saveOrUpdate(dog);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Dog> listDog() {
        
        return hibernateTemplate.find("from Dog");
    }
}
