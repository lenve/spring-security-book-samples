INSERT INTO `acl_class` (`id`, `class`)
VALUES
	(1,'org.javaboy.acls.model.NoticeMessage');
INSERT INTO `acl_sid` (`id`, `principal`, `sid`)
VALUES
	(2,1,'hr'),
	(1,1,'manager'),
	(3,0,'ROLE_EDITOR');
INSERT INTO `system_message` (`id`, `content`)
VALUES
	(1,'111'),
	(2,'222'),
	(3,'333');