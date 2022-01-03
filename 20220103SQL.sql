-- ict_practice를 쓰도록 해 주세요.
use ict_practice; 

-- 앞에 스키마명을 추가로 입력해 스키마명.테이블명 으로 조회도 가능함. 
SELECT * FROM ict_practice.usertbl;

-- 유저를 두 명만 더 추가해주세요.
-- 정보는 전부 여러분들이 알아서 집어넣어시되, 키는 한 명은 160대로 해주세요.
INSERT INTO userTbl VALUES ('KDH','씨맥','1990','서울','01001000101','170','2012-05-26');
INSERT INTO userTbl VALUES ('LSH','페이커','1996','서울','01021456789','186','1996-04-26');

-- 새로 추가한 2명의 구매내역을 추가해주세요. 
-- 2명 구매내역 합산 3개를 추가해주세요.
INSERT INTO buytbl VALUES (null, 'KDH','방송용캠','전자기기', 60000, 1);
INSERT INTO buytbl (user_id, prod_name, group_name, price, amout) VALUES ('LSH', '게임용마우스', '전자기기', 200000,1);
INSERT INTO buytbl VALUES (null, 'LSH','롤 스킨', '기타', 10000,1);



SELECT * FROM buyTbl;

-- 여태까지의 SELECT 구문은 조건 없이 모든 데이터를 다 조회했습니다.
-- 극단적인 경우 employees 테이블의 모든 row를 조회하다보니
-- 조회시간이 굉장히 오래 잡히는 케이스가 발생했습니다.
-- 따라서 조건에 맞도록 필터링을 할 수 있고, 이를 위해 사용하는 구문은 WHERE 구문입니다.
-- SELECT 컬럼명1, 컬럼명2, ... FROM 테이블명 WHERE 컬럼명 = 조건식;

-- 아래는 이름이 손흥민인 사람만 조회하는 구문입니다.
 SELECT * FROM userTbl WHERE user_name = '손흥민'

 
 -- 서울에 사는 사람만 조히해보세요.