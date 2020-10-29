# java-6day-loop
반복문


//<문제 6-3>
				
//ocjp 신입문제


				i = 0; 
				j = 1;
			    
				if ( (i++ == 0) & (j++ == 2) ) {
					i = 42;
				}
				System.out.println(i + j);
				
//<문제 7>
// for 문을 사용하여 1~11까지 곱한 더한 값을 출력
				
				
				tot = 1;
				
				for( i = 1 ;  i<=11 ; i++) {
					
					tot = tot * i;
							  
					
				}
				
				System.out.println(tot);
				
//<문제8>
//for문을 사용하여 5~1까지 거꾸로 더해보자

				tot = 0;
				
				for ( i=5 ; i>0 ;   i--) {
					
				tot = tot+i;
				
//				5+4+3+2+1 = 15
				}
				
				System.out.println( tot );
				
				
				
//<문제9>
// 더블 반복문 예제 - 구구단 만들기.		
//				1 x 1 = 1     2 x 1 = 2    3 x 1 = 3    ....    9 x 1 = 9
//				1 x 2 = 1     2 x 2 = 2    3 x 2 = 3    ....    9 x 2 = 9
// 줄바꾸면서 뭐가 바뀌나.
// System.out.print( )=>  줄안바꾸고 옆으로 계속 찍는다
// System.out.println( ) => 아무것도 없으면 줄바꾼다.
//i -> j -> k

				for (i=1; i<10 ; i ++ ) {			
					
						for (j = 3 ;  j < 8 ;  j++) {
					
//					1  1   1*1
//					1  2   
//					1  3
							System.out.print(  j + " x " + i + " = " + (i*j)  + "  " );

						}
						
						System.out.println( );
				}
				
//<문제 10>
// 5단 제외하고 구구단 출력하기
				
				for (i = 1; i < 10 ; i++ ) {
					
						for ( j = 1; j < 10 ; j ++ ) {
					
									if (!(j == 5)) {
									// ( j != 5)와 같다. 
						
										System.out.print( j + " x " + i + " = " + (i*j) + "     " );
						
									}
					
						}
					
					System.out.println(  );
				}
				
//<문제10-1>
//continue; 용법 (계속된다 -> X) (그자리에서 증감연산자로 가.(O) 라는 뜻)
// '야 이 작업은 피하고 그 다음으로 건너뛰자' 라는 의미.
//contine이후의 코딩은 실행하지말고 그다음으로 건너뛰자.
				for (i = 1; i < 10 ; i++ ) {
					
					for ( j = 1; j < 10 ; j ++ ) {
				
								if ( j == 5 ) {
								// ( j != 5)와 같다. 
								continue;
									
								}
								
						System.out.print( j + " x " + i + " = " + (i*j) + "     " );
					}
				
				System.out.println(  );
			}

//<문제10-2>
// continue용법 사용하여 5단만 출력하기
				
//continue; 용법 (계속된다 -> X) (그자리에서 증감연산자로 가.(O) 라는 뜻)
// '야 이 작업은 피하고 그 다음으로 건너뛰자' 라는 의미.
//contine이후의 코딩은 실행하지말고 그다음(continue를 끌어안고있는 반복문)으로 건너뛰자.
				for (i = 1; i < 10 ; i++ ) {
									
					for ( j = 1; j < 10 ; j ++ ) {
								
								if ( j != 5 ) {
								// ( j != 5)와 같다. 
								continue;
													
								}
												
						System.out.print( j + " x " + i + " = " + (i*j) + "     " );
					}
								
				System.out.println(  );
			}

//<문제11>
// 1~5단까지 출력하기
// 단, int i<=9; i<=9; i++ 와 int j<=0; j<=9; 는 고정시켜라.

				for (i = 1; i < 10 ; i++ ) {
					
					for ( j = 1; j < 10 ; j ++ ) {
								
								if ( j>5 ) {
								// ( j != 5)와 같다. 
								continue;
													
								}
												
						System.out.print( j + " x " + i + " = " + (i*j) + "     " );
					}
								
				System.out.println(  );
			}

