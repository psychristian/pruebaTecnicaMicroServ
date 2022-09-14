import swal from 'sweetalert2';
import { EmptyExpr } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';
import { ClienteService } from '../cliente.service';
import {Router} from '@angular/router';


import { PlanesMP } from '../planes-mp';
import { TpDoc } from '../tp-doc';
import { PlanesMedPService } from '../planes-med-p.service';
import { TpDocumentosService } from '../tp-documentos.service';


@Component({
  selector: 'app-registrar-cliente',
  templateUrl: './registrar-cliente.component.html',
  styleUrls: ['./registrar-cliente.component.css']
})
export class RegistrarClienteComponent implements OnInit {

  clien : Cliente = new Cliente();
  arrPlanesMP:PlanesMP[];
  arrTpDoc:TpDoc[];
  
   /*
  constructor(private cliServicio:ClienteService) { }
 */
  constructor(private cliServicio:ClienteService,private router:Router,
              private planServ:PlanesMedPService, private docServ:TpDocumentosService) { 
  }

  ngOnInit(): void {
    this.obtenerTpDocumentos();  
    this.obtenerPlanesMP();
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

  private obtenerTpDocumentos(){
    this.docServ.obtenerListaDeTpDoc().subscribe(dato => {
      this.arrTpDoc=dato;
    });
  }
  
  private obtenerPlanesMP(){
    this.planServ.obtenerListaDePlanesMP().subscribe(dato => {
      this.arrPlanesMP=dato;
    });
  }

}
