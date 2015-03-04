package com.twocloo.base.sync; class EasyTask { void a() { int a;
a=0;// .class public abstract Lcom/twocloo/base/sync/EasyTask;
a=0;// .super Ljava/lang/Object;
a=0;// .source "EasyTask.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/twocloo/base/sync/Task;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<Caller:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Params:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Progress:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Result:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/twocloo/base/sync/Task",
a=0;//         "<TCaller;TParams;TProgress;TResult;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static final HANDLER:Landroid/os/Handler;
a=0;// 
a=0;// .field protected static final WORKERS:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected caller:Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "TCaller;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     sput-object v0, Lcom/twocloo/base/sync/EasyTask;->WORKERS:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     .line 17
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     sput-object v0, Lcom/twocloo/base/sync/EasyTask;->HANDLER:Landroid/os/Handler;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TCaller;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     .local p0, "this":Lcom/twocloo/base/sync/EasyTask;, "Lcom/twocloo/base/sync/EasyTask<TCaller;TParams;TProgress;TResult;>;"
a=0;//     .local p1, "caller":Ljava/lang/Object;, "TCaller;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/twocloo/base/sync/EasyTask;);
a=0;//     iput-object p1, p0, Lcom/twocloo/base/sync/EasyTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs abstract doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TParams;)TResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public varargs execute([Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "params"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TParams;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     .local p0, "this":Lcom/twocloo/base/sync/EasyTask;, "Lcom/twocloo/base/sync/EasyTask<TCaller;TParams;TProgress;TResult;>;"
a=0;//     sget-object v0, Lcom/twocloo/base/sync/EasyTask;->WORKERS:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     new-instance v1, Lcom/twocloo/base/sync/EasyTask$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/base/sync/EasyTask$1;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/twocloo/base/sync/EasyTask$1;-><init>(Lcom/twocloo/base/sync/EasyTask;[Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/sync/EasyTask$1;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract onPostExecute(Ljava/lang/Object;)V
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TResult;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     .local p0, "this":Lcom/twocloo/base/sync/EasyTask;, "Lcom/twocloo/base/sync/EasyTask<TCaller;TParams;TProgress;TResult;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs onProgressUpdate([Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "values"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TProgress;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     .local p0, "this":Lcom/twocloo/base/sync/EasyTask;, "Lcom/twocloo/base/sync/EasyTask<TCaller;TParams;TProgress;TResult;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs publishProgress([Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "values"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TProgress;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     .local p0, "this":Lcom/twocloo/base/sync/EasyTask;, "Lcom/twocloo/base/sync/EasyTask<TCaller;TParams;TProgress;TResult;>;"
a=0;//     sget-object v0, Lcom/twocloo/base/sync/EasyTask;->HANDLER:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/twocloo/base/sync/EasyTask$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/base/sync/EasyTask$2;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/twocloo/base/sync/EasyTask$2;-><init>(Lcom/twocloo/base/sync/EasyTask;[Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/sync/EasyTask$2;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
}}
