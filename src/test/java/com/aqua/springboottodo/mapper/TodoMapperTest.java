package com.aqua.springboottodo.mapper;

import com.aqua.springboottodo.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class TodoMapperTest {

    @Autowired(required = false)
    TodoMapper todoMapper;

    @Test
    void todoList() {
        log.info(todoMapper.todoList());
    }

    @Test
    void todoInsert() {
        TodoDTO todoDTO = TodoDTO.builder()
                .title("hd")
                .memo("fgfd")
                .dueDate(LocalDate.now())
                .build();
        log.info(todoMapper.todoInsert(todoDTO));
    }

    @Test
    void todoDelete() {
        int tno = 33011;
        log.info(todoMapper.todoDelete(tno));
    }

    @Test
    void todoMod() {
        TodoDTO todoDTO = TodoDTO.builder()
                .tno(33009)
                .title("뚜루뚜루")
                .memo("뚜루뚜루")
                .dueDate(LocalDate.now())
                .complete(true)
                .build();

        log.info(todoMapper.todoMod(todoDTO));
    }
}