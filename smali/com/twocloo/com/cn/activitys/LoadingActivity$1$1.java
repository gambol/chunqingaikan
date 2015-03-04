package com.twocloo.com.cn.activitys; class LoadingActivity$1$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/LoadingActivity$1$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LoadingActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/LoadingActivity$1;->handleMessage(Landroid/os/Message;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/twocloo/com/cn/activitys/LoadingActivity$1;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/LoadingActivity$1;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/LoadingActivity$1$1;->this$1:Lcom/twocloo/com/cn/activitys/LoadingActivity$1;
a=0;// 
a=0;//     .line 73
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/LoadingActivity$1$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "http://app.2cloo.com/ver-start_page_status"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/LoadingActivity$1$1;->this$1:Lcom/twocloo/com/cn/activitys/LoadingActivity$1;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/LoadingActivity$1;->access$0(Lcom/twocloo/com/cn/activitys/LoadingActivity$1;)Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "gb2312"
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/twocloo/com/cn/http/HttpImpl;->ParseJson(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 78
a=0;//     .local v3, "json":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     :try_start_0
a=0;//     const-string v4, "code"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 81
a=0;//     .local v0, "code":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/LoadingActivity$1$1;->this$1:Lcom/twocloo/com/cn/activitys/LoadingActivity$1;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/LoadingActivity$1;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/LoadingActivity$1;->access$0(Lcom/twocloo/com/cn/activitys/LoadingActivity$1;)Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-class v5, Lcom/twocloo/com/cn/activitys/SelectSexActicity;
a=0;// 
a=0;//     invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 84
a=0;//     .local v2, "intent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/LoadingActivity$1$1;->this$1:Lcom/twocloo/com/cn/activitys/LoadingActivity$1;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/LoadingActivity$1;->access$0(Lcom/twocloo/com/cn/activitys/LoadingActivity$1;)Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Lcom/twocloo/com/cn/activitys/LoadingActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 97
a=0;//     .end local v0    # "code":Ljava/lang/String;
a=0;//     .end local v2    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 86
a=0;//     .restart local v0    # "code":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);v2=(Uninit);v4=(Boolean);v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/LoadingActivity$1$1;->this$1:Lcom/twocloo/com/cn/activitys/LoadingActivity$1;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/LoadingActivity$1;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/LoadingActivity$1;->access$0(Lcom/twocloo/com/cn/activitys/LoadingActivity$1;)Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-class v5, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 87
a=0;//     .restart local v2    # "intent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v4, "id"
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->main_bookshelf:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/LoadingActivity$1$1;->this$1:Lcom/twocloo/com/cn/activitys/LoadingActivity$1;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/LoadingActivity$1;->access$0(Lcom/twocloo/com/cn/activitys/LoadingActivity$1;)Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Lcom/twocloo/com/cn/activitys/LoadingActivity;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     .end local v0    # "code":Ljava/lang/String;
a=0;//     .end local v2    # "intent":Landroid/content/Intent;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 93
a=0;//     .local v1, "e":Lorg/json/JSONException;
a=0;//     #v1=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
