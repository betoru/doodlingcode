//변수비교
var a = 'apple';
var b = 'apple';
console.log(a === b); //true

/*
    Javascript에는 객체 타입이 존재하고
    객체 타입은 {name : "Tom", food : "pizza"}와 같이 
    Key, Value 값으로 편리하게 쓸 수 있는 장점있다.
    
    그래서 실무에서는 이런 객체를 배열에 담고 쓰는 경우가 종종 있음.
    그러나 배열에 넣고 쓰다보니 배열에 이미 들어있는 객체인지 중복 체크가 필요한 경우가 생김.
    단순한 변수이거나 타입 비교라면, 그냥 == 비교로 하면 되겠지만 객체는 불가함.
    
    객체 타입은 참조에 의해 할당되고 복사되는 타입으로, == 이나 Object.is() 비교를 사용했을 때, 
    객체 자체가 아닌 각각의 변수들이 저장하고 있는 객체의 참조를 비교하기 때문에
    객체 간 Key와 Value값이 일치해도 참조값이 다르면 false로 처리됩니다.
    그렇기 때문에, 객체 간 비교를 위해서는 객체 자체를 비교하지말고 다른 방법을 이용해야 합니다.
*/

//#1. key, value 값을 이용해 비교하는 방법
console.log('#1.key, value 값을 이용해 비교하는 방법 시작.');

let arr = new Array();
arr.push({name : "Tom", food : "pizza"});
arr.push({name : "Ahn", food : "hamberger"});

const user = {name : "Lee", food : "rice"};
console.log('#1-1. 객체 간 name값을 비교하여 없으면 추가');
//js 내장함수 filter를 이용하여 배열에서 객체를 찾는다.
//filter는 배열에서 조건에 맞는 객체를 찾아서 새로운 배열로 반환한다.
if(arr.filter((item) => item.name === user.name).length < 1) {
    arr.push(user);
    console.log(arr);
}

console.log('#FYI. iterator를 이용한 배열 출력');
for (const iterator of arr) {
    console.log(iterator);
}
console.log('#1. key, value 값을 이용해 비교하는 방법 끝.');

//includes : 배열에 특정 요소가 포함되어 있는지 여부를 결정합니다.
//#FYI : includes는 ES6에서 추가된 메소드로 객체의 포함여부를 확인할 수 없다.
const user2 = {name : "Tom", food : "pizza"};
console.log(arr.includes(user2)); //false
console.log(arr.some(el => el.food === user2.food)); //true

//#2. JSON.stringify()를 통해 객체를 문자열로 변환 후 비교하는 방법
const fruit1 = { name: 'apple', price: 1000 };
const fruit2 = { name: 'apple', price: 1000 };
console.log(fruit1 === fruit2); //false
console.log(JSON.stringify(fruit1) === JSON.stringify(fruit2)); //true
console.log(JSON.stringify(fruit1));
console.log(fruit1);

//객체비교2
const fruit3 = { name: 'apple', price: 1000 };
const fruit4 = fruit3;
console.log(fruit3 === fruit4); //true

//객체비교3
const fruit5 = { name: 'apple', price: 1000 };
const fruit6 = fruit5;
fruit6.name = 'banana';
console.log(fruit5.name); //banana

//객체비교4
const fruit7 = { name: 'apple', price: 1000 };
const fruit8 = fruit7;
fruit8.name = 'banana';
console.log(fruit7 === fruit8); //true
