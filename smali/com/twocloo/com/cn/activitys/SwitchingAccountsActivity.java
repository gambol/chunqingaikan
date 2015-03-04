package com.twocloo.com.cn.activitys; class SwitchingAccountsActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SwitchingAccountsActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$BaseUiListener;,
a=0;//         Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$NewClickListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private api:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;// .field private btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private ercenglouLogin:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private findPasswordBtn:Landroid/widget/TextView;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private loginThread:Lcom/twocloo/com/cn/threads/LoginThread;
a=0;// 
a=0;// .field private mInfo:Lcom/tencent/connect/UserInfo;
a=0;// 
a=0;// .field private mUserInfo:Landroid/widget/TextView;
a=0;// 
a=0;// .field private openId:Ljava/lang/String;
a=0;// 
a=0;// .field private progress:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private qqLogin:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private registerBtn:Landroid/widget/TextView;
a=0;// 
a=0;// .field private tag:Ljava/lang/String;
a=0;// 
a=0;// .field private wechatLogin:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private zhuceButton:Landroid/widget/Button;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 63
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->progress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->tag:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->openId:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 286
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->updateUserInfo()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;Landroid/app/ProgressDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->progress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->openId:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private goToReg()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 188
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 189
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 140
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->wechat_login:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->wechatLogin:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 141
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->qq_login:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->qqLogin:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 142
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->ercenglou_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->ercenglouLogin:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 143
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->zhuce:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->zhuceButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->zhuceButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->wechatLogin:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->qqLogin:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->ercenglouLogin:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 149
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private onClickLogin()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     sget-object v1, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->isSessionValid()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$3;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$3;-><init>(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)V
a=0;// 
a=0;//     .line 217
a=0;//     .local v0, "listener":Lcom/tencent/tauth/IUiListener;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$3;);
a=0;//     sget-object v1, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     const-string v2, "all"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p0, v2, v0}, Lcom/tencent/connect/auth/QQAuth;->login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
a=0;// 
a=0;//     .line 222
a=0;//     .end local v0    # "listener":Lcom/tencent/tauth/IUiListener;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 219
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);
a=0;//     sget-object v1, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1, p0}, Lcom/tencent/connect/auth/QQAuth;->logout(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 220
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->updateUserInfo()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static ready(Landroid/content/Context;)Z
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 225
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 231
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/widget/Toast;);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 228
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQAuth;->isSessionValid()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     sget-object v2, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 229
a=0;//     .local v0, "ready":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 230
a=0;//     const-string v2, "login and get openId first, please!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v0    # "ready":Z
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Null);v2=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 228
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private updateUserInfo()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     sget-object v1, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     sget-object v1, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->isSessionValid()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 288
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;-><init>(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)V
a=0;// 
a=0;//     .line 371
a=0;//     .local v0, "listener":Lcom/tencent/tauth/IUiListener;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$4;);
a=0;//     new-instance v1, Lcom/tencent/connect/UserInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/connect/UserInfo;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, p0, v2}, Lcom/tencent/connect/UserInfo;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/UserInfo;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->mInfo:Lcom/tencent/connect/UserInfo;
a=0;// 
a=0;//     .line 372
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->mInfo:Lcom/tencent/connect/UserInfo;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/connect/UserInfo;->getUserInfo(Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 376
a=0;//     .end local v0    # "listener":Lcom/tencent/tauth/IUiListener;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private weChatLogin()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;-><init>()V
a=0;// 
a=0;//     .line 196
a=0;//     .local v0, "tpl":Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity$2;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->setOnLoginListener(Lcom/twocloo/com/cn/listener/OnLoginListener;)V
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {v0, p0}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->show(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 204
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     if-ne p1, v1, :cond_1
a=0;// 
a=0;//     .line 166
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->finish()V
a=0;// 
a=0;//     .line 181
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 167
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->wechatLogin:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     if-ne p1, v1, :cond_2
a=0;// 
a=0;//     .line 168
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->weChatLogin()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 169
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->qqLogin:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     if-ne p1, v1, :cond_3
a=0;// 
a=0;//     .line 170
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\u6b63\u5728\u8c03\u7528QQ\u5e94\u7528\u63a5\u53e3\uff0c\u8bf7\u7a0d\u5019.."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 172
a=0;//     const-string v1, "1102844717"
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/connect/auth/QQAuth;->createInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sput-object v1, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     .line 173
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->onClickLogin()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 174
a=0;//     :cond_3
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->ercenglouLogin:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     if-ne p1, v1, :cond_4
a=0;// 
a=0;//     .line 175
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 176
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 177
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 178
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->zhuceButton:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v1, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->goToReg()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 130
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->swtich_account_activity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 131
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 132
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "Tag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->tag:Ljava/lang/String;
a=0;// 
a=0;//     .line 134
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->initView()V
a=0;// 
a=0;//     .line 136
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 154
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 160
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 161
a=0;//     return-void
a=0;// .end method
}}
