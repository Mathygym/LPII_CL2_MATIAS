<html>
<body bgcolor="#c5dec9">
<h2>Hello World!</h2>

<h1 align="center">Bienvenidos</h1>


<!--<a href="ControladorServlet" style="text-decoration:none">Gestionar Producto</a>
 invocamos al serlet -->
<%
String men=(String)request.getAttribute("mensaje");
String menlog="";
//aplicamos una condicion
if(men!=null) menlog=men;
%>
 <h2 align="center">
 <%=menlog %>
 </h2>
<table border="2" align="center" class="table table-bordered">

<!--<form action="validar.jsp" method="post" >  -->

<form action="ControladorLogueo" method="post">

<tr><td></td><td><input type="text" name="usuario" class="form-control" placeholder="Usuario"></td></tr>

<tr><td></td><td><input type="password" name="password" class="form-control" placeholder="Password"></td></tr>

<tr><td colspan="2"><input type="submit" value="Acceder al Sistema" class="btn btn-primary"></td></tr>

</form>


</table>
</body>
</html>
