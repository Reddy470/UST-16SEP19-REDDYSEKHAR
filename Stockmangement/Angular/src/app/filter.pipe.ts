import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(product: any, search: any): any {
    if (search === undefined) {
      return product;

    } else {
      return product.filter((value, index, array) => {
        return value.name.toLowerCase().includes(search.toLowerCase());
      });
    }

  }
}
