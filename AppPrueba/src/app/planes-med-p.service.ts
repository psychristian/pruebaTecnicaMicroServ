import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PlanesMP } from './planes-mp';

@Injectable({
  providedIn: 'root'
})
export class PlanesMedPService {

  // Listado de Tipos documentos Backend
  private baseURL ="http://localhost:8092/api/planesMP";
  constructor(private httpClient : HttpClient) { }
  
  // Metodo para obtener los clientes
  obtenerListaDePlanesMP():Observable<PlanesMP[]>{
    return this.httpClient.get<PlanesMP[]>(`${this.baseURL}`)
  }
}
