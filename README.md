# backend1


8 controller - .java

AccountController- LOC-71
BoardController - LOC-32 
CartController - LOC-79     
ItemController - LOC-24
OrderController - LOC-74     
 PCartController - LOC-80   
PItemController - LOC-22      
POrderController - LOC-69    

2 dto - .java

OrderDto - LOC - 13
POrderDto - LOC - 13

8 entity 
Board.java -LOC- 22
Cart.java -LOC- 23
Item.java -LOC- 30
Member.java -LOC- 22
Order.java -LOC- 35
PCart.java -LOC- 23
PItem.java -LOC- 30
POrder.java -LOC- 35




8 repository

BoardRepository.java -LOC- 12
CartRepository.java -LOC- 14
ItemRepository.java -LOC- 11
MemberRepository.java -LOC- 9
OrderRepository.java -LOC- 11
PCartRepository.java -LOC- 14
PItemRepository.java -LOC- 11
POrderRepository.java -LOC- 12

4 service

BoardService.java -LOC- 27
JwtService.java -LOC- 13
JwtServiceImpl.java -LOC- 72
BackendApplication.java -LOC- 13

![image](https://github.com/IT-skills-donation-website/backend1/assets/105649474/6126b011-b2f2-4db5-92b7-1b9298ffbe5b)


TODO:

pages/Order.vue  25, 124 라인 i.price 수정(완료)
discountper 수정 필요

README.md - 대표적인 화면 구성, 실행 방법 및 이용 툴 버전 명시
기본적인 변수 아닌 경우 협업 위해 변수 또는 변수에 대한 설명도 추가적으로 작성
-firefox가 웹의 가장 표준이기 때문에 테스트는 firefox로 하기
-opensource library 사용 시 라이선스(회사에서 사용 가능한지)확인 후 프로젝트에 적용 할 때 readme 페이지에 npm, vscode, library name, 문서 등등 라이브러리 사용 시 적용된 프로그램과 문서 버전 적어서 사용자 환경 구성해두기
-readme에 함수명, 변수명 등 사용자가 임의로 작성한 내용들 첨부하여 내용 공유하기
-대부분 프로젝트가 object parameter 받아오는 것을 시작으로 진행되는데 초기값(initial)은 최상단에 적어서 사용하면 편리함
-사용할 함수에 대해서는 파라미터 사용, 상수로 들어가면 수정이 어렵기 때문
-변수명은 카멜 표기법, 동사 먼저적고 뒤에 명사가 오도록, 변수 축약하게되면 위에 주석으로 설명하기
-검증되지 않은 블로그 글, 또는 오래된 자료보다는 공식 문서(홈페이지) 위주로 공부하는 것을 추천

