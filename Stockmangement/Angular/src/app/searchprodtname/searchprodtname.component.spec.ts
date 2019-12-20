import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchprodtnameComponent } from './searchprodtname.component';

describe('SearchprodtnameComponent', () => {
  let component: SearchprodtnameComponent;
  let fixture: ComponentFixture<SearchprodtnameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchprodtnameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchprodtnameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
