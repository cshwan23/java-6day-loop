


	package com.daum.erp;

	public class Test_06 {
 
		public static void main(String[] args) {
	
			
//"사오정"이라는 문자 데이터를 9번 출력하기
			
// 무식한 방법으로 사오정 9번 출력하기	
		System.out.println("사오정");	
		System.out.println("사오정");	
		System.out.println("사오정");	
		System.out.println("사오정");	
		System.out.println("사오정");	
		System.out.println("사오정");	
		System.out.println("사오정");	
		System.out.println("사오정");	
		System.out.println("사오정");	
		System.out.println("사오정");	

// for 문 사용하여 "손오공"이란 문자 데이터9번 출력하기
		
//		for ( 초기값설정 ; 조건식 ; 증감식 ) { 실행구문; }
//		초기값이 조건식에 맞지않으면 한번도 실행 안될수도 있다.
//      증감식을 잘못 설정하면 무한반복에 걸릴 수도 있다.
//		조건식이 없을 경우(생략된 경우) 무한반복에 걸린다.
//		증감식이 없을 경우(생략된 경우) 무한반복에 걸린다.
//		언제끝나냐 조건식(조건식이 false여야 빠져나온다.)
//		마지막 실행되는건 조건식이다.(반복문의 마지막은 조건식이다.)
//		무한반복에 빠지지 않도록 프로그램을 잘 짜야한다.(조심해야된다.)
//		int i=0;
		for( int i=0;  i<=9   ;   i++ ) {
//			-------   -----       ---
//			  <1>   <2><6><10>.. <5><9>..
//<1>0번부터 시작해라 (변수 초기화)			
//<2>조건식이 true일 때 안으로 들어간다(false이면 for문(반복문)을 빠져나간다. 			
//		
			System.out.println("손오공");
//		    ---------------------------
//			            <3><7><11>...
//<3>한번 출력			
		}
//     --
//	  <4><8><12>...
//<4>빠져 나온다.
//<5>증감식에 들린다 i가 1이 증가한다 i가1이된다
//<6>조건 확인한다 트루이면 안으로 들어간다
//<7>실행구문을 실행한다.
//<8>빠져나온다
		
//		System.out.println(i);  // -> 에러난다.
//		for 문 () 안에서 선언된 변수는 for문 바깥에선 쓸 수가 없다.
//		for문 바깥으로 i 변수를 빼면 바깥에서도 사용가능하다.
		
		
//<문제1> *어렵다*다시볼것 *순서 확실히 기억*
//for 문 사용하여 1부터 5까지 더한 결과를 출력하기

		int tot = 0;
		
		for ( int i=1; i<6 ; i++) {
			
			tot = tot + i;
			
		}
		System.out.println("1부터 5까지의 합 : " + tot );
		
//변수안의 데이터가 계속 변한다
//변수추적능력 필요.
//		t   i 
//		0 + 1
//		1 + 2
//		3 + 3
//		6 + 4	
//		10+ 5	
		
		
//<문제2>*tot의 필요성*용도* for문이 어떻게 사용되는지 이제 적용/
//for 문을 사용하여 1부터 5까지 더하되 홀수만 골라 더한 결과를 출력하기
		
			
		tot = 0;
		
		for (int i=1 ; i<6  ; i+=2 ) {

			
			tot = tot + i;
//			0 = 0 + 1
//			0 = 0 + 3 
			
			
		}
			
		System.out.println("1부터 5까지의 홀수의 합 : " + tot );
			
//<문제3> 
//		증감식을 i++를 건드리지말고 놔둔 상태에서 홀수의 합을 구해보기
		tot = 0;
		
		for (int i=1 ; i<6  ; i++ ) {

			
			if (i%2 == 1) {
						
				
			tot = tot + i;
			
//			1을 2로 나눈 나머지 값은 1, 3, 5, 7 ..홀수이다
//			0 = 0 + 1
//			0 = 0 + 3 
			}
			
		}
//<문제4> 
//for 문을 사용하여 1부터 60까지 더하되 40번대 숫자를 제외하고 더한 결과를 출력하시오.
		
		tot = 0;
		int tot1 = 0;
		
		
		for (int i=1 ; i<61 ; i++ ) {

			tot = tot + i;

		}
		
		for (int i=40 ; i<50 ; i++ ) {

			tot1 = tot1 + i;

		}
		
		int tot2 = tot - tot1;

		System.out.println("4)40번대를 제외한 1부터 60까지의 합 : " + tot2 );	
		
//<문제4-1> 
//for 문을 사용하여 1부터 60까지 더하되 40번대 숫자를 제외하고 더한 결과를 출력하시오.
				
				tot = 0;

				for (int i=1 ; i<61 ; i++ ) {

				if ((i >= 1 && i < 40) || ( i >= 50 && i <= 60)){
					
					tot = tot + i;
				}

				}


				System.out.println("4-1)40번대를 제외한 1부터 60까지의 합 : " + tot );	
	
//<문제4-2> 
//for 문을 사용하여 1부터 60까지 더하되 40번대 숫자를 제외하고 더한 결과를 출력하시오.
								
				tot = 0;

				for (int i=1 ; i<61 ; i++ ) {

					if (!(i>39 && i<50)){
// 					40번대를 잡아놓고 그 제외(!반전연산자)만 구하자 
						
						tot = tot + i;
					}

				}


				System.out.println("4-2)40번대를 제외한 1부터 60까지의 합 : " + tot );
		
//<문제5>
// 구구단 5단을 아래 처럼 출력하기
// 5 x 1 = 5
// 5 x 2 = 10
// 5 x 3 = 15
				int five = 5;
				tot = 0;
				int answer = 0;
				
				for ( int i=1 ;  i<11 ; i++ ) {
					
					
//					five 
//					5   1  5 
//					5   2  10
//					5   3  15
//					5   4  20
//					5   5  25
//					5   6  30
//					5   7  35
//					5   8  40
//					5   9  45
//					5   10 50
					tot = i; // 1 2 3 4 5 6 7 8 9 10
					answer = five * i;
					System.out.println( five + " x " + i + " = " + answer );

					
					}

			
//<문제 6-1>
//ocjp시험문제*
				int i = 1;
				int j = i++;
				if ( (i == ++j) | (i++ == j) ) {
//					  2     2       2     2
					
					i = i + j;
//					    3   2
					
				}
				
				System.out.println("i = " + i);
				
//			i = 2 -> 3
//			j = 1 -> 2
			
			
//<문제 6-2>
//ocjp시험문제*
				int i1 = 1;
				int j1 = i1++;
				if ( (i1 == ++j1) || (i1++ == j1) ) {
									
					i1 = i1 + j1;
									
				}
								
				System.out.println("i = " + i1);
									
//				i 0 =>1
//				j 1 ->2
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
