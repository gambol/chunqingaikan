package com.twocloo.com.cn.http; class ThreadPoolManager { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/http/ThreadPoolManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ThreadPoolManager.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final manager:Lcom/twocloo/com/cn/http/ThreadPoolManager;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private service:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     new-instance v0, Lcom/twocloo/com/cn/http/ThreadPoolManager;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/http/ThreadPoolManager;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/http/ThreadPoolManager;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/ThreadPoolManager;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/http/ThreadPoolManager;->manager:Lcom/twocloo/com/cn/http/ThreadPoolManager;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 10
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/ThreadPoolManager;);
a=0;//     invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runtime;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 11
a=0;//     .local v0, "num":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/http/ThreadPoolManager;->service:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     .line 12
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance()Lcom/twocloo/com/cn/http/ThreadPoolManager;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     sget-object v0, Lcom/twocloo/com/cn/http/ThreadPoolManager;->manager:Lcom/twocloo/com/cn/http/ThreadPoolManager;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/ThreadPoolManager;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addTask(Ljava/lang/Runnable;)V
a=0;//     .locals 1
a=0;//     .param p1, "runnable"    # Ljava/lang/Runnable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/ThreadPoolManager;->service:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 22
a=0;//     return-void
a=0;// .end method
}}
