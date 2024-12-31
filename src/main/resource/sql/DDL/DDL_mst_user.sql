-- 데이터 추가
INSERT INTO mst_user
(user_id,user_name,user_pw,user_email,first_time_pw_flg,create_datetime,create_user,update_datetime,update_user)
VALUES
(1,'test01','hoge0001','aaa@test.com','1',CURRENT_TIMESTAMP,'0',CURRENT_TIMESTAMP,'0'),
(2,'test02','hoge0002','bbb@test.com','1',CURRENT_TIMESTAMP,'0',CURRENT_TIMESTAMP,'0'),
(3,'test03','hoge0003','ccc@test.com','1',CURRENT_TIMESTAMP,'0',CURRENT_TIMESTAMP,'0');