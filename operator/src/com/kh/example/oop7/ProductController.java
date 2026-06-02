package com.kh.example.oop7;
/*
	- **필드**
    - `pro : Product[] = new Product[10]` — 상품 정보 배열
- **생성자**
    - `ProductController()`
        
        → 10칸 배열에 다음과 같이 **샘플 데이터**로 초기화 (3개만 사용)
        
        ```
        갤럭시, 1200000, 삼성
        아이폰, 1300000, 애플
        아이패드, 800000, 애플
        ```
        
- **메서드**
    - `insertProduct(String pName, int price, String brand)` : `void`
        
        → 배열의 다음 빈 칸에 상품 추가
        
    - `selectProduct()` : `Product[]`
        
        → 현재 저장된 상품 배열 반환
 */
public class ProductController {
	//Product 참조변수 10개 생성
	private Product[] pro = new Product[10];

	public ProductController() {
		pro[0] = new Product("갤럭시", 1200000 , "삼성");
		pro[1] = new Product("아이폰", 1300000 , "애플");
		pro[2] = new Product("아이패드", 800000 , "애플");
	}
	
	public void insertProduct(String pName, int price, String brand) {
		//배열의 새로운 객체를 추가하려면 
		//먼저 빈공간(주소값이 x, null )을 찾아야한다.
		for(int i =0; i<pro.length; i++) {
			if(pro[i]==null) {
				pro[i] = new Product(pName,price,brand);
				break; //빈 배열을 찾아서 객체를 생성했기 때문에 반복문 종료
			}
		}
		
		
	}
	public Product[] selectProduct() {
		return pro;
	}
	
	
	
}
