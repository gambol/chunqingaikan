package com.tencent.a.b; class f$2 { void a() { int a;
a=0;// .class final Lcom/tencent/a/b/f$2;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/a/b/f;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:Lcom/tencent/a/b/f;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/a/b/f;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/a/b/f$2;->a:Lcom/tencent/a/b/f;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/a/b/f$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "noConnectivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/f$2;->a:Lcom/tencent/a/b/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/f;);
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/f;->d(Lcom/tencent/a/b/f;)Lcom/tencent/a/b/f$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/f$2;->a:Lcom/tencent/a/b/f;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/f;->d(Lcom/tencent/a/b/f;)Lcom/tencent/a/b/f$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x100
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/a/b/f$c;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
