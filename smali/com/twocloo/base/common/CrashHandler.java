package com.twocloo.base.common; class CrashHandler { void a() { int a;
a=0;// .class public Lcom/twocloo/base/common/CrashHandler;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CrashHandler.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final INSTANCE:Lcom/twocloo/base/common/CrashHandler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mDefaultHandler:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     new-instance v0, Lcom/twocloo/base/common/CrashHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/common/CrashHandler;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/base/common/CrashHandler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/CrashHandler;);
a=0;//     sput-object v0, Lcom/twocloo/base/common/CrashHandler;->INSTANCE:Lcom/twocloo/base/common/CrashHandler;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/twocloo/base/common/CrashHandler;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance()Lcom/twocloo/base/common/CrashHandler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     sget-object v0, Lcom/twocloo/base/common/CrashHandler;->INSTANCE:Lcom/twocloo/base/common/CrashHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/CrashHandler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private handleException(Ljava/lang/Throwable;)Z
a=0;//     .locals 2
a=0;//     .param p1, "ex"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 75
a=0;//     #v1=(One);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public init(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iput-object p1, p0, Lcom/twocloo/base/common/CrashHandler;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 44
a=0;//     invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread$UncaughtExceptionHandler;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/common/CrashHandler;->mDefaultHandler:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     .line 45
a=0;//     invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;//     .locals 3
a=0;//     .param p1, "thread"    # Ljava/lang/Thread;
a=0;//     .param p2, "ex"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-direct {p0, p2}, Lcom/twocloo/base/common/CrashHandler;->handleException(Ljava/lang/Throwable;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/common/CrashHandler;->mDefaultHandler:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Thread$UncaughtExceptionHandler;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v1, p0, Lcom/twocloo/base/common/CrashHandler;->mDefaultHandler:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     invoke-interface {v1, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 66
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 60
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     const-wide/16 v1, 0xbb8
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
a=0;// 
a=0;//     .line 61
a=0;//     invoke-static {}, Landroid/os/Process;->myPid()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Landroid/os/Process;->killProcess(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 62
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 63
a=0;//     .local v0, "e":Ljava/lang/InterruptedException;
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
