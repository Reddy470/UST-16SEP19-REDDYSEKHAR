import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SerchCategoryComponent } from './serch-category.component';

describe('SerchCategoryComponent', () => {
  let component: SerchCategoryComponent;
  let fixture: ComponentFixture<SerchCategoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SerchCategoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SerchCategoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
