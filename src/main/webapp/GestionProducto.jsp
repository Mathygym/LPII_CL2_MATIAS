<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page import="model.TblProductocl2" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar productos</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Gestionar Producto</h1>
<form action="ControladorServlet" method="post">

<table align="center">
<tr>
<td>nombre</td>
<td><input type="text" name="nombre"></td>
</tr>
<tr>
<td>precio venta</td>
<td><input type="text" name="precioventa"></td>
</tr>
<tr>
<td>precio compra</td>
<td><input type="text" name="preciocompra"></td>
</tr>
<tr>
<td>estado</td>
<td><input type="text" name="estado"></td>
</tr>
<tr>
<td>descripcion</td>
<td><input type="text" name="descrip"></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="Registrar Producto">
</td>
</tr>
</table>

</form>
<h1 align="center">Listado de Productos</h1>
<table align="center" border="2">
<tr>
<th>Codigo</th>
<th>nombre</th>
<th>precio venta</th>
<th>Precio compra</th>
<th>estado</th>
<th>descripcion</th>
</tr>
<%

List<TblProductocl2> ListadoProducto=(List<TblProductocl2>)request.getAttribute("listado");

if(ListadoProducto!=null){
	for(TblProductocl2 lis:ListadoProducto){
%>
<tr>
<td>
<%=lis.getIdproductocl2() %>
</td>
<td>
<%=lis.getNombrecl2() %>
</td>
<td>
<%=lis.getPrecioventacl2() %>
</td>
<td>
<%=lis.getPreciocompcl2() %>
</td>
<td>
<%=lis.getEstadocl2() %>
</td>
<td>
<%=lis.getDescripcl2() %>
</td>
</tr>
<%
	}
}
%>
</table>
</body>
</html>