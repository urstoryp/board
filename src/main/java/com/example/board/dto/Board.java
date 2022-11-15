package com.example.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Board {
    private int boardId;
    private String title;
    private String content;
    private String name;
    private int userId;
    private LocalDateTime regdate;
    private int viewCnt;
}
// b.user_id, b.board_id, b.title, b.regdate, b.view_cnt, u.name

/*
'board_id', 'int', 'NO', 'PRI', NULL, 'auto_increment'
'title', 'varchar(100)', 'NO', '', NULL, ''
'content', 'text', 'YES', '', NULL, ''
'user_id', 'int', 'NO', 'MUL', NULL, ''
'regdate', 'timestamp', 'YES', '', 'CURRENT_TIMESTAMP', 'DEFAULT_GENERATED'
'view_cnt', 'int', 'YES', '', '0', ''

 */
