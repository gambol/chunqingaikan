package com.twocloo.com.cn.activitys; class OfferWallActivity$1$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/OfferWallActivity$1$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "OfferWallActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/dm/android/listener/CheckPointListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;->handleMessage(Landroid/os/Message;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;
a=0;// 
a=0;// .field private final synthetic val$consemepoints:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1$1;->this$1:Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;
a=0;// 
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1$1;->val$consemepoints:I
a=0;// 
a=0;//     .line 81
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity$1$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onError(Lcn/dm/android/model/ErrorInfo;)V
a=0;//     .locals 2
a=0;//     .param p1, "errorInfo"    # Lcn/dm/android/model/ErrorInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1$1;->this$1:Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;->access$0(Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;)Lcom/twocloo/com/cn/activitys/OfferWallActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1$1;->val$consemepoints:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setDuomengPoints(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResponse(Lcn/dm/android/model/Point;)V
a=0;//     .locals 2
a=0;//     .param p1, "data"    # Lcn/dm/android/model/Point;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v0, p1, Lcn/dm/android/model/Point;->status:Lcn/dm/android/model/Point$PointStatus;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/model/Point$PointStatus;);
a=0;//     invoke-virtual {v0}, Lcn/dm/android/model/Point$PointStatus;->getCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 99
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 93
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1$1;->this$1:Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;->access$0(Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;)Lcom/twocloo/com/cn/activitys/OfferWallActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setDuomengPoints(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 96
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     const-string v0, "result"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "\u4f59\u989d\u4e0d\u8db3"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
