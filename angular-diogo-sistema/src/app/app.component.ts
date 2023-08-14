import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  /*template: `<div class="container">
                <div>Digite sua nota:</div>
                <textarea [formControl]="note" class="note-input"></textarea>
                <div class="save-indicator">{{ save-indicator | async }}</div>
             </div>`
             ,*/
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
 /* title = 'angular-diogo-sistema';
  note = new FormControl("");
  saveIndicator$ = of("Todas as mudanças foram salvas");*/
}
