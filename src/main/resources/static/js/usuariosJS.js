$(document).ready(function() {
  cargarUsuarios();
  $('#usuarioTabla').DataTable();
});

function cargarUsuarios(){
  (async () => {
    const request = await fetch('/usuarios', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const usuarios = await request.json();

    for(let usuario of usuarios){
      $("#tableBody").append("<tr>\n" +
          "<td>"+usuario.id+"</td>\n" +
          "<td>"+usuario.nombre+ " "+usuario.apellido+"</td>\n" +
          "<td>"+usuario.telefono+"</td>\n" +
          "<td>"+usuario.email+"</td>\n" +
          "<td>"+usuario.password+"</td>\n" +
          "<td>\n" +
          "<a href=\"\" class=\"btn btn-info btn-circle\">\n" +
          "<i class=\"fas fa-exclamation-triangle\"></i>\n" +
          "</a>\n" +
          "<a href=\"\" class=\"btn btn-danger btn-circle\">\n" +
          "<i class=\"fas fa-trash\"></i>\n" +
          "</a>\n" +
          "</td>\n" +
          "</tr>");
    }
  })();
}
