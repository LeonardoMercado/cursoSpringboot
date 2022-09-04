$(document).ready(function() {
  cargarUsuarios();
  $('#usuarioTabla').DataTable();
});

function cargarUsuarios(){
  (async () => {
    const request = await fetch('api/usuarios', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const usuarios = await request.json();

    $("#tableBody").empty();
    for(let usuario of usuarios){
      let botonEliminar = '</a> <a href="#" onclick="eliminarUsuario('+usuario.id+')" class="btn btn-danger btn-circle"> <i class="fas fa-trash"></i> </a>';
      $("#tableBody").append('<tr> <td>'+usuario.id+'</td><td>'+usuario.nombre+ ' '+usuario.apellido+'</td><td>'+usuario.telefono+'</td><td>'+usuario.email+'</td><td>'+usuario.password+'</td><td> <a href="" class="btn btn-info btn-circle"> <i class="fas fa-exclamation-triangle"></i>' + botonEliminar + '</td></tr>');
    }
  })();
}

function eliminarUsuario(id){
  (async () => {
    const request = await fetch('api/usuarios/'+id, {
      method: 'DELETE',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    cargarUsuarios();
  })();
}