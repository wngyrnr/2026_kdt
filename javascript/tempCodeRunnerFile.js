function createStore(inital = 0){
        let value = inital;//value에는 외부접근 불가능
        return{
            get: () => value,
            set: () => {value = v;},
            increase : () =>{value++; return value;}
        }
    }