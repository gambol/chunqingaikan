package com.twocloo.com.cn.task; class BookCityShowOrGoneTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/BookCityShowOrGoneTask;
a=0;// .super Landroid/os/AsyncTask;
a=0;// .source "BookCityShowOrGoneTask.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final context:Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;// .field private final handler:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/twocloo/com/cn/activitys/LoadingActivity;Landroid/os/Handler;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;//     .param p2, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/BookCityShowOrGoneTask;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/BookCityShowOrGoneTask;->context:Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;//     .line 25
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/BookCityShowOrGoneTask;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 26
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 13
a=0;//     .param p1, "arg0"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 30
a=0;//     #v8=(Null);
a=0;//     new-instance v5, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/task/BookCityShowOrGoneTask;->context:Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/activitys/LoadingActivity;);
a=0;//     invoke-direct {v5, v9}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 31
a=0;//     .local v5, "phone":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/task/BookCityShowOrGoneTask;->context:Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/activitys/LoadingActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     sget v10, Lcom/twocloo/com/cn/R$string;->insertbookid:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 33
a=0;//     .local v0, "articid":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 34
a=0;//     .local v7, "versionCode":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/task/BookCityShowOrGoneTask;->context:Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/utils/CommonUtils;->getChannel(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 35
a=0;//     .local v1, "channel":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "http://app.2cloo.com/book-show_bookcity?articleid=%s&ct=android&v=%s&data=json&pt=single&srcid=%s"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     new-array v11, v11, [Ljava/lang/Object;
a=0;// 
a=0;//     #v11=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     aput-object v0, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     aput-object v7, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     aput-object v1, v11, v12
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 36
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/BookCityShowOrGoneTask;->context:Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 35
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 37
a=0;//     .local v3, "format":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v8}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 38
a=0;//     .local v6, "str":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v8=(Reference,Ljava/lang/String;);v9=(Conflicted);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 41
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v2=(Uninit);v4=(Uninit);v8=(Null);v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v4, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v4, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 42
a=0;//     .local v4, "jo":Lorg/json/JSONObject;
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v9, "1"
a=0;// 
a=0;//     const-string v10, "code"
a=0;// 
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     const-string v9, "visible"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 45
a=0;//     .end local v4    # "jo":Lorg/json/JSONObject;
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);v8=(Null);v9=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 46
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "result"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BookCityShowOrGoneTask;->context:Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/LoadingActivity;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setShowBookCity(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BookCityShowOrGoneTask;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 57
a=0;//     return-void
a=0;// .end method
}}
