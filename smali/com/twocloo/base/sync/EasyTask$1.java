package com.twocloo.base.sync; class EasyTask$1 { void a() { int a;
a=0;// .class Lcom/twocloo/base/sync/EasyTask$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "EasyTask.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/base/sync/EasyTask;->execute([Ljava/lang/Object;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/base/sync/EasyTask;
a=0;// 
a=0;// .field private final synthetic val$params:[Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/sync/EasyTask;[Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/sync/EasyTask$1;->this$0:Lcom/twocloo/base/sync/EasyTask;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/base/sync/EasyTask$1;->val$params:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/sync/EasyTask$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/base/sync/EasyTask$1;)Lcom/twocloo/base/sync/EasyTask;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/twocloo/base/sync/EasyTask$1;->this$0:Lcom/twocloo/base/sync/EasyTask;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/sync/EasyTask;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     sget-object v1, Lcom/twocloo/base/sync/EasyTask;->HANDLER:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v2, Lcom/twocloo/base/sync/EasyTask$1$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/base/sync/EasyTask$1$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/base/sync/EasyTask$1$1;-><init>(Lcom/twocloo/base/sync/EasyTask$1;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/sync/EasyTask$1$1;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v1, p0, Lcom/twocloo/base/sync/EasyTask$1;->this$0:Lcom/twocloo/base/sync/EasyTask;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/base/sync/EasyTask$1;->val$params:[Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/base/sync/EasyTask;->doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 42
a=0;//     .local v0, "result":Ljava/lang/Object;, "TResult;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v1, Lcom/twocloo/base/sync/EasyTask;->HANDLER:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/base/sync/EasyTask$1$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/base/sync/EasyTask$1$2;);
a=0;//     invoke-direct {v2, p0, v0}, Lcom/twocloo/base/sync/EasyTask$1$2;-><init>(Lcom/twocloo/base/sync/EasyTask$1;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/sync/EasyTask$1$2;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
}}
