import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TpDoc } from './tp-doc';

@Injectable({
  providedIn: 'root'
})
export class TpDocumentosService {

  // Listado de Tipos documentos Backend
  private baseURL ="http://localhost:8092/api/tpIdentificacion";
  constructor(private httpClient : HttpClient) { }
  
  // Metodo para obtener los clientes
  obtenerListaDeTpDoc():Observable<TpDoc[]>{
    return this.httpClient.get<TpDoc[]>(`${this.baseURL}`)
  }
}
