
-- 유저 마스터 테이블
CREATE TABLE `mst_user` (
  `user_list_no`        int(10)     NOT NULL AUTO_INCREMENT COMMENT '유저 리스트 넘버',
  `user_id`             varchar(10) NOT NULL                COMMENT '유저 아이디',
  `user_name`           varchar(10) NOT NULL                COMMENT '유저 이름',
  `user_pw`             varchar(10) NOT NULL                COMMENT '유저 패스워드',
  `user_email`          varchar(50) NOT NULL                COMMENT '유저 이메일',
  `first_time_pw_flg`   int(1)      NOT NULL                COMMENT '초기 패스워드 플래그',
  `create_datetime`     timestamp   NOT NULL                COMMENT '등록시간',
  `create_user`         varchar(10) NOT NULL                COMMENT '등록 유저',
  `update_datetime`     timestamp   NOT NULL                COMMENT '갱신시간',
  `update_user`         varchar(10) NOT NULL                COMMENT '갱신 유저',
  PRIMARY KEY (`user_list_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='유저 마스터'