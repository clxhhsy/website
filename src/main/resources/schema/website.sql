CREATE TABLE IF NOT EXISTS sys_user (
  user_id int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  user_name varchar(20) NOT NULL COMMENT '用户名',
  user_password varchar(50) NOT NULL COMMENT '密码',
  PRIMARY KEY (user_id)
)
ENGINE = INNODB
AUTO_INCREMENT = 1
AVG_ROW_LENGTH = 16384
CHARACTER SET utf8
COLLATE utf8_general_ci
COMMENT = '系统用户表';
