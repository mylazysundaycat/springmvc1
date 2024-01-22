package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name="helloSevlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        // request에서 온 정보 중에 쿼리를 뽑는 것
        // hello?username=Kim
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        // 응답메세지 보내기
        // HTTP 컨텐트 header에 들어감
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        // HTTP body 정보에 들어감
        response.getWriter().write("hello! "+username);

    }
}
