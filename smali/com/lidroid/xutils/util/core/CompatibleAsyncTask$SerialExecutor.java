package com.lidroid.xutils.util.core; class CompatibleAsyncTask$SerialExecutor { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CompatibleAsyncTask.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/concurrent/Executor;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "SerialExecutor"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mActive:Ljava/lang/Runnable;
a=0;// 
a=0;// .field final mTasks:Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque",
a=0;//             "<",
a=0;//             "Ljava/lang/Runnable;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 213
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;);
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;->mTasks:Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     .line 212
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public declared-synchronized execute(Ljava/lang/Runnable;)V
a=0;//     .locals 2
a=0;//     .param p1, "r"    # Ljava/lang/Runnable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;->mTasks:Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     new-instance v1, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor$1;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor$1;-><init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor$1;);
a=0;//     invoke-virtual {v0, v1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->offer(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;->mActive:Ljava/lang/Runnable;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 227
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;->scheduleNext()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 229
a=0;//     :cond_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 217
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method protected declared-synchronized scheduleNext()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;->mTasks:Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     invoke-virtual {v0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->poll()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Runnable;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;->mActive:Ljava/lang/Runnable;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 233
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;->mActive:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 235
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 232
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
