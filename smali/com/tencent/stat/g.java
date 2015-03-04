package com.tencent.stat; class g { void a() { int a;
a=0;// .class final Lcom/tencent/stat/g;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/stat/a/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/a/d;);
a=0;//     iget-object v2, p0, Lcom/tencent/stat/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v3, p0, Lcom/tencent/stat/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v4}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-direct {v1, v2, v3, v4, p2}, Lcom/tencent/stat/a/d;-><init>(Landroid/content/Context;IILjava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/a/d;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/stat/n;->a(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "MTA has caught the following uncaught exception:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->debug(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->c()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "Call the original uncaught exception handler."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->debug(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->c()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "Original uncaught exception handler not set."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->debug(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
