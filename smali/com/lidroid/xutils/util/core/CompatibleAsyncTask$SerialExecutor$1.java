package com.lidroid.xutils.util.core; class CompatibleAsyncTask$SerialExecutor$1 { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CompatibleAsyncTask.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;->execute(Ljava/lang/Runnable;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;
a=0;// 
a=0;// .field private final synthetic val$r:Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;Ljava/lang/Runnable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor$1;->this$1:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor$1;->val$r:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 217
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor$1;->val$r:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-interface {v0}, Ljava/lang/Runnable;->run()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor$1;->this$1:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;->scheduleNext()V
a=0;// 
a=0;//     .line 224
a=0;//     return-void
a=0;// 
a=0;//     .line 221
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 222
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor$1;->this$1:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;);
a=0;//     invoke-virtual {v1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;->scheduleNext()V
a=0;// 
a=0;//     .line 223
a=0;//     throw v0
a=0;// .end method
}}
