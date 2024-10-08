package com.example.w1.todo;

import com.example.w1.todo.dto.TodoDTO;
import com.example.w1.todo.service.TodoService;
import com.sun.tools.javac.comp.Todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<TodoDTO> list = TodoService.INSTANCE.getList();

        req.setAttribute("list", list);
        req.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(req,res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }
}