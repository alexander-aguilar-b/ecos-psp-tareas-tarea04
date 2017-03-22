<!DOCTYPE html>
<html>
<body>

<div class="container">
  <h2>PSP4 - Cálculo de Tamaño Relativo</h2>
  <h3>Datos de Entrada</h3>
    <ul>
    <#list entradas as x>
      <li> ${x} </li>
    </#list>
    </ul>
	<h3>Resultados</h3>
	<table border="1" style="border-collapse:collapse">
		<tr>
			<td>Very Small</td>
			<td>Small</td>
			<td>Medium</td>
			<td>Large</td>
			<td>Very Large</td>
		</tr>
		<tr>
			<td>${tamanioVS}</td>
			<td>${tamanioS}</td>
			<td>${tamanioM}</td>
			<td>${tamanioL}</td>
			<td>${tamanioVL}</td>
		</tr>
</div>

</body>
</html>
