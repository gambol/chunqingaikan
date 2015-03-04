package com.twocloo.com.cn.activitys; class PrivacyActivity$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/PrivacyActivity$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PrivacyActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/PrivacyActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/PrivacyActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/PrivacyActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/PrivacyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PrivacyActivity;
a=0;// 
a=0;//     .line 53
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/PrivacyActivity$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     const-string v2, "http://app.2cloo.com/user-agree"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v2, v3}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 57
a=0;//     .local v1, "privacy":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 58
a=0;//     .local v0, "msg":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 59
a=0;//     const/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     iput v2, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/PrivacyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PrivacyActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/PrivacyActivity;);
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/activitys/PrivacyActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 61
a=0;//     return-void
a=0;// .end method
}}
