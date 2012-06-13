
package com.lahendrix.dao;

import java.util.List;
import com.lahendrix.domain.Dog;

public interface DogDAO {
    
    public void saveDog(Dog dog) ;
    public List<Dog> listDog() ;
}
