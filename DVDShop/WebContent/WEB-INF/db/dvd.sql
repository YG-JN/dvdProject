


-- dvd.sql
drop table dvdInfo;

create table dvdInfo(
   num        number primary key, -- dvd번호 'cm_1' 코미디 장르
   title      varchar2(30),   -- 제목
   director   varchar2(30),   -- 감독
   actor      varchar2(100),   -- 배우
   year       date,            --제작년도
   country    varchar2(30),    --제작국가
   grade      varchar2(30),    --등급
   story      varchar2(1000),  --줄거리
   genre      varchar2(30),  --'드라마' '액션'  '코미디'
   poster     varchar2(50)  -- 포스터
);

drop sequence  dvdInfo_seq;

create sequence dvdInfo_seq
        start with 1
        increment by 1
        nocycle
        nocache;

select * from dvdInfo;
