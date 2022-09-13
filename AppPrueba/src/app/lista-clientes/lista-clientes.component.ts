import swal from 'sweetalert2';
import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';
import { ClienteService } from '../cliente.service';

@Component({
  selector: 'app-lista-clientes',
  templateUrl: './lista-clientes.component.html',
  styleUrls: ['./lista-clientes.component.css']
})
export class ListaClientesComponent implements OnInit {

  arrClientes:Cliente[];

  constructor(private cliServicio:ClienteService) { }
  ngOnInit(): void {
    this.obtenerClientes();
  }
/*
  eliminarCliente(id:number){
    this.cliServicio.eliminarCliente(id).subscribe(dato => {
      console.log(dato);
      this.obtenerClientes();
    });
  }
  */
 eliminarCliente(id:number){
  swal({
      title: "¿Estas seguro de eliminar el cliente?",
      text: "Por favor confirma se deseas eliminar el cliente",
      type: "warning",
      showCancelButton: true,
      confirmButtonColor: '#3085d6', 
      cancelButtonColor: '#d33',
      confirmButtonText: 'Si, eliminar',
      cancelButtonText: 'No, cancelar',
      confirmButtonClass: 'btn btn-success',
      cancelButtonClass: 'btn btn-danger',
      buttonsStyling: true   
    }).then((result) => {
      if (result.value) {
        this.cliServicio.eliminarCliente(id).subscribe(dato => {
          console.log(dato);
          this.obtenerClientes();
        swal( 
              'Cliente eliminado',
              'El cliente ha sido eliminado con exito',
              'success'
            )
        })
      }
    })
  }


  private obtenerClientes(){
    this.cliServicio.obtenerListaDeClientes().subscribe(dato => {
      this.arrClientes=dato;
    });
  }


}
