package com.twocloo.com.cn.activitys; class RechargeActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/RechargeActivity$1;
a=0;// .super Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// .source "RechargeActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/RechargeActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//         "<",
a=0;//         "Lcom/twocloo/com/cn/beans/SubResultBean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/RechargeActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/RechargeActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/RechargeActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RechargeActivity;
a=0;// 
a=0;//     .line 116
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/singlebook/DataCallBack;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/RechargeActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/RechargeActivity$1;)Lcom/twocloo/com/cn/activitys/RechargeActivity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RechargeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/RechargeActivity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callBack(Lcom/twocloo/com/cn/beans/SubResultBean;)V
a=0;//     .locals 3
a=0;//     .param p1, "t"    # Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SubResultBean;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SubResultBean;->getInfo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 123
a=0;//     .local v0, "info":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/activitys/RechargeActivity$1$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/activitys/RechargeActivity$1$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/activitys/RechargeActivity$1$1;-><init>(Lcom/twocloo/com/cn/activitys/RechargeActivity$1;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/RechargeActivity$1$1;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 168
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 172
a=0;//     .end local v0    # "info":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic callBack(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/activitys/RechargeActivity$1;->callBack(Lcom/twocloo/com/cn/beans/SubResultBean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
