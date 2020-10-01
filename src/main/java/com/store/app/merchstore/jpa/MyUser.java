package com.store.app.merchstore.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class MyUser {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Size(min=1, message="Enter at least 1 character")
        private String username;
        private String password;

        public MyUser() {
        }

        public MyUser(String username, String password) {
                this.username = username;
                this.password = password;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }
}
