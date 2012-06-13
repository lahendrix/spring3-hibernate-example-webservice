
package com.lahendrix.dao;

import java.util.List;
import com.lahendrix.domain.Data;

public interface DataDAO {
    
    public void saveData(Data data) ;
    public List<Data> listData() ;
    public List<Data> listUserData(String email);
}
