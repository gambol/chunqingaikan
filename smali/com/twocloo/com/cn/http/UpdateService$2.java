package com.twocloo.com.cn.http; class UpdateService$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/http/UpdateService$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "UpdateService.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/http/UpdateService;->onCreate()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/http/UpdateService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/UpdateService$2;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     .line 76
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/UpdateService$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/UpdateService$2;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/UpdateService;);
a=0;//     invoke-direct {v1, v3}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 81
a=0;//     .local v1, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v3, Ljava/util/Vector;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v3}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Vector;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/UpdateService$2;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/http/UpdateService;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/twocloo/com/cn/db/DBAdapter;->queryMyBFData(Ljava/util/Vector;Ljava/lang/String;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 83
a=0;//     .local v0, "bflist":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/UpdateService$2;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/db/DBAdapter;->queryAllVipData(Ljava/lang/String;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 86
a=0;//     .local v2, "viplist":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     #v2=(Reference,Ljava/util/Vector;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/Vector;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 87
a=0;//     :cond_1
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/UpdateService$2;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/UpdateService;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/UpdateService;->access$0(Lcom/twocloo/com/cn/http/UpdateService;)V
a=0;// 
a=0;//     .line 89
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
