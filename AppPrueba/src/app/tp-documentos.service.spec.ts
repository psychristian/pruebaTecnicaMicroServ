import { TestBed } from '@angular/core/testing';

import { TpDocumentosService } from './tp-documentos.service';

describe('TpDocumentosService', () => {
  let service: TpDocumentosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TpDocumentosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
