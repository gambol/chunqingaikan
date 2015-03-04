package com.twocloo.com.cn.activitys; class ShareInfoActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/ShareInfoActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ShareInfoActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/ShareInfoActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     .line 68
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ShareInfoActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 2
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 72
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x2711
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShareInfoActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->access$0(Lcom/twocloo/com/cn/activitys/ShareInfoActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->access$0(Lcom/twocloo/com/cn/activitys/ShareInfoActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ShareInfoActivity;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->bookname:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->setShareContent(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 77
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
