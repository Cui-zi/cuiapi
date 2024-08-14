use cuiapi;

-- 接口信息
create table if not exists cuiapi.`interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `name` varchar(256) not null comment '名称',
    `description` varchar(256) null comment '描述',
    `url` varchar(512) not null comment '接口地址',
    `requestParams` text not null comment '请求参数',
    `requestHeader` text null comment '请求头',
    `responseHeader` text null comment '响应头',
    `status` int default 0 not null comment '接口状态（0 - 关闭 1 - 开启）',
    `method` varchar(256) not null comment '请求类型',
    `userId` bigint not null comment '创建人',
    `createTime` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `updateTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `isDelete` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
    ) comment '接口信息';

-- 设置表的字符集为 utf8mb4
ALTER TABLE cuiapi.interface_info CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;


insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('尹驰', '夏文博', 'www.zandra-rutherford.io', '钟君浩', '段博超', 0, '史伟宸', 0);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('冯明哲', '邓梓晨', 'www.spring-gleason.net', '丁果', '严煜城', 0, '宋峻熙', 168922);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('朱天磊', '吴瑞霖', 'www.minta-gislason.com', '廖泽洋', '王荣轩', 0, '曾哲瀚', 160640623);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('廖鑫磊', '段鹏涛', 'www.kellee-christiansen.net', '赵思源', '曾炎彬', 0, '丁建辉', 831);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('冯鑫鹏', '汪驰', 'www.maddie-johns.net', '廖炎彬', '崔文博', 0, '苏彬', 583);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('王远航', '魏鹭洋', 'www.rodrick-conroy.io', '徐昊强', '史熠彤', 0, '唐绍辉', 1281);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('曹子默', '范雨泽', 'www.erick-pfeffer.biz', '郑明辉', '石越彬', 0, '吴智辉', 4236);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('范鸿涛', '尹建辉', 'www.dorian-welch.name', '董立辉', '卢天磊', 0, '程胤祥', 1);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('林哲瀚', '廖鹭洋', 'www.isreal-rau.name', '杨旭尧', '万皓轩', 0, '龙修洁', 5327938);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('孟靖琪', '萧浩', 'www.everette-bogisich.com', '赵伟祺', '田明哲', 0, '蔡嘉熙', 59783533);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('邱乐驹', '徐思远', 'www.brett-dibbert.org', '钟靖琪', '丁鑫鹏', 0, '傅嘉熙', 47328978);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('廖立辉', '黄胤祥', 'www.hassan-lockman.io', '江嘉熙', '汪浩', 0, '贾鹏煊', 9531381);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('于文', '徐思聪', 'www.ward-pollich.name', '熊伟泽', '顾思源', 0, '唐聪健', 2);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('段鹏煊', '董靖琪', 'www.murray-murphy.biz', '朱峻熙', '潘晟睿', 0, '沈博超', 5167782);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('黄钰轩', '叶哲瀚', 'www.erick-osinski.net', '罗文博', '江明辉', 0, '丁果', 685683);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('袁立果', '罗昊强', 'www.lena-bailey.com', '曹潇然', '陶明杰', 0, '萧弘文', 743);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('史文轩', '邓笑愚', 'www.catrina-kshlerin.org', '林浩然', '杜博文', 0, '金荣轩', 16297038);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('姚明', '陆博涛', 'www.alta-casper.co', '王潇然', '马绍齐', 0, '谢天磊', 2050079093);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('方雨泽', '汪苑博', 'www.carin-mueller.info', '万浩然', '秦钰轩', 0, '林伟诚', 6);
insert into cuiapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('田晓博', '白智辉', 'www.alanna-okon.com', '方越彬', '任熠彤', 0, '吕炎彬', 29);


-- 用户调用接口关系表
create table if not exists cuiapi.`user_interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `userId` bigint not null comment '调用用户 id',
    `interfaceInfoId` bigint not null comment '接口 id',
    `totalNum` int default 0 not null comment '总调用次数',
    `leftNum` int default 0 not null comment '剩余调用次数',
    `status` int default 0 not null comment '0-正常，1-禁用',
    `createTime` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `updateTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `isDelete` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '用户调用接口关系';

