<%@page import="gov.uspto.ssb.guid.LinuxUUID"%>
<%@ page language="java" contentType="text/plain; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%out.print(new LinuxUUID().toString());%>