package com.lidroid.xutils.util.core; class CompatibleAsyncTask$2 { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$2;
a=0;// .super Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$WorkerRunnable;
a=0;// .source "CompatibleAsyncTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;-><init>()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$WorkerRunnable",
a=0;//         "<TParams;TResult;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$2;->this$0:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;//     .line 275
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$WorkerRunnable;-><init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$WorkerRunnable;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public call()Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$2;->this$0:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->access$1(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;)Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 279
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V
a=0;// 
a=0;//     .line 281
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$2;->this$0:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$2;->this$0:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$2;->mParams:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, v2}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->access$2(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
