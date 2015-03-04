package com.twocloo.com.cn.activitys; class PrivacyActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/PrivacyActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "PrivacyActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/PrivacyActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/PrivacyActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/PrivacyActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/PrivacyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/PrivacyActivity;
a=0;// 
a=0;//     .line 32
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/PrivacyActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PrivacyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/PrivacyActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/PrivacyActivity;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/PrivacyActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 37
a=0;//     .local v0, "privacystr":Ljava/lang/String;
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 38
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PrivacyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/PrivacyActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/PrivacyActivity;);
a=0;//     const-string v2, "\u83b7\u53d6\u4fe1\u606f\u5931\u8d25"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v1, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 42
a=0;//     .end local v0    # "privacystr":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 40
a=0;//     .restart local v0    # "privacystr":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);v2=(PosShort);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PrivacyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/PrivacyActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/PrivacyActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/PrivacyActivity;->access$0(Lcom/twocloo/com/cn/activitys/PrivacyActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
