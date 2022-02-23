package com.pratik;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

@Controller
public class ApplicationDemo {
	
	public String demo(HttpServletRequest req,HttpServletResponse res)
	{
		String un=req.getParameter("un");
		String pw=req.getParameter("pw");
		String em=req.getParameter("em");
		String pn=req.getParameter("pn");
		
		req.setAttribute("un", un);
		req.setAttribute("pw", pw);
		req.setAttribute("em", em);
		req.setAttribute("pn", pn);
		
		return "display.jsp";
		
	}
}
