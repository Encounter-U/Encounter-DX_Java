package com.dongxin.day08.test_0809.Login;

/**
 * @author Encounter
 * @date 2023/8/9
 */
public class Login
    {
        private String username;
        private String password;
        private String repwd;
        private String email;
        private String gender;
        private int age;

        public Login()
            {
            }

        public Login(String username, String password, String email, String gender, int age)
            {
                this.username = username;
                this.password = password;
                this.email = email;
                this.gender = gender;
                this.age = age;
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

        public String getRepwd()
            {
                return repwd;
            }

        public void setRepwd(String repwd)
            {
                this.repwd = repwd;
            }

        public String getEmail()
            {
                return email;
            }

        public void setEmail(String email)
            {
                this.email = email;
            }

        public String getGender()
            {
                return gender;
            }

        public void setGender(String gender)
            {
                this.gender = gender;
            }

        public int getAge()
            {
                return age;
            }

        public void setAge(int age)
            {
                this.age = age;
            }
    }
