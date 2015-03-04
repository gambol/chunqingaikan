package com.tencent.utils; class AsynLoadImg$1 { void a() { int a;
a=0;// .class Lcom/tencent/utils/AsynLoadImg$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/utils/AsynLoadImg;-><init>(Landroid/app/Activity;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/utils/AsynLoadImg;Landroid/os/Looper;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iput-object p1, p0, Lcom/tencent/utils/AsynLoadImg$1;->a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;//     invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/utils/AsynLoadImg$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     const-string v0, "AsynLoadImg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "handleMessage:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 52
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/tencent/utils/AsynLoadImg$1;->a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/AsynLoadImg;);
a=0;//     invoke-static {v0}, Lcom/tencent/utils/AsynLoadImg;->a(Lcom/tencent/utils/AsynLoadImg;)Lcom/tencent/utils/AsynLoadImgBack;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v2, v0}, Lcom/tencent/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 58
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/tencent/utils/AsynLoadImg$1;->a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/AsynLoadImg;);
a=0;//     invoke-static {v0}, Lcom/tencent/utils/AsynLoadImg;->a(Lcom/tencent/utils/AsynLoadImg;)Lcom/tencent/utils/AsynLoadImgBack;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Lcom/tencent/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
