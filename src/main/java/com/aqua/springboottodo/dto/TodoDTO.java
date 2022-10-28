package com.aqua.springboottodo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {

    private Integer tno;
    private String title, memo;
    private LocalDateTime regDate, modDate;
    private LocalDate dueDate;
    private Boolean complete;
}