//<문제11-1>
// 1~5단까지 출력하기
// 단, int i<=9; i<=9; i++ 와 int j<=0; j<=9; 는 고정시켜라.
// continue 없이 *
// continue 쓰면 단점이 있다. continue가 들어있는 조건문만 실행안하고 건너뛴다.
				
				
				for (i = 1; i < 10 ; i++ ) {
									
						for ( j = 1; j < 10 ; j ++ ) {
												
								if ( j<6 ) {
								
									System.out.print( j + " x " + i + " = " + (i*j) + "     " );	
									
								}									
								
						}								
					
					System.out.println(  );
				}
//<문제11-2>
// 1~5단까지 출력하기
// 단, int i<=9; i<=9; i++ 와 int j<=0; j<=9; 는 고정시켜라.
// continue 없이 *
// continue 쓰면 단점이 있다. continue가 들어있는 조건문만 실행안하고 건너뛴다.
// break 용법( 반복문의 스나이퍼,암살자 = break = 계속 반복해야되는 구문에서 break를 끌어안고있는 *반복문* 을 멈추고 종료시키고 빠져나가는 기능)
// 그자리에서 반복믄은 끝난다. 아예 그 반복문을 탈출을 해버린다.
								
				for (i = 1; i < 10 ; i++ ) {
													
						for ( j = 1; j < 10 ; j ++ ) {
																
								if ( j>5 ) {
												
									break;
													
								}									
							System.out.print( j + " x " + i + " = " + (i*j) + "     " );	
						}								
									
					System.out.println(  );
				
				}

//<문제12>
// 1~9단
// 구구단의 곱셈의 결과가 48일때까지만 출력하기.
// 블럭안의 변수는 바깥쪽의 변수를 인지한다.* * *		
				
				for (i = 1; i < 10 ; i++ ) {			
					
					for ( j = 1; j < 10 ; j ++ ) {
						
						int aaa = i * j;	//  왜 여기에 변수를 넣었나?바깥이 아니라.		
						
						if (aaa <= 48) {				
							
						System.out.print( j + " x " + i + " = " + (i*j) + "     " );	
						
						}								
					}
				System.out.println(  );
				}
// <문제12-1>
// break를 걸면 한블럭 밖이 아니라 그이상  바깥으로 빠져나가게 하는 방법 **

				boolean is_stop = false; // * 스위치처럼 키고끄는방법.... 참/거짓으로.
				
				for (i = 1; i < 10 ; i++ ) {					
					
							for ( j = 1; j < 10 ; j ++ ) {
														
												
									System.out.print( j + " x " + i + " = " + (i*j) + "     " );
						
										if (i*j == 48) {
							
												is_stop = true; break;
							
										}		
						
							}
					
							System.out.println();
							
							if (is_stop == true) {
								break;
							}
			
				}

//<12-2>
///zzz: 최초 반복문 for 앞
// break zzz; 가장안쪽에서 break 해도 최초 반복문 바깥으로 빠져나간다. 

				
				zzz: for (i = 1; i < 10 ; i++ ) {					
					
							for ( j = 1; j < 10 ; j ++ ) {
														
												
									System.out.print( j + " x " + i + " = " + (i*j) + "     " );
						
										if (i*j == 48) {
							
												break zzz;
							
										}		
						
							}
					
							System.out.println();
							

				}

// <문제13>
//1~100까지 더한 누적 합이 50미만일때 까지만 더하고 출력하기
				
				

				
			tot = 0;
			
			for (i=1; i<100; i++) {
				
				if (tot+i >= 50 ) {
//				    -----
//					tot를 쓰면 안된다. 값이 다르다.
					break;
				}
				
				tot		 = 		tot + i;		
//				---  			--------
//			누적시키는 것		이전 누적된것 + 다음숫자 합
//			
//			둘은 같은 의미이지만 언제 멈출지를 생각하면 변수의 데이터와 위치를 잘 선택해야 한다.
			
			}
			
			System.out.println(tot);
			
