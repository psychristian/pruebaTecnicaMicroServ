import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from './cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  // Listado de Clientes Backend
  private baseURL ="http://localhost:8091/api/clientes";
  constructor(private httpClient : HttpClient) { }

  // Metodo para obtener los clientes
    obtenerListaDeClientes():Observable<Cliente[]>{
      return this.httpClient.get<Cliente[]>(`${this.baseURL}`)
    }
  // Metodo para registrar el cliente
    registrarCliente(cli:Cliente) : Observable<Object>{
      return this.httpClient.post(`${this.baseURL}`, cli);
    }

    // Metodo para eliminar el cliente
      eliminarCliente(id:number) : Observable<Object>{
        return this.httpClient.delete(`${this.baseURL}/${id}`);
      }

}
