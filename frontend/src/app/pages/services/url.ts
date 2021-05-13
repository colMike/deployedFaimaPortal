export class Urls {
  // private uri = 'otc/rest/v1';
  // private uri = 'http://localhost:20204/revenueCollection/api';
  private uri = 'http://197.220.114.46:20204/revenueCollection/api';

  get url(): string {
    return this.uri; // = 'http://localhost:9000/compasotc/otc/rest/v1' ;
  }

  // set url(uri: string) {
  //     this.uri = 'rest/v1';
  // }
}
