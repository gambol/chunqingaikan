package com.twocloo.com.cn.activitys; class Readbook$9 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/Readbook$9;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "Readbook.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/Readbook;->doOrder()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook$9;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     .line 1255
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$9;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v8, 0x16
a=0;// 
a=0;//     .line 1257
a=0;//     #v8=(PosByte);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$9;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->access$7(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook$9;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/RDBook;->getOrderMsg()Lcom/twocloo/com/cn/beans/OrderMsg;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/OrderMsg;->getCurtime()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-static {v5, v6, v7}, Lcom/twocloo/com/cn/http/HttpImpl;->subText(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1258
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1259
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$9;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 1307
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1264
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-class v6, Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v5, v6}, Lcom/twocloo/base/util/JsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     .line 1266
a=0;//     .local v4, "subResultBean":Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 1269
a=0;//     const-string v5, "1"
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/SubResultBean;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 1271
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 1272
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$9;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->access$7(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v5, v6, v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->renameTempVip(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1276
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v7=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$9;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->access$28(Lcom/twocloo/com/cn/activitys/Readbook;)Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-class v6, Lcom/twocloo/com/cn/beans/orm/OrderRecord;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/db/orm/OrmDBHelper;->getDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1278
a=0;//     .local v3, "orderRecordDAO":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<Lcom/twocloo/com/cn/beans/orm/OrderRecord;Ljava/lang/Integer;>;"
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/beans/orm/OrderRecord;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/beans/orm/OrderRecord;);
a=0;//     invoke-direct {v2}, Lcom/twocloo/com/cn/beans/orm/OrderRecord;-><init>()V
a=0;// 
a=0;//     .line 1279
a=0;//     .local v2, "or":Lcom/twocloo/com/cn/beans/orm/OrderRecord;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/orm/OrderRecord;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$9;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lcom/twocloo/com/cn/beans/orm/OrderRecord;->setBookId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1280
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lcom/twocloo/com/cn/beans/orm/OrderRecord;->setUserId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1281
a=0;//     new-instance v5, Ljava/util/Date;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-direct {v5, v6, v7}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v2, v5}, Lcom/twocloo/com/cn/beans/orm/OrderRecord;->setAddTime(Ljava/util/Date;)V
a=0;// 
a=0;//     .line 1283
a=0;//     invoke-interface {v3, v2}, Lcom/j256/ormlite/dao/Dao;->createIfNotExists(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 1289
a=0;//     .end local v2    # "or":Lcom/twocloo/com/cn/beans/orm/OrderRecord;
a=0;//     .end local v3    # "orderRecordDAO":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<Lcom/twocloo/com/cn/beans/orm/OrderRecord;Ljava/lang/Integer;>;"
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$9;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v6, 0x17
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v5, v6}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1301
a=0;//     .end local v4    # "subResultBean":Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1302
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 1306
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$9;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1285
a=0;//     .restart local v4    # "subResultBean":Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v4=(Reference,Lcom/twocloo/com/cn/beans/SubResultBean;);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1286
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     invoke-virtual {v0}, Ljava/sql/SQLException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1292
a=0;//     .end local v0    # "e":Ljava/sql/SQLException;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Boolean);v6=(Reference,Ljava/lang/String;);v7=(LongHi);
a=0;//     const-string v5, "2"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/SubResultBean;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     const-string v5, "remain is not enough for pay"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/SubResultBean;->getInfo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 1293
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$9;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v6, 0x2a
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v5, v6}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1296
a=0;//     :cond_5
a=0;//     #v5=(Boolean);v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "2"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/SubResultBean;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     const-string v5, "this textid is paid before!"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/SubResultBean;->getInfo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 1297
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$9;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v6, 0x2b
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v5, v6}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
