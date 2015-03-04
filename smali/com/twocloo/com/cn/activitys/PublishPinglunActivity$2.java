package com.twocloo.com.cn.activitys; class PublishPinglunActivity$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PublishPinglunActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     .line 65
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 11
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     #v10=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     const-string v2, "\u8bf7\u5148\u767b\u5f55"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v10}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->access$1(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 87
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->access$2(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 76
a=0;//     .local v5, "contents":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;);
a=0;//     const-string v2, "\u8fd8\u6ca1\u6709\u8f93\u5165\u5185\u5bb9"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v10}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 80
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 81
a=0;//     .local v3, "uid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUsername()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 82
a=0;//     .local v4, "username":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 84
a=0;//     .local v6, "token":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/CommentTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/CommentTask;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->access$0(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;);
a=0;//     iget-object v9, v8, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/singlebook/DataCallBack;);
a=0;//     move-object v8, v7
a=0;// 
a=0;//     .line 84
a=0;//     #v8=(Null);
a=0;//     invoke-direct/range {v0 .. v9}, Lcom/twocloo/com/cn/task/CommentTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "commentTask":Lcom/twocloo/com/cn/task/CommentTask;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/CommentTask;);
a=0;//     new-array v1, v10, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/CommentTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
