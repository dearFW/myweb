package com.neuedu.web;

import com.neuedu.pojo.Student;
import com.neuedu.sever.IterfaceStudent;
import com.neuedu.sever.Sever;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by heystephen on 2020/2/25.
 */
@WebServlet("/student/list")
public class StudentList extends HttpServlet {
    private static  final long serialVersionUID = - 3020479670559459661L;
    //加载学生数据到页面
    IterfaceStudent iterfaceStudent = new Sever();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> list =  iterfaceStudent.query();
        //利用作用域
        request.setAttribute("list",list);

        request.getRequestDispatcher("/WEB-INF/pages/student/list.jsp").forward(request,response);
    }
}
