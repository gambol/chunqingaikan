package com.tencent.tauth; class LocationApi$2 { void a() { int a;
a=0;// .class Lcom/tencent/tauth/LocationApi$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/tauth/LocationApi;->searchNearby(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/tauth/LocationApi;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iput-object p1, p0, Lcom/tencent/tauth/LocationApi$2;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/tauth/LocationApi$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$2;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/LocationApi;);
a=0;//     invoke-static {v0}, Lcom/tencent/tauth/LocationApi;->access$100(Lcom/tencent/tauth/LocationApi;)Lcom/tencent/tauth/LbsAgent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/tauth/LbsAgent;->verifyRegCode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$2;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/LocationApi;);
a=0;//     invoke-static {v0}, Lcom/tencent/tauth/LocationApi;->access$200(Lcom/tencent/tauth/LocationApi;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x67
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 119
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 117
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$2;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/LocationApi;);
a=0;//     invoke-static {v0}, Lcom/tencent/tauth/LocationApi;->access$200(Lcom/tencent/tauth/LocationApi;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x68
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
