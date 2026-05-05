<%@ page import="java.util.*,model.Customer,dao.CustomerDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>View Customers</title>

<style>
body{
    font-family: Arial;
    margin:40px;
    background:#f5f7fa;
}
table{
    width:100%;
    border-collapse:collapse;
    background:#fff;
    box-shadow:0 5px 15px rgba(0,0,0,0.1);
}
th,td{
    padding:12px;
    border-bottom:1px solid #ddd;
    text-align:left;
}
th{
    background:#2196f3;
    color:white;
}
h2{
    margin-bottom:20px;
}
a{
    text-decoration:none;
    color:#2196f3;
}
</style>

</head>
<body>

<h2>Customer List</h2>

<%
List<Customer> list = CustomerDAO.getAllCustomers();
%>

<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Meter No</th>
<th>Address</th>
<th>Phone</th>
</tr>

<%
for(Customer c : list){
%>

<tr>
<td><%=c.getId()%></td>
<td><%=c.getName()%></td>
<td><%=c.getMeterNo()%></td>
<td><%=c.getAddress()%></td>
<td><%=c.getPhone()%></td>
</tr>
<%
}
%>

</table>

<br>
<a href="dashboard.jsp">← Back to Dashboard</a>

</body>
</html>
