import { TestBed } from '@angular/core/testing';

import { PlanesMedPService } from './planes-med-p.service';

describe('PlanesMedPService', () => {
  let service: PlanesMedPService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PlanesMedPService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
