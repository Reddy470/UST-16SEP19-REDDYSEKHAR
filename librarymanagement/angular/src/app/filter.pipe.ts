import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(books: any, search: any): any {
    if (search === undefined) {
      return books;

    } else {
      return books.filter((value, index, array) => {
        return value.bname.toLowerCase().includes(search.toLowerCase());
      });
    }

  }

}