//<문제13-1><else>
			
			tot = 0;
			
			for (i=1; i<100; i++) {
				
				if (tot+i < 50 ) {
					tot		 = 		tot + i;	
					
				}else
					break;
					
			}
			
			System.out.println(tot);
			
//<문제 14>****** <어 려 움 !> 
//			아래 형태로 출력하기
//			1
//			12
//			123
//			1234
//			12345
			// 줄이 바뀔때마다 숫자가 하나씩 늘어난다.
			// 줄이 바뀔 때 마다 숫자가 늘어난다. 반복을 많이한다. 
			
			for (  i=1 ; i<6  ; i++   ) {
				
				for ( j=1  ;  i>=j  ; j++   ) {
					//몇번반복할거냐 
					
//					i = 1 -> 2 -> 3 -> 4
//							
//					j = 1 
//
//					
//					=> 1 
//					=> 1 2
//					=> 1 2 3
			
					System.out.print( j   );
				}
				
				
				System.out.println();
			}
			
			
//<문제 15> **어려움
//			아래 형태로 출력하기
//			1
//			23
//			345
//			4567
//			56789
			
//줄이 바뀔때마다 숫자가 늘어난다.
// 줄이 바뀔때 마다 1이늘어난 상태에서 시작한다.
			
			for (  i=1 ; i<6  ; i++   ) {
				
				for ( j=i  ;  i*2 > j  ; j++   ) {

//					i =1 -> 2
//					j =1 -> 2 -> 3 -> 4
//					
//					=> 1
//					=> 2 3
//					=> 
					
//					=> 
			
					System.out.print( j   );
				}
				
				System.out.println();
			}
//<문제 16>//아예모르겠다
//아래처럼 출력하기
// *
// **
// ***
// ****
// *****
			 
			for (i = 1 ;  i<6 ; i++) {
				
				for ( j=1     ; j==i  ;   i++  ) {
					
					
					System.out.print("*");
					
				}
			System.out.println();	
			}
				
// <문제 17>
//ocjp/ 입사 시험문제 // 중요 // 흐름을 잘 보고 패턴을 파악.
			
			int a = 1;
			int b = 5;
			
			jump : for( ; ; ) {
				
				a++;
				for( ; ; ) {
					
					if (a>--b) { break jump;
					
					}
				}
					
					
 			}
			System.out.println(a+b);

// <문제 17-1>
//ocjp/ 입사 시험문제 // 중요 // 흐름을 잘 보고 패턴을 파악.
						
			 a = 1;
			 b = 5;
						
			jump : for( ; ; ) {
							
				a++;
				for( ; ; ) {
								
					if (a>b--) { break jump;
								
					}
				}				
								
			 }
			System.out.println(a+b);
			
//<문제18>
//입사 시험문제
// break outer : break 반복문밖으로 나가라. 
// continue inner : inner의 반복문의 증감식으로 돌아가라
			a = 0;
			b = 5;
			
			outer : for( a=0 ; a<5 ; a++ ) {
				
				inner : for( b=0 ; b<5 ; b++ ) {
					if(a==1&&b==0) { break outer; }
					if(a==2&&b==1) { continue inner; }
					
				}
			}
			System.out.println(a+b);

//<문제19>
			
			a=1;
			b=5;
			boolean c = false;
			for( i = 0 ; i > -1 ; i++) {
				
				a++;
				for( j = 0 ; j > -1 ; j++ ) {
					
					if( a> --b ) { c = true; break;}
					
				}
				if( c ) { break; }
				
			}
			System.out.println(a+b);
			
//<문제20>
//ocjp 원문 시험문제

//			Which two are valid declarations of boolean? (Choose two.)
// 			타당하게 선언된 불린 데이터를 두가지를 고르시오.
			
//			A. boolean b = 0;
//			B. boolean b = true;
//			C. boolean b = "true";
//			D. boolean b = 'true';
//			E. boolean b = (3 >= 0);
			
// 			C.E
			
			
			
				
				
			
				
				
				
	}
	

}
