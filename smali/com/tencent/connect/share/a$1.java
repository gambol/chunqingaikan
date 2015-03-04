package com.tencent.connect.share; class a$1 { void a() { int a;
a=0;// .class final Lcom/tencent/connect/share/a$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/connect/share/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/utils/AsynLoadImgBack;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/utils/AsynLoadImgBack;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/os/Looper;Lcom/tencent/utils/AsynLoadImgBack;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iput-object p2, p0, Lcom/tencent/connect/share/a$1;->a:Lcom/tencent/utils/AsynLoadImgBack;
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/share/a$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 72
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 73
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 64
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v1, p0, Lcom/tencent/connect/share/a$1;->a:Lcom/tencent/utils/AsynLoadImgBack;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/utils/AsynLoadImgBack;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v1, v2, v0}, Lcom/tencent/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v1, p0, Lcom/tencent/connect/share/a$1;->a:Lcom/tencent/utils/AsynLoadImgBack;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/utils/AsynLoadImgBack;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v1, v0, v2}, Lcom/tencent/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 62
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x65
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
