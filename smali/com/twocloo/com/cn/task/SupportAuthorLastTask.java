package com.twocloo.com.cn.task; class SupportAuthorLastTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/SupportAuthorLastTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "SupportAuthorLastTask.java"
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
a=0;//         "Lcom/twocloo/com/cn/beans/SupportAuthorBean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private articleid:Ljava/lang/String;
a=0;// 
a=0;// .field private bonus:Ljava/lang/String;
a=0;// 
a=0;// .field private dbHelper:Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;// .field private dialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;//     .param p2, "articleid"    # Ljava/lang/String;
a=0;//     .param p3, "bonus"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask;);
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->articleid:Ljava/lang/String;
a=0;// 
a=0;//     .line 43
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->bonus:Ljava/lang/String;
a=0;// 
a=0;//     .line 45
a=0;//     const-class v0, Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/db/orm/DBHelper;->getHelper(Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dbHelper:Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getRandomSucMsg()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$array;->red_packet_success_msg:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 229
a=0;//     .local v0, "msgs":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/util/Random;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v1}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Random;);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-object v1, v0, v1
a=0;// 
a=0;//     #v1=(Null);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Lcom/twocloo/com/cn/beans/SupportAuthorBean;
a=0;//     .locals 9
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 218
a=0;//     .local v1, "token":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 220
a=0;//     .local v3, "userId":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "http://app.2cloo.com/user-sub_send_bonus?token=%s&userid=%s&articleid=%s&bonus=%s"
a=0;// 
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object v1, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     aput-object v3, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->articleid:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->bonus:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v4, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 221
a=0;//     .local v2, "url":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-class v5, Lcom/twocloo/com/cn/beans/SupportAuthorBean;
a=0;// 
a=0;//     invoke-static {v2, v4, v5}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/SupportAuthorBean;
a=0;// 
a=0;//     .line 222
a=0;//     .local v0, "result":Lcom/twocloo/com/cn/beans/SupportAuthorBean;
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->doInBackground([Ljava/lang/Void;)Lcom/twocloo/com/cn/beans/SupportAuthorBean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/SupportAuthorBean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Lcom/twocloo/com/cn/beans/SupportAuthorBean;)V
a=0;//     .locals 11
a=0;//     .param p1, "result"    # Lcom/twocloo/com/cn/beans/SupportAuthorBean;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 58
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 60
a=0;//     if-eqz p1, :cond_9
a=0;// 
a=0;//     .line 61
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SupportAuthorBean;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 65
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dbHelper:Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/orm/OrmDBHelper;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/db/orm/OrmDBHelper;->getDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 67
a=0;//     .local v10, "supportAuthorDAO":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;Ljava/lang/Integer;>;"
a=0;//     #v10=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     new-instance v9, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;);
a=0;//     invoke-direct {v9}, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;-><init>()V
a=0;// 
a=0;//     .line 68
a=0;//     .local v9, "sar":Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->articleid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;->setBookId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 69
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;->setUserId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 70
a=0;//     new-instance v0, Ljava/util/Date;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v9, v0}, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;->setAddTime(Ljava/util/Date;)V
a=0;// 
a=0;//     .line 72
a=0;//     invoke-interface {v10, v9}, Lcom/j256/ormlite/dao/Dao;->createIfNotExists(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 79
a=0;//     .end local v9    # "sar":Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;
a=0;//     .end local v10    # "supportAuthorDAO":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;Ljava/lang/Integer;>;"
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u6253\u8d4f\u6210\u529f!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$1;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$1;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$1;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 85
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$1;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$2;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$2;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$2;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 79
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$2;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 212
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 74
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 75
a=0;//     .local v8, "e":Ljava/sql/SQLException;
a=0;//     #v8=(Reference,Ljava/sql/SQLException;);
a=0;//     invoke-virtual {v8}, Ljava/sql/SQLException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v8}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 94
a=0;//     .end local v8    # "e":Ljava/sql/SQLException;
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     const-string v0, "2"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SupportAuthorBean;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     const-string v0, "remain is not enough"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SupportAuthorBean;->getMsg()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     const-string v2, "\u8d60\u9001\u5931\u8d25\uff0c\u7528\u6237\u4f59\u989d\u4e0d\u8db3"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u53bb\u5145\u503c"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$3;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$3;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$3;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 103
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$3;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$4;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$4;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$4;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 97
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$4;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 109
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v0, "articleid or bonus error"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SupportAuthorBean;->getMsg()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     const-string v2, "\u8d60\u9001\u5931\u8d25\uff0c\u4f5c\u54c1id\u6216\u6253\u8d4f\u91d1\u989d\u9519\u8bef"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$5;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$5;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$5;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 115
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$5;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$6;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$6;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$6;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 110
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$6;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 121
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v0, "articleid or bonus error"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SupportAuthorBean;->getMsg()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     const-string v2, "\u8d60\u9001\u5931\u8d25\uff0c\u4f5c\u54c1id\u6216\u6253\u8d4f\u91d1\u989d\u9519\u8bef"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$7;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$7;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$7;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 127
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$7;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$8;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$8;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$8;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 122
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$8;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 133
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v0, "not such user info"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SupportAuthorBean;->getMsg()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     const-string v2, "\u8d60\u9001\u5931\u8d25\uff0c\u7528\u6237id\u65e0\u6548"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$9;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$9;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$9;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 139
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$9;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$10;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$10;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$10;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 134
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$10;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 145
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v0, "get user remain failed"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SupportAuthorBean;->getMsg()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     const-string v2, "\u8d60\u9001\u5931\u8d25\uff0c\u83b7\u53d6\u7528\u6237\u4f59\u989d\u5931\u8d25"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$11;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$11;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$11;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 151
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$11;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$12;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$12;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$12;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 146
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$12;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 157
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v0, "send failed"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SupportAuthorBean;->getMsg()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     const-string v2, "\u8d60\u9001\u5931\u8d25"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$13;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$13;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$13;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 163
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$13;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$14;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$14;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$14;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 158
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$14;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 169
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v0, "send success add user bonus failed"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SupportAuthorBean;->getMsg()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     const-string v2, "\u8d60\u9001\u5931\u8d25\uff0c\u8d60\u9001\u6210\u529f \u8bb0\u5f55\u8d60\u9001\u8bb0\u5f55\u5931\u8d25"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$15;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$15;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$15;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 175
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$15;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$16;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$16;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$16;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 170
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$16;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 182
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     const-string v2, "\u8d60\u9001\u5931\u8d25\uff0c\u5176\u5b83\u9519\u8bef"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$17;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$17;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$17;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 187
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$17;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$18;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$18;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$18;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 182
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$18;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 196
a=0;//     :cond_9
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u8d60\u9001\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "\u53d6\u6d88"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$19;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$19;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$19;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 204
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$19;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$20;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$20;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$20;-><init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;// 
a=0;//     .line 196
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$20;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Lcom/twocloo/com/cn/beans/SupportAuthorBean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->onPostExecute(Lcom/twocloo/com/cn/beans/SupportAuthorBean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
}}
