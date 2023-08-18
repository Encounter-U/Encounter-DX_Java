package com.dongxin.day11.Test.Test5_6_7;

/**
 * @author Encounter
 * @date 2023/8/16
 */
public class User
    {
        private Integer id;
        private String username;
        private String password;

        public User()
            {
            }

        public User(Integer id, String username, String password)
            {
                this.id = id;
                this.username = username;
                this.password = password;
            }

        public Integer getId()
            {
                return id;
            }

        public void setId(Integer id)
            {
                this.id = id;
            }

        public String getUsername()
            {
                return username;
            }

        public void setUsername(String username)
            {
                this.username = username;
            }

        public String getPassword()
            {
                return password;
            }

        public void setPassword(String password)
            {
                this.password = password;
            }
    }
