package com.twocloo.com.cn.task; class DelArrangeBookTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/DelArrangeBookTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "DelArrangeBookTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/sync/EasyTask",
a=0;//         "<",
a=0;//         "Landroid/app/Activity;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Boolean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private bfBookList:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private callBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Ljava/lang/Boolean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Ljava/lang/Boolean;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     .local p2, "bfBookList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p3, "callBack":Lcom/twocloo/com/cn/singlebook/DataCallBack;, "Lcom/twocloo/com/cn/singlebook/DataCallBack<Ljava/lang/Boolean;>;"
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/DelArrangeBookTask;);
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->bfBookList:Ljava/util/List;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->callBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;//     .locals 12
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 57
a=0;//     #v11=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     .local v4, "mbuffer":Ljava/lang/StringBuffer;
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->bfBookList:Ljava/util/List;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v7}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-le v7, v8, :cond_2
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v5, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 61
a=0;//     .end local v4    # "mbuffer":Ljava/lang/StringBuffer;
a=0;//     .local v5, "mbuffer":Ljava/lang/StringBuffer;
a=0;//     :try_start_1
a=0;//     #v5=(Reference,Ljava/lang/StringBuffer;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->bfBookList:Ljava/util/List;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v8=(Reference,Ljava/util/Iterator;);v9=(Conflicted);
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const-string v8, ","
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Ljava/lang/StringBuffer;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "deleteIds":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 72
a=0;//     .end local v5    # "mbuffer":Ljava/lang/StringBuffer;
a=0;//     .restart local v4    # "mbuffer":Ljava/lang/StringBuffer;
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v4=(Reference,Ljava/lang/StringBuffer;);v5=(Conflicted);v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     .line 73
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget-object v8, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v7, v8}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v7, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setUnSychronizedBooks(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 93
a=0;//     .end local v1    # "deleteIds":Ljava/lang/String;
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Reference,Ljava/lang/Boolean;);v8=(Conflicted);v10=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 61
a=0;//     .end local v4    # "mbuffer":Ljava/lang/StringBuffer;
a=0;//     .restart local v5    # "mbuffer":Ljava/lang/StringBuffer;
a=0;//     :cond_0
a=0;//     :try_start_3
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Reference,Ljava/lang/StringBuffer;);v6=(Uninit);v7=(Boolean);v8=(Reference,Ljava/util/Iterator;);v10=(Uninit);
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 62
a=0;//     .local v0, "articleid":Ljava/lang/String;
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Landroid/content/Context;
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-static {v7, v0, v9}, Lcom/twocloo/com/cn/common/FileUtils;->delLocal(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 64
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 65
a=0;//     const-string v7, ","
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 90
a=0;//     .end local v0    # "articleid":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 91
a=0;//     .end local v5    # "mbuffer":Ljava/lang/StringBuffer;
a=0;//     .local v2, "e":Ljava/lang/Throwable;
a=0;//     .restart local v4    # "mbuffer":Ljava/lang/StringBuffer;
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/StringBuffer;);v5=(Conflicted);v6=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 93
a=0;//     .end local v2    # "e":Ljava/lang/Throwable;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 69
a=0;//     :cond_2
a=0;//     :try_start_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Uninit);v6=(Uninit);v7=(Integer);v8=(One);v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->bfBookList:Ljava/util/List;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 70
a=0;//     .restart local v1    # "deleteIds":Ljava/lang/String;
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v7, Landroid/content/Context;
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     invoke-static {v7, v1, v8}, Lcom/twocloo/com/cn/common/FileUtils;->delLocal(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 90
a=0;//     .end local v1    # "deleteIds":Ljava/lang/String;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/StringBuffer;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 80
a=0;//     .restart local v1    # "deleteIds":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);v6=(Uninit);v7=(Boolean);v8=(Reference,Lcom/twocloo/base/common/NetType;);v10=(Uninit);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, ""
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v8, v9, v10, v1}, Lcom/twocloo/com/cn/http/HttpImpl;->synMyfavor(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 81
a=0;//     .local v3, "jo":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-class v8, Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;// 
a=0;//     invoke-static {v7, v8}, Lcom/twocloo/base/util/JsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;// 
a=0;//     .line 82
a=0;//     .local v6, "smfResultBean":Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     const-string v7, "1"
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;->getDel()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Landroid/content/Context;
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setUnSychronizedBooks(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 84
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 88
a=0;//     .end local v3    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v6    # "smfResultBean":Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;//     :cond_4
a=0;//     #v3=(Uninit);v6=(Uninit);v8=(Integer);v9=(Conflicted);v10=(Uninit);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/Boolean;)V
a=0;//     .locals 1
a=0;//     .param p1, "result"    # Ljava/lang/Boolean;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isSychronized:Z
a=0;// 
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->callBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/singlebook/DataCallBack;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 52
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 51
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->callBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/twocloo/com/cn/singlebook/DataCallBack;->callBack(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->onPostExecute(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     sget-boolean v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isSychronized:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "\u5220\u9664\u4e2d,\u8bf7\u7a0d\u540e..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
