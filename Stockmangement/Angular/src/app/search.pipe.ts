import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  transform(product: any, search: any): any {
    if (search === undefined) {
      return product;

    } else {
      return product.filter((value, index, array) => {
        return value.catogory.toLowerCase().includes(search.toLowerCase());
      });
    }

  }
}
