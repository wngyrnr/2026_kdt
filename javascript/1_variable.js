console.log("Hello, World!");
/*
    js는 동적 타입 언어 : 타입을 미리 정하지 않고
    실행 중간에 값에 따라서 타입을 결정하는 언어.

*/
/*
    js의 변수

    1. var - 사용하지 않는다.
    2. let -  
    3. const

    js의 hoisting 
    변수와 함수 선언이 해당 파일 최상단으로 끌어올려진 것처럼 동작하는 현상.
    선언만 끌어올리고 할당은 그대로 남는다.
*/

// javascript에서는 undefined !=null 이다. undefined는 
// javascript는 변수들을 실행시작 전 미리 선언하기 때문에 
console.log(name);


var name = null;
var age = 55;
var height = 102.2;
var isPass = true;
console.log(name);

var name = "홍길동";
console.log(name);

/*
    let은 var에서 같은 이름의 중복생성을 하지 못하게 만든 자료형
    let이나 const도 호이스팅이 되지만 동시에 TDZ(Temporal Dead Zone)에 저장함.
    선언 시점에 TDZ에서 제거해서 사용하게 만들어준다.
*/

//console.log(name2);
let name2 = "최지원";
console.log(name2);

//let name2 = "김수민"; 이미 선언된 변수라는 애러가 발생 Identifier 'name2' has already been declared

//

const name3 = "박지수";
//name3 = "김지수"; 값을 한번 저장하면 바꿀 수 없다.

//const라도 객체/배열 내부의 값은 바꿀 수 있다.
const list = [1, 2];
list.push(3);
console.log(list);
//list = [4]; Assignment to constant variable. 재할당 불가


/*

    js의 네이밍규칙

    변수이름
    1) 일반적으로 영어를 사용하며 문자와 숫자 모두 사용할 수 있음.
    2) 특수문자는 언더스코어(_)와 달러($)만 사용할 수 있음.
    3) 숫자로 시작하면 안됨.
    4) 키워드를 변수명으로 사용하면 안됨.

    일반적으로 변수명, 함수명, -> camelCase
    class, id같은 속성명 -> kebab-case


*/

//------------ 동적 타입 -----------------
let value = "최지원";
console.log(typeof value);
value = 55;
console.log(typeof value); //같은 변수에 다르 타입 재할당 가능

/*
    자료형 : 원시타입 6개 + Object타입 1개
    원시타입 : Number, String, Boolean, undefined, null, Symbol
    Object : Object, Array,Function ... 
*/

//Number(숫자 - 정수/실수 구분x)
const age2 = 55;
const temp = 10.5;
console.log(typeof age, typeof temp);
console.log(typeof Infinity);
const title = "초지원";

//String - (문자열)
console.log(typeof title);

//Boolean
const isTrue = true;
console.log(typeof isTrue);

//undefined(값을 초기화하지 않았을 때 자동 지정)
let num;
console.log(num);
console.log(typeof num);

//null (개발자가 명시적으로 '없음'을 넣을 때)
let init = 10;
init = null;
console.log(typeof init); // Object로 나오는 것은 버그

//Symbol(유일무이한 값)
const s1 = Symbol("1");
console.log(s1);
const s2 = Symbol("1");
console.log(s2);
console.log(s1 === s2);

//console.log(10=="10");  ==는 값만 비교
//console.log(10==="10"); ===타입까지 비교

//object (key : value 구조 , Map과 유사)

const jiwon = {
    name = "ㅂㅈㄷ",
    age = 29,
    address = "incheon asd",
    job = "asd"

}
console.log(jiwon.name);
console.log(jiwon.age);

//Array(js으 ㅣ배열은 리스트와 유사 =                   
const arr = ['초록', '파랑'];
const arr2 = [];
arr = [3];