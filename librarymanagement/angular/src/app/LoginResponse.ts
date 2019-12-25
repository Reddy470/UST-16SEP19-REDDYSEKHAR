export class LoginResponse {
    constructor(
        public sno: number,
        public name: string,
        public email: string,
        public pwd: string,
        public type: string
    ) {}
}