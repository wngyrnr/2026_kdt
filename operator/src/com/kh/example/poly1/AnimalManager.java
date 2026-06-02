package com.kh.example.poly1;

public class AnimalManager {
/*
 * - **메서드**
    - `main(String[] args): void`
        - 크기 5인 `Animal` 배열 생성 후 `Dog`, `Cat` 객체를 자유롭게 생성 저장
        - 향상된 for문을 활용하여 모든 동물의 `speak()` 호출
        - `instanceof` 활용: `Dog`일 경우 `"이 개의 견종은 XXX입니다."` 출력,
            
            `Cat`일 경우 `"이 고양이의 색상은 XXX입니다."` 출력
 */
	public static void main(String[] args) {
		Animal[] anArr = new Animal[5];
		
		anArr[0] = new Dog("강아지",2,"진돗개");
		anArr[1] = new Cat("고양이",1,"검정색");
		anArr[2] = new Dog("강아지",3,"삽살");
		anArr[3] = new Dog("강아지",4,"진돗개");
		anArr[4] = new Cat("고양이",5,"흰색");
		
		for(Animal num :anArr) {
			num.speak();
			if(num instanceof Dog) {
				String breed = (((Dog)num).getBreed());
				System.out.println("이 개의 견종은"+breed +"입니다.");
			}else if(num instanceof Cat) {
				String color = (((Cat)num).getColor());
				System.out.println("이 개의 견종은"+color +"입니다.");
			}
			
		}
		
		
	}

}
