# 项目名称

云桥API开放平台

## 目录

- [项目简介](#项目简介)
- [安装](#安装)
- [前端初始化](#前端初始化)
- [后端初始化](#后端初始化)

## 项目简介

一个简易的API开放平台，可以提供API开放接口供开发者调用。管理员可以接入并发布接口，用户可以注册登录并浏览接口、在线调试，还能使用客户端SDK轻松在代码中调用接口。

## 安装

开发者可以通过以下步骤快速使用启动本项目

```bash
# 克隆仓库
git clone https://github.com/Cui-zi/cuiapi.git
```

## 前端初始化

```bash
#打开控制台，进入前端项目目录
cd cuiapi-backend

#安装依赖
npm install

#安装完毕后
npm run start
```

## 后端初始化

后端项目需要先自行下载redis与nacos，数据库使用MySQL。安装成功后将两者在本地启动，并打开项目连接数据库。

随后将后端项目中的cuiapi-backend、cuiapi-gateway和cuiapi-interface都启动。前端即可开始使用。

