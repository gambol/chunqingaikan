package com.twocloo.com.cn.activitys; class SwitchingAccountsActivity$4$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SwitchingAccountsActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;->onComplete(Ljava/lang/Object;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;
a=0;// 
a=0;// .field private final synthetic val$response:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->this$1:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->val$response:Ljava/lang/Object;
a=0;// 
a=0;//     .line 297
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->val$response:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 302
a=0;//     .local v3, "json":Lorg/json/JSONObject;
a=0;//     const-string v10, "figureurl"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     .line 304
a=0;//     :try_start_0
a=0;//     const-string v10, "figureurl_qq_2"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 306
a=0;//     .local v5, "profileUrl":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 308
a=0;//     .local v4, "nickname":Ljava/lang/String;
a=0;//     :try_start_1
a=0;//     #v4=(Null);
a=0;//     const-string v10, "nickname"
a=0;// 
a=0;//     invoke-virtual {v3, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, "gbk"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10, v11}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 313
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v4=(Reference,Ljava/lang/String;);v11=(Conflicted);
a=0;//     const-string v10, "gender"
a=0;// 
a=0;//     invoke-virtual {v3, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 314
a=0;//     .local v2, "genderString":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 315
a=0;//     .local v1, "gender":I
a=0;//     #v1=(Null);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 316
a=0;//     const-string v10, "\u7537"
a=0;// 
a=0;//     invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     .line 317
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 322
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Boolean);v10=(Conflicted);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->this$1:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;);
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;->access$0(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;)Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->access$5(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 323
a=0;//     .local v6, "token":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "http://app.2cloo.com/login-qq&profileImage="
a=0;// 
a=0;//     invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, "&nickname="
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, "&qqid="
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->this$1:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;->access$0(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;)Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->access$5(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 324
a=0;//     const-string v11, "&gender="
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, "&aboutMe=&birthday=&sign="
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 325
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->this$1:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;->access$0(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;)Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 323
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 326
a=0;//     .local v7, "url":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "gbk"
a=0;// 
a=0;//     invoke-static {v7, v10}, Lcom/twocloo/com/cn/http/HttpImpl;->ParseJson(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 327
a=0;//     .local v9, "userdata":Lorg/json/JSONObject;
a=0;//     #v9=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     .line 328
a=0;//     new-instance v8, Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-direct {v8}, Lcom/twocloo/com/cn/beans/User;-><init>()V
a=0;// 
a=0;//     .line 329
a=0;//     .local v8, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     const-string v10, "userid"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Lcom/twocloo/com/cn/beans/User;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 330
a=0;//     const-string v10, "code"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Lcom/twocloo/com/cn/beans/User;->setCode(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 331
a=0;//     const-string v10, "token"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Lcom/twocloo/com/cn/beans/User;->setToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 332
a=0;//     const-string v10, "username"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Lcom/twocloo/com/cn/beans/User;->setUsername(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 333
a=0;//     new-instance v10, Ljava/lang/Thread;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v11, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1$1;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1$1;);
a=0;//     invoke-direct {v11, p0, v5, v8}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1$1;-><init>(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;Ljava/lang/String;Lcom/twocloo/com/cn/beans/User;)V
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1$1;);
a=0;//     invoke-direct {v10, v11}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 341
a=0;//     #v10=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v10}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 343
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     sget-object v10, Lcom/twocloo/com/cn/beans/User;->LOGIN_SUCCESS:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     .line 345
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->this$1:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;->access$0(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;)Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     sget-object v12, Lcom/twocloo/com/cn/common/Constants$LoginType;->qq:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);
a=0;//     invoke-static {v10, v11, v12}, Lcom/twocloo/com/cn/utils/CommonUtils;->saveLoginStatus(Landroid/content/Context;Ljava/lang/String;Lcom/twocloo/com/cn/common/Constants$LoginType;)V
a=0;// 
a=0;//     .line 347
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->this$1:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;->access$0(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;)Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     invoke-static {v10, v11}, Lcom/twocloo/com/cn/common/LocalStore;->setLoginType(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 348
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/activitys/BookApp;->setUser(Lcom/twocloo/com/cn/beans/User;)V
a=0;// 
a=0;//     .line 349
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->this$1:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;->access$0(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;)Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->access$6(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 362
a=0;//     .end local v1    # "gender":I
a=0;//     .end local v2    # "genderString":Ljava/lang/String;
a=0;//     .end local v4    # "nickname":Ljava/lang/String;
a=0;//     .end local v5    # "profileUrl":Ljava/lang/String;
a=0;//     .end local v6    # "token":Ljava/lang/String;
a=0;//     .end local v7    # "url":Ljava/lang/String;
a=0;//     .end local v8    # "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     .end local v9    # "userdata":Lorg/json/JSONObject;
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 309
a=0;//     .restart local v4    # "nickname":Ljava/lang/String;
a=0;//     .restart local v5    # "profileUrl":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Null);v5=(Reference,Ljava/lang/String;);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Reference,Ljava/lang/String;);v12=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 311
a=0;//     .local v0, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 358
a=0;//     .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     .end local v4    # "nickname":Ljava/lang/String;
a=0;//     .end local v5    # "profileUrl":Ljava/lang/String;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v10
a=0;// 
a=0;//     #v10=(Reference,Lorg/json/JSONException;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 319
a=0;//     .restart local v1    # "gender":I
a=0;//     .restart local v2    # "genderString":Ljava/lang/String;
a=0;//     .restart local v4    # "nickname":Ljava/lang/String;
a=0;//     .restart local v5    # "profileUrl":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v1=(Null);v2=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Boolean);v12=(Uninit);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 350
a=0;//     .restart local v6    # "token":Ljava/lang/String;
a=0;//     .restart local v7    # "url":Ljava/lang/String;
a=0;//     .restart local v8    # "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     .restart local v9    # "userdata":Lorg/json/JSONObject;
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);v8=(Reference,Lcom/twocloo/com/cn/beans/User;);v9=(Reference,Lorg/json/JSONObject;);v10=(Conflicted);v11=(Reference,Ujava/lang/Object;);
a=0;//     const-string v10, "2"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_4
a=0;// 
a=0;//     .line 351
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->this$1:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;->access$0(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;)Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->access$6(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-virtual {v10, v11}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 352
a=0;//     :cond_4
a=0;//     #v10=(Boolean);v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "3"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_5
a=0;// 
a=0;//     .line 353
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->this$1:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;->access$0(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;)Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->access$6(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-virtual {v10, v11}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 354
a=0;//     :cond_5
a=0;//     #v10=(Boolean);v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "4"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     .line 355
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4$1;->this$1:Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;->access$0(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;)Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->access$6(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const/4 v11, 0x4
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-virtual {v10, v11}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;//     :try_end_2
a=0;//     .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
