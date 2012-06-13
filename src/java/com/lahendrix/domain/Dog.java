
package com.lahendrix.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="DOG")
public class Dog {
 
    private Long id;
    private String name;
    private String password;
    private String gender;
    private String country;
    private String aboutYou;
    private Boolean mailingList;

    @Id
    @GeneratedValue
    @Column(name="USER_ID")
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="USER_NAME")
        public String getName() {
    return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Column(name="USER_PASSWORD")
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="USER_GENDER")
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name="USER_COUNTRY")
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name="USER_ABOUT_YOU")
    public String getAboutYou() {
        return aboutYou;
    }
    
    public void setAboutYou(String aboutYou) {
        this.aboutYou = aboutYou;
    }

   /* @Column(name="USER_COMMUNITY")
    public String[] getCommunity() {
        return community;
    }
    
    public void setCommunity(String[] community) {
        this.community = community;
    }*/

    @Column(name="USER_MAILING_LIST")
    public Boolean getMailingList() {
        return mailingList;
    }
    
    public void setMailingList(Boolean mailingList) {
        this.mailingList = mailingList;
    }
 /**
  * SQL for table creation
  * CREATE TABLE users
    (
    user_id serial NOT NULL,
    user_name character varying(50),
    user_password character varying(50),
    user_gender character varying(1),
    user_country character varying(25),
    user_mailing_list boolean,
    CONSTRAINT users_pkey PRIMARY KEY (user_id )
    )
    WITH (
    OIDS=FALSE
    );
    */
}