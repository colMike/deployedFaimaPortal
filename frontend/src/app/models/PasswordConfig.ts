export class PasswordConfig{
    public id
    constructor(
        public passExpiry: number,
        public hasNumeric: boolean,
        public hasSpecialChar: boolean,
        public hasUpperCase: boolean,
        public lowerCase: boolean,
        public hasLetters: boolean,
        public charLength: number
    ){}
}