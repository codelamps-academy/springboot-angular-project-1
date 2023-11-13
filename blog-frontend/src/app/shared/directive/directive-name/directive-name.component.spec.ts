import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DirectiveNameComponent } from './directive-name.component';

describe('DirectiveNameComponent', () => {
  let component: DirectiveNameComponent;
  let fixture: ComponentFixture<DirectiveNameComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DirectiveNameComponent]
    });
    fixture = TestBed.createComponent(DirectiveNameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
