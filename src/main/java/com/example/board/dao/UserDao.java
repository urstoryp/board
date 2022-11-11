package com.example.board.dao;

import com.example.board.dto.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

// spring이 관리하는 Bean
@Repository
public class UserDao {
    // Spring JDBC를 이용한 코드.
    @Transactional
    public User addUser(String email, String name, String password){
        // Service에서 이미 트랜잭션이 시작했기 때문에, 그 트랜잭션에 포함된다.
        // insert into user (email, name, password, regdate) values (?, ?, ?, now()); # user_id auto gen
        // SELECT LAST_INSERT_ID();
        return null;
    }

    @Transactional
    public void mappingUserRole(int userId){
        // Service에서 이미 트랜잭션이 시작했기 때문에, 그 트랜잭션에 포함된다.
        // insert into user_role( user_id, role_id ) values ( ?, 1);
    }

}

/*
        insert into user (email, name, password, regdate) values (?, ?, ?, now()); # user_id auto gen
        SELECT LAST_INSERT_ID();
        insert into user_role( user_id, role_id ) values ( ?, 1);
 */