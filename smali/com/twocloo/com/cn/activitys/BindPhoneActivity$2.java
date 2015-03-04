package com.twocloo.com.cn.activitys; class BindPhoneActivity$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BindPhoneActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/BindPhoneActivity;->onClick(Landroid/view/View;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/BindPhoneActivity;
a=0;// 
a=0;// .field private final synthetic val$intent:Landroid/content/Intent;
a=0;// 
a=0;// .field private final synthetic val$text:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/BindPhoneActivity;Ljava/lang/String;Lcom/twocloo/com/cn/beans/User;Landroid/content/Intent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/BindPhoneActivity;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->val$text:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->val$user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->val$intent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 85
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "http://app.2cloo.com/user-bind_mobile?mobile="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->val$text:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "&uid="
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->val$user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "&token="
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->val$user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/BindPhoneActivity;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 88
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 89
a=0;//     const-string v6, "gb2312"
a=0;// 
a=0;//     .line 88
a=0;//     invoke-static {v5, v6}, Lcom/twocloo/com/cn/http/HttpImpl;->ParseJson(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 90
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 93
a=0;//     :try_start_0
a=0;//     const-string v5, "code"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     .local v0, "code":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "msg"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 95
a=0;//     .local v3, "message":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "1"
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->val$intent:Landroid/content/Intent;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Intent;);
a=0;//     const-string v6, "phone"
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->val$text:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/BindPhoneActivity;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->val$intent:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/activitys/BindPhoneActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/BindPhoneActivity;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/BindPhoneActivity;->finish()V
a=0;// 
a=0;//     .line 100
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 101
a=0;//     .local v4, "msg":Landroid/os/Message;
a=0;//     #v4=(Reference,Landroid/os/Message;);
a=0;//     iput-object v3, v4, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/BindPhoneActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/BindPhoneActivity;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/BindPhoneActivity;->access$0(Lcom/twocloo/com/cn/activitys/BindPhoneActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 112
a=0;//     .end local v0    # "code":Ljava/lang/String;
a=0;//     .end local v3    # "message":Ljava/lang/String;
a=0;//     .end local v4    # "msg":Landroid/os/Message;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 103
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 104
a=0;//     .local v1, "e":Lorg/json/JSONException;
a=0;//     #v1=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 107
a=0;//     .end local v1    # "e":Lorg/json/JSONException;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference,Ljava/lang/String;);v7=(Uninit);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 108
a=0;//     .restart local v4    # "msg":Landroid/os/Message;
a=0;//     #v4=(Reference,Landroid/os/Message;);
a=0;//     const-string v5, "\u7f51\u7edc\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u540e\u91cd\u8bd5\uff01"
a=0;// 
a=0;//     iput-object v5, v4, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/BindPhoneActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/BindPhoneActivity;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/BindPhoneActivity;->access$0(Lcom/twocloo/com/cn/activitys/BindPhoneActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
