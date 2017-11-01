create database mini_program;

DROP TABLE IF EXISTS `sys_param`;

CREATE TABLE `sys_param` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `paramKey` varchar(100) NOT NULL,
  `paramValue` varchar(500) NOT NULL,
  `disabled` tinyint(1) NOT NULL DEFAULT '0',
  `createOperatorId` int(11) NOT NULL,
  `createTime` datetime NOT NULL,
  `updateOperatorId` int(11) NOT NULL,
  `updateTime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

CREATE TABLE `global_file` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `FileGUID` varchar(32) NOT NULL COMMENT '系统生成的文件GUID',
  `ContentType` varchar(100) NOT NULL COMMENT '文件的 MIME Content-Type',
  `FilePath` varchar(200) NOT NULL COMMENT '文件存储路径，包含文件名，相对于系统参数FileBase定义的根路径',
  `OriginalFileName` varchar(100) NOT NULL COMMENT '原始文件名',
  `DisplayName` varchar(100) NOT NULL COMMENT '显示名称',
  `CreateOperatorId` int(11) DEFAULT NULL COMMENT '创建者操作员id, member_operator.id',
  `CreateTime` datetime NOT NULL COMMENT '创建时间',
  `UpdateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `UpdateOperatorId` int(11) NOT NULL COMMENT '更新者的操作员id, member_operator.id',
  PRIMARY KEY (`Id`),
  UNIQUE KEY `idx_fileguid` (`FileGUID`)
) ENGINE=InnoDB AUTO_INCREMENT=5618 DEFAULT CHARSET=utf8 COMMENT='全局文件表';
