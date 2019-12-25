import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'company'
})
export class CompanyPipe implements PipeTransform {

  transform(product: any, search: any): any {
    if (search === undefined) {
      return product;

    } else {
      return product.filter((value, index, array) => {
        return value.company.toLowerCase().includes(search.toLowerCase());
      });
    }

  }

}
