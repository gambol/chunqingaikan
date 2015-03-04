package com.twocloo.com.cn.activitys; class WeiXinloginActivity$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "WeiXinloginActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->handleMessage(Landroid/os/Message;)Z
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;
a=0;// 
a=0;// .field private final synthetic val$profileUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$url:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;->val$url:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;->val$profileUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 173
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;->val$url:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "gbk"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/http/HttpImpl;->ParseJson(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 181
a=0;//     .local v2, "userdata":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 182
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/User;-><init>()V
a=0;// 
a=0;//     .line 184
a=0;//     .local v1, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     const-string v3, "userid"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/beans/User;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 185
a=0;//     const-string v3, "code"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/beans/User;->setCode(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 186
a=0;//     const-string v3, "token"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/beans/User;->setToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 187
a=0;//     const-string v3, "username"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/beans/User;->setUsername(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 188
a=0;//     new-instance v3, Ljava/lang/Thread;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2$1;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2$1;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;->val$profileUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, p0, v5, v1}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2$1;-><init>(Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;Ljava/lang/String;Lcom/twocloo/com/cn/beans/User;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2$1;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 199
a=0;//     #v3=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 202
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     sget-object v3, Lcom/twocloo/com/cn/beans/User;->LOGIN_SUCCESS:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/Constants$LoginType;->wechat:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     invoke-static {v3, v4, v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->saveLoginStatus(Landroid/content/Context;Ljava/lang/String;Lcom/twocloo/com/cn/common/Constants$LoginType;)V
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/LocalStore;->setLoginType(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 208
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BookApp;->setUser(Lcom/twocloo/com/cn/beans/User;)V
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->access$1(Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 224
a=0;//     .end local v1    # "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 210
a=0;//     .restart local v1    # "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Reference,Lcom/twocloo/com/cn/beans/User;);v4=(Reference,Ujava/lang/Object;);v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "2"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->access$1(Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 218
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 220
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 212
a=0;//     .end local v0    # "e":Lorg/json/JSONException;
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "3"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->access$1(Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 214
a=0;//     :cond_3
a=0;//     #v3=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "4"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->access$1(Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
