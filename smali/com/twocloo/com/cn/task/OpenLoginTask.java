package com.twocloo.com.cn.task; class OpenLoginTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/OpenLoginTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "OpenLoginTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/sync/EasyTask",
a=0;//         "<",
a=0;//         "Lcom/twocloo/base/openapi/QZoneAble;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Lcom/twocloo/com/cn/beans/User;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private accessToken:Ljava/lang/String;
a=0;// 
a=0;// .field private dbHelper:Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;// .field private loginType:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;// .field private loginUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/twocloo/base/openapi/QZoneAble;Ljava/lang/String;Ljava/lang/String;Lcom/twocloo/com/cn/common/Constants$LoginType;)V
a=0;//     .locals 1
a=0;//     .param p1, "caller"    # Lcom/twocloo/base/openapi/QZoneAble;
a=0;//     .param p2, "loginUrl"    # Ljava/lang/String;
a=0;//     .param p3, "accessToken"    # Ljava/lang/String;
a=0;//     .param p4, "loginType"    # Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/OpenLoginTask;);
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->loginUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 44
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->accessToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 45
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->loginType:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     .line 47
a=0;//     const-class v0, Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/db/orm/DBHelper;->getHelper(Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->dbHelper:Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private share(Lcom/twocloo/com/cn/beans/User;)V
a=0;//     .locals 14
a=0;//     .param p1, "user"    # Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 117
a=0;//     :try_start_0
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->dbHelper:Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/db/orm/OrmDBHelper;);
a=0;//     const-class v10, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v9, v10}, Lcom/twocloo/com/cn/db/orm/OrmDBHelper;->getDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 120
a=0;//     .local v5, "payIntevalDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;Ljava/lang/Integer;>;"
a=0;//     #v5=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v5}, Lcom/j256/ormlite/dao/Dao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 121
a=0;//     .local v6, "queryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;Ljava/lang/Integer;>;"
a=0;//     #v6=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "user_id"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10, v11}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/j256/ormlite/stmt/Where;->and()Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 122
a=0;//     const-string v10, "login_type"
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->loginType:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/common/Constants$LoginType;->getValue()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v9, v10, v11}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/j256/ormlite/stmt/Where;->prepare()Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 121
a=0;//     invoke-interface {v5, v9}, Lcom/j256/ormlite/dao/Dao;->query(Lcom/j256/ormlite/stmt/PreparedQuery;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 124
a=0;//     .local v8, "userLoginTraces":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;>;"
a=0;//     #v8=(Reference,Ljava/util/List;);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     invoke-interface {v8}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v9=(Reference,Ljava/util/Iterator;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_3
a=0;// 
a=0;//     .line 139
a=0;//     .end local v5    # "payIntevalDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;Ljava/lang/Integer;>;"
a=0;//     .end local v6    # "queryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;Ljava/lang/Integer;>;"
a=0;//     .end local v8    # "userLoginTraces":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;>;"
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     sget-object v9, Lcom/twocloo/com/cn/common/Constants$LoginType;->qq:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->loginType:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);
a=0;//     invoke-virtual {v9, v10}, Lcom/twocloo/com/cn/common/Constants$LoginType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_2
a=0;// 
a=0;//     .line 143
a=0;//     sget-object v9, Lcom/twocloo/com/cn/common/Constants$LoginType;->sina:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->loginType:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Lcom/twocloo/com/cn/common/Constants$LoginType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_2
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v9, Lcom/twocloo/base/openapi/QZoneAble;
a=0;// 
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v10, Lcom/twocloo/base/openapi/QZoneAble;
a=0;// 
a=0;//     sget v11, Lcom/twocloo/com/cn/R$string;->login_share_content:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Lcom/twocloo/base/openapi/QZoneAble;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, ""
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v10, v11}, Lcom/twocloo/com/cn/utils/CommonUtils;->shareForSinaLogin(Lcom/twocloo/base/openapi/QZoneAble;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 154
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 125
a=0;//     .restart local v5    # "payIntevalDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;Ljava/lang/Integer;>;"
a=0;//     .restart local v6    # "queryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;Ljava/lang/Integer;>;"
a=0;//     .restart local v8    # "userLoginTraces":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;>;"
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v5=(Reference,Lcom/j256/ormlite/dao/Dao;);v6=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);v8=(Reference,Ljava/util/List;);v9=(Reference,Ljava/util/Iterator;);v10=(Boolean);
a=0;//     invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;
a=0;// 
a=0;//     .line 126
a=0;//     .local v7, "userLoginTrace":Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 127
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;->getLastLoginTime()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 128
a=0;//     .local v1, "lastLoginTime":J
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 129
a=0;//     .local v3, "nowTime":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long v10, v3, v1
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     sget-wide v12, Lcom/twocloo/com/cn/common/Constants;->SHARE_AFTER_LOGIN_TIME:J
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     cmp-long v10, v10, v12
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-gez v10, :cond_4
a=0;// 
a=0;//     .line 130
a=0;//     const-string v9, "\u4e0d\u6ee1\u8db3\u6761\u4ef6\uff0c\u4e0d\u53d1\u5206\u4eab"
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 150
a=0;//     .end local v1    # "lastLoginTime":J
a=0;//     .end local v3    # "nowTime":J
a=0;//     .end local v5    # "payIntevalDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;Ljava/lang/Integer;>;"
a=0;//     .end local v6    # "queryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;Ljava/lang/Integer;>;"
a=0;//     .end local v7    # "userLoginTrace":Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;
a=0;//     .end local v8    # "userLoginTraces":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;>;"
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 151
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 133
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     .restart local v1    # "lastLoginTime":J
a=0;//     .restart local v3    # "nowTime":J
a=0;//     .restart local v5    # "payIntevalDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;Ljava/lang/Integer;>;"
a=0;//     .restart local v6    # "queryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;Ljava/lang/Integer;>;"
a=0;//     .restart local v7    # "userLoginTrace":Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;
a=0;//     .restart local v8    # "userLoginTraces":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;>;"
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(LongLo);v2=(LongHi);v3=(LongLo);v4=(LongHi);v5=(Reference,Lcom/j256/ormlite/dao/Dao;);v6=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);v7=(Reference,Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;);v8=(Reference,Ljava/util/List;);v10=(Byte);v11=(LongHi);v12=(LongLo);v13=(LongHi);
a=0;//     const-string v10, "\u6ee1\u8db3\u6761\u4ef6\uff0c\u53d1\u5206\u4eab"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Lcom/twocloo/com/cn/beans/User;
a=0;//     .locals 12
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 71
a=0;//     #v11=(Null);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->accessToken:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const/16 v9, 0xa
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v11, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 72
a=0;//     .local v4, "token":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->loginUrl:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->accessToken:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     aput-object v10, v9, v11
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     aput-object v4, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 75
a=0;//     .local v5, "url":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v5, v8}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 77
a=0;//     .local v2, "jsonStr":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     .local v6, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     :try_start_0
a=0;//     #v6=(Null);
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 80
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToUser(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 83
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     invoke-direct {p0, v6}, Lcom/twocloo/com/cn/task/OpenLoginTask;->share(Lcom/twocloo/com/cn/beans/User;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->dbHelper:Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/db/orm/OrmDBHelper;);
a=0;//     const-class v9, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/db/orm/OrmDBHelper;->getDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 88
a=0;//     .local v3, "payIntevalDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;Ljava/lang/Integer;>;"
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v7, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;);
a=0;//     invoke-direct {v7}, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;-><init>()V
a=0;// 
a=0;//     .line 90
a=0;//     .local v7, "userLoginTrace":Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;->setUserId(I)V
a=0;// 
a=0;//     .line 93
a=0;//     :cond_1
a=0;//     #v8=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->loginType:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/common/Constants$LoginType;->getValue()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;->setLoginType(I)V
a=0;// 
a=0;//     .line 94
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-virtual {v7, v8, v9}, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;->setLastLoginTime(J)V
a=0;// 
a=0;//     .line 96
a=0;//     invoke-interface {v3, v7}, Lcom/j256/ormlite/dao/Dao;->createOrUpdate(Ljava/lang/Object;)Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 107
a=0;//     .end local v1    # "json":Lorg/json/JSONObject;
a=0;//     .end local v3    # "payIntevalDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;Ljava/lang/Integer;>;"
a=0;//     .end local v7    # "userLoginTrace":Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 99
a=0;//     .restart local v1    # "json":Lorg/json/JSONObject;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Reference,Lorg/json/JSONObject;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     invoke-virtual {v0}, Ljava/sql/SQLException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     .end local v0    # "e":Ljava/sql/SQLException;
a=0;//     .end local v1    # "json":Lorg/json/JSONObject;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/OpenLoginTask;->doInBackground([Ljava/lang/Void;)Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Lcom/twocloo/com/cn/beans/User;)V
a=0;//     .locals 2
a=0;//     .param p1, "user"    # Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 61
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->loginType:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);
a=0;//     invoke-static {v0, p1, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->openLoginCallBack(Landroid/app/Activity;Lcom/twocloo/com/cn/beans/User;Lcom/twocloo/com/cn/common/Constants$LoginType;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/OpenLoginTask;->onPostExecute(Lcom/twocloo/com/cn/beans/User;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "\u6b63\u5728\u767b\u9646\u4e2d\uff0c\u8bf7\u7a0d\u540e..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/OpenLoginTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
}}
