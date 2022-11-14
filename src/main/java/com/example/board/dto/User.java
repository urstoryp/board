package com.example.board.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor // 기본생성자가 자동으로 만들어진다.
@ToString // Object의 toString()메소드를 자동으로 만들어준다.
public class User {
    private int userId;
    private String email;
    private String name;
    private String password;
    private LocalDateTime regdate; // 원래는 날짜 type으로 읽어온 후 문자열로 변환
}

/*
'user_id', 'int', 'NO', 'PRI', NULL, 'auto_increment'
'email', 'varchar(255)', 'NO', '', NULL, ''
'name', 'varchar(50)', 'NO', '', NULL, ''
'password', 'varchar(500)', 'NO', '', NULL, ''
'regdate', 'timestamp', 'YES', '', 'CURRENT_TIMESTAMP', 'DEFAULT_GENERATED'
 */