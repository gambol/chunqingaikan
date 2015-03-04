package com.twocloo.com.cn.activitys; class OfferWallActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "OfferWallActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/OfferWallActivity;
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/OfferWallActivity;
a=0;// 
a=0;//     .line 75
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;)Lcom/twocloo/com/cn/activitys/OfferWallActivity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/OfferWallActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 79
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x270f
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 81
a=0;//     .local v0, "consemepoints":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/OfferWallActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity;);
a=0;//     invoke-static {v1}, Lcn/dm/android/DMOfferWall;->getInstance(Landroid/content/Context;)Lcn/dm/android/DMOfferWall;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/activitys/OfferWallActivity$1$1;);
a=0;//     invoke-direct {v2, p0, v0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1$1;-><init>(Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;I)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity$1$1;);
a=0;//     invoke-virtual {v1, v0, v2}, Lcn/dm/android/DMOfferWall;->consumePoints(ILcn/dm/android/listener/CheckPointListener;)V
a=0;// 
a=0;//     .line 102
a=0;//     .end local v0    # "consemepoints":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
