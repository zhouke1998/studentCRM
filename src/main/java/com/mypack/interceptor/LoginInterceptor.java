package com.mypack.interceptor;

import com.mypack.model.Staff;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
            // 获取请求的 URL
            String url = request.getRequestURI();
            // URL:除了 login.jsp 是可以公开访问的，其它的 URL 都进行拦截控制
            if(url.indexOf("/login")>=0){
                return true;
            }
            // 获取 Session
            HttpSession session = request.getSession();
            Staff staff = (Staff) session.getAttribute("USER");
            // 判断 Session 中是否有用户数据，如果有，则返回 true,继续向下执行
            if(staff != null){
                return true;
            }
            // 不符合条件的给出提示信息，并转发到登录页面
            response.sendRedirect("/login");
            return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
