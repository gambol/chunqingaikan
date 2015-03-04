package com.twocloo.com.cn.activitys; class OfferWallActivity$4 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/OfferWallActivity$4;
a=0;// .super Ljava/lang/Object;
a=0;// .source "OfferWallActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/dm/android/listener/CheckPointListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/OfferWallActivity;->onResume()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/OfferWallActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/OfferWallActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/OfferWallActivity;
a=0;// 
a=0;//     .line 275
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity$4;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onError(Lcn/dm/android/model/ErrorInfo;)V
a=0;//     .locals 0
a=0;//     .param p1, "arg0"    # Lcn/dm/android/model/ErrorInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResponse(Lcn/dm/android/model/Point;)V
a=0;//     .locals 4
a=0;//     .param p1, "data"    # Lcn/dm/android/model/Point;
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     iget v2, p1, Lcn/dm/android/model/Point;->point:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p1, Lcn/dm/android/model/Point;->consumed:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v0, v2, v3
a=0;// 
a=0;//     .line 286
a=0;//     .local v0, "dmPoint":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/OfferWallActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/LocalStore;->getDuomengSdkPoints(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 287
a=0;//     .local v1, "prePoints":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/OfferWallActivity;
a=0;// 
a=0;//     const/16 v3, 0x40
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v2, v0, v1, v3}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->access$0(Lcom/twocloo/com/cn/activitys/OfferWallActivity;III)V
a=0;// 
a=0;//     .line 288
a=0;//     return-void
a=0;// .end method
}}
