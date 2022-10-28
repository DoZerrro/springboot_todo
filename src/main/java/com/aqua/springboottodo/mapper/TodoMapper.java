package com.aqua.springboottodo.mapper;

import com.aqua.springboottodo.dto.TodoDTO;

import java.util.List;

public interface TodoMapper {

    //todo list 확인 (조회)
    List<TodoDTO> todoList();

    //todo insert 하기 (추가)
    Integer todoInsert(TodoDTO todoDTO);

    //todo delete 하기 (삭제)
    Integer todoDelete(int tno);

    //todo mod 하기 (수정)
    Integer todoMod(TodoDTO todoDTO);
}
