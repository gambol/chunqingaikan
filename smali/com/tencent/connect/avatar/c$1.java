package com.tencent.connect.avatar; class c$1 { void a() { int a;
a=0;// .class Lcom/tencent/connect/avatar/c$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/connect/avatar/c;->b()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/connect/avatar/c;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 272
a=0;//     iput-object p1, p0, Lcom/tencent/connect/avatar/c$1;->a:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/avatar/c$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     const-wide/16 v0, 0x12c
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 279
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c$1;->a:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/c;);
a=0;//     new-instance v1, Lcom/tencent/connect/avatar/c$1$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/connect/avatar/c$1$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/tencent/connect/avatar/c$1$1;-><init>(Lcom/tencent/connect/avatar/c$1;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/avatar/c$1$1;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/connect/avatar/c;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c$1;->a:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/connect/avatar/c;->a(Lcom/tencent/connect/avatar/c;Z)Z
a=0;// 
a=0;//     .line 288
a=0;//     return-void
a=0;// 
a=0;//     .line 276
a=0;//     :catch_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 277
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
