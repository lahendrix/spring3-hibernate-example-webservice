
package com.lahendrix.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="DATA")
public class Data {
 
    private Long id;
    private String email;
    private String data;
   

    @Id
    @GeneratedValue
    @Column(name="ID")
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="EMAIL")
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="DATA")
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }

 /**
  * SQL for table creation
  * Create table data (
        id serial,
        email varchar(50) not null,
        data varchar(1000)
    )
    */
}