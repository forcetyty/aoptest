package kr.co.itcen.aoptest;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public void hello() {
		System.out.println("Hello World");
	}

	public ProductVo find(String name) {
		// TODO Auto-generated method stub
		System.out.println("[ProductService] finding... ");
		
//		if( 1 - 1 == 0) {
//			throw new RuntimeException("DAO Exception");
//		}
		
		return new ProductVo(name);
	}

}
