package com.twocloo.com.cn.activitys; class SignInActivity$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/SignInActivity$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SignInActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/SignInActivity;->loadData()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/SignInActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/SignInActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/SignInActivity;
a=0;// 
a=0;//     .line 100
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SignInActivity$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SignInActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/SignInActivity;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/SignInActivity;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SignInActivity;->access$0(Lcom/twocloo/com/cn/activitys/SignInActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Landroid/widget/RelativeLayout;->isShown()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SignInActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/SignInActivity;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/SignInActivity;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SignInActivity;->access$0(Lcom/twocloo/com/cn/activitys/SignInActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const/16 v11, 0x8
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-virtual {v10, v11}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     #v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 107
a=0;//     .local v8, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 108
a=0;//     .local v7, "url":Ljava/lang/String;
a=0;//     #v7=(Null);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SignInActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/SignInActivity;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/SignInActivity;);
a=0;//     invoke-direct {v2, v10}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 109
a=0;//     .local v2, "phone":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 110
a=0;//     .local v9, "v":I
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SignInActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/SignInActivity;
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/activitys/SignInActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     sget v11, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 111
a=0;//     .local v3, "pt":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SignInActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/SignInActivity;
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/activitys/SignInActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     sget v11, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 112
a=0;//     .local v4, "srcid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 114
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 116
a=0;//     .local v6, "uid":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 117
a=0;//     .local v5, "token":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SignInActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/SignInActivity;
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 118
a=0;//     .local v1, "nightOrDay":I
a=0;//     #v1=(Integer);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "http://app.2cloo.com/user-sign_in?userid=%s&token=%s&ct=%s&pt=%s&v=%s&srcid=%s"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const/4 v12, 0x6
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     new-array v12, v12, [Ljava/lang/Object;
a=0;// 
a=0;//     #v12=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     aput-object v6, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     aput-object v5, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x2
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     aput-object v0, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x3
a=0;// 
a=0;//     aput-object v3, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x4
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x5
a=0;// 
a=0;//     aput-object v4, v12, v13
a=0;// 
a=0;//     invoke-static {v11, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "&night="
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/activitys/SignInActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/SignInActivity;
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 122
a=0;//     .end local v1    # "nightOrDay":I
a=0;//     .end local v5    # "token":Ljava/lang/String;
a=0;//     .end local v6    # "uid":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Ljava/lang/String;);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/SignInActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/SignInActivity;
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/SignInActivity;->access$1(Lcom/twocloo/com/cn/activitys/SignInActivity;)Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-virtual {v10, v7, v11}, Lcom/twocloo/com/cn/beans/WebView;->loadUrl(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 123
a=0;//     return-void
a=0;// .end method
}}
