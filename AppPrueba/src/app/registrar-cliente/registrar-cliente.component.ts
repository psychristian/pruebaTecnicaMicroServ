import swal from 'sweetalert2';
import { EmptyExpr } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';
import { ClienteService } from '../cliente.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-registrar-cliente',
  templateUrl: './registrar-cliente.component.html',
  styleUrls: ['./registrar-cliente.component.css']
})
export class RegistrarClienteComponent implements OnInit {

  clien : Cliente = new Cliente();
   /*
  constructor(private cliServicio:ClienteService) { }
 */
  constructor(private cliServicio:ClienteService,private router:Router) { 
  }

  ngOnInit(): void {
  }

  guardarCliente(){
    this.cliServicio.registrarCliente(this.clien).subscribe(dato =>{
      console.log(dato);
      swal( 
            'Cliente registrado',
            'El cliente ha sido registrado satisfactoriamente',
            'success'
          )      
    }, error => console.log(error));
      this.irAlaListaDeClientes();
  }

  irAlaListaDeClientes(){
    this.router.navigate(['/clientes']);
  }

  onSubmit(){
    console.log(this.clien);
    this.guardarCliente();
  }
  DateSelected : any;
  fetchDateSelected(){
    console.log("la fecha seleccionada es: " + this.DateSelected)
  }
}
