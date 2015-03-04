package com.twocloo.com.cn.activitys; class Readbook$8$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/Readbook$8$1;
a=0;// .super Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// .source "Readbook.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/Readbook$8;->run()V
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
a=0;// .field final synthetic this$1:Lcom/twocloo/com/cn/activitys/Readbook$8;
a=0;// 
a=0;// .field private final synthetic val$token:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/Readbook$8;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1;->this$1:Lcom/twocloo/com/cn/activitys/Readbook$8;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1;->val$uid:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1;->val$token:Ljava/lang/String;
a=0;// 
a=0;//     .line 1122
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/singlebook/DataCallBack;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$8$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/Readbook$8$1;)Lcom/twocloo/com/cn/activitys/Readbook$8;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1122
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1;->this$1:Lcom/twocloo/com/cn/activitys/Readbook$8;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$8;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callBack(Lcom/twocloo/com/cn/beans/SubResultBean;)V
a=0;//     .locals 4
a=0;//     .param p1, "t"    # Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1127
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SubResultBean;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1129
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1;->val$uid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1;->val$token:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, p0, v2, v3}, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;-><init>(Lcom/twocloo/com/cn/activitys/Readbook$8$1;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 1158
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 1160
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/activitys/Readbook$8$1;->callBack(Lcom/twocloo/com/cn/beans/SubResultBean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
