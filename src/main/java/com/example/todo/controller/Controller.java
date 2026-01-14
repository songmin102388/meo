package com.example.todo.controller;


import com.example.todo.repositroy.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class Controller {

    private final MemoRepository memoRepository;

    @GetMapping ("/")
    public String index(Model model){
        model.addAttribute("memo", memoRepository.findAll());

        return "hello";
    }

}
