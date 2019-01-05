# sharding-sphere
Sharding-jdbc版本3.0.0.1M+SprinBoot+Mybatis

  最近自己结合官网，写了一个集成sharding-jdbc的Demo。给初学者的我们，提供一些帮助。
  
  
     首先，这个例子，我是采用了分库和分表，一个数据库db_lsj0，另一个数据库db_lsj1;
  db_lsj0数据源中有一张表lsj_zjc_user0; db_lsj1数据源中有一张表lsj_zjc_user1;
  
  sql:
  
CREATE TABLE `lsj_zjc_user0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4

CREATE TABLE `lsj_zjc_user1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4

            后续还会继续学习sharding-sphere，所有还会继续更新。请大家持续关注！
