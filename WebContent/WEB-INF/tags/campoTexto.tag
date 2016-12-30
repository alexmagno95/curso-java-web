<%@ attribute name="id" required="true" %>
<%@ attribute name="label" required="true" %>
<%@ attribute name="campoNome" required="true" %>
<%@ attribute name="value"%>

<label for="${id}">${label}</label>
<input type="text" name="${campoNome}" value="${value}"id="${id}"/>



