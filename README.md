# SistAirlines
JSP를 활용한 항공예약시스템
  * 주요 기능 
    1. 스케줄 조회 
    2. 탑승객 정보입력 
    3. 결제 
    4. 스케줄/예약내역 조회
  * 사용 Language
    - JSP
    - SQL(Oracle)
    - HTML
    - CSS
    - Javascript
    
  * ERD
  ![2차_erd](https://user-images.githubusercontent.com/48818574/90142091-ea206780-ddb6-11ea-906c-008ae7f45feb.png)

  * 스케줄 관리 
    - 초기 데이터
    
      테이블(날짜(두달치), 운항도시, 왕복) PL/SQL과 Cartitian(카티션) 곱을 활용하여 스케줄(f_schedule) 데이터를 생성한 후 삽입
    - 하루가 지날 때 
        1. 하루치 데이터를 카티션 곱으로 생성하는 프로시저를 작성
        2. 해당 프로시저를 호출하는 메소드를 jar파일에 담는다. 
        3. batch파일을 통해 jar파일을 실행시켜준다. 
        4. 해당 batch파일을 윈도우에 내장된 '작업스케줄러'를 통해 batch파일을 실행시킨다.
 
