package com.twocloo.com.cn.activitys; class BaseReadBook$9 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/BaseReadBook$9;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseReadBook.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/BaseReadBook;->initEvent()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/BaseReadBook;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     .line 400
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook$9;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 8
a=0;//     .param p1, "arg0"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 404
a=0;//     #v7=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v2, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 405
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2, v7}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 433
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 408
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 409
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     const-string v2, "\u8bf7\u5148\u767b\u5f55~"
a=0;// 
a=0;//     invoke-static {v1, v2, v7}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 410
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->access$2(Lcom/twocloo/com/cn/activitys/BaseReadBook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 413
a=0;//     :cond_1
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 414
a=0;//     .local v5, "status":Ljava/lang/String;
a=0;//     #v5=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/activitys/BaseReadBook;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->access$3(Lcom/twocloo/com/cn/activitys/BaseReadBook;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 415
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 416
a=0;//     .local v3, "token":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->access$4(Lcom/twocloo/com/cn/activitys/BaseReadBook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/BaseReadBook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v2, v4}, Lcom/twocloo/com/cn/common/LocalStore;->getAuto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 417
a=0;//     .local v6, "auto":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 418
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->autoOrderImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->auto_order_open:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 419
a=0;//     const-string v5, "1"
a=0;// 
a=0;//     .line 430
a=0;//     :goto_1
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->access$4(Lcom/twocloo/com/cn/activitys/BaseReadBook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/BaseReadBook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 431
a=0;//     .local v0, "synchroAutoTask":Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;);
a=0;//     new-array v1, v7, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 421
a=0;//     .end local v0    # "synchroAutoTask":Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Boolean);v5=(Null);
a=0;//     const-string v1, "1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 422
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->autoOrderImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->auto_order_closed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 423
a=0;//     const-string v5, "0"
a=0;// 
a=0;//     .line 424
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 425
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v2=(Reference,Ljava/lang/String;);v5=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$9;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->autoOrderImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->auto_order_open:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 426
a=0;//     const-string v5, "1"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
}}
