package com.lahendrix.dao;
 
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.lahendrix.domain.Data;
 
public class DataDAOImpl implements DataDAO {
 
    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @Override
    public void saveData(Data data) {
        hibernateTemplate.saveOrUpdate(data);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Data> listData() {
        
        return hibernateTemplate.find("from Data");
    }
    
    
    @SuppressWarnings("unchecked")
    public List<Data> listUserData(String email) {
        String whereClause = "WHERE email = '" + email + "'";
        return hibernateTemplate.find("from Data " + whereClause );
    }
}
