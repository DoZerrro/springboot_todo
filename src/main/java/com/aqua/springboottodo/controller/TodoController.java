package com.aqua.springboottodo.controller;

import com.aqua.springboottodo.dto.TodoDTO;
import com.aqua.springboottodo.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/todo")
public class TodoController {

    private final TodoMapper todoMapper;

    @GetMapping("/list")
    public List<TodoDTO> todoList() {
        log.info("todolist실행확인=========================");

        List<TodoDTO> todoList = todoMapper.todoList();
        return todoList;
    }

    @PostMapping(value="/insert")
    public Integer todoInsert(@RequestBody TodoDTO todoDTO) {
        int todoInsert = todoMapper.todoInsert(todoDTO);
        return todoInsert;
    }

    @DeleteMapping(value = "/delete/{tno}")
    public Integer todoDelete(@PathVariable("tno") int tno){
        int todoDelete = todoMapper.todoDelete(tno);
        return todoDelete;
    }

    @PutMapping(value = "/mod/{tno}")
    public Integer todoMod(@RequestBody TodoDTO todoDTO){
        int todoMod = todoMapper.todoMod(todoDTO);
        return todoMod;
    }
}
