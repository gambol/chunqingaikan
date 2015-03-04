package com.tencent.tauth; class LocationApi$1 { void a() { int a;
a=0;// .class Lcom/tencent/tauth/LocationApi$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/tauth/LocationApi;->init()V
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
a=0;// .method constructor <init>(Lcom/tencent/tauth/LocationApi;Landroid/os/Looper;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iput-object p1, p0, Lcom/tencent/tauth/LocationApi$1;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/tauth/LocationApi$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 95
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// 
a=0;//     .line 80
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "location: verify sosocode success."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$1;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/tauth/LocationApi;->access$100(Lcom/tencent/tauth/LocationApi;)Lcom/tencent/tauth/LbsAgent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/LocationApi$1;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/tauth/LocationApi;->access$000(Lcom/tencent/tauth/LocationApi;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/tauth/LocationApi$1;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/tauth/LocationApi;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/tauth/LbsAgent;->requestLocationUpdate(Landroid/content/Context;Lcom/tencent/tauth/LbsAgent$OnGetLocationListener;)V
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$1;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/tauth/LocationApi;->access$200(Lcom/tencent/tauth/LocationApi;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x65
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-wide/16 v2, 0x2710
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 85
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "location: verify sosocode failed."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$1;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     const/16 v1, -0xe
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const-string v2, "\u5b9a\u4f4d\u5931\u8d25\uff0c\u9a8c\u8bc1\u5b9a\u4f4d\u7801\u9519\u8bef\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/tauth/LocationApi;->access$300(Lcom/tencent/tauth/LocationApi;ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "location: get location timeout."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$1;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     const/16 v1, -0xd
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const-string v2, "\u5b9a\u4f4d\u8d85\u65f6\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u6216\u68c0\u67e5\u7f51\u7edc\u72b6\u51b5\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/tauth/LocationApi;->access$300(Lcom/tencent/tauth/LocationApi;ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 78
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x65
a=0;//         :pswitch_3
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
