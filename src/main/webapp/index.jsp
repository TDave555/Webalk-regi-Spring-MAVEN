<html>
<head>
    <title>Calculator</title>
</head>
<body>
<%
//ha a servlettol jott, akkor van, ha elso keres, akkor nincs
szamologepszervlet.ResultDto result = (request.getAttribute("result") != null) ?
					(szamologepszervlet.ResultDto) request.getAttribute("result") :
					new szamologepszervlet.ResultDto();

String resultText = (result == null) ?
				"" : "result " + result.getResult().toString();
%>

ver: 0.4<br>

<form method="post" action="/szamologepszervlet/szamologep.do">
    <input type="text" name="a" value="<%= result.getA() %>"/><br>
    <input type="text" name="b" value="<%= result.getB() %>"/><br>
    <select name="operator">
        <option value="+" /> +
        <option value="-" /> -
        <option value="*" /> *
        <option value="/" /> /
    </select><br>

<%= resultText %>
    <input type="submit" /><br>
</form>




</body>
</html>