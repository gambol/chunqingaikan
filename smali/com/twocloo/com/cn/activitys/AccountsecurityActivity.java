package com.twocloo.com.cn.activitys; class AccountsecurityActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "AccountsecurityActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private emaiLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private email:Landroid/widget/TextView;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "HandlerLeak"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private line1:Landroid/view/View;
a=0;// 
a=0;// .field private line2:Landroid/view/View;
a=0;// 
a=0;// .field private line3:Landroid/view/View;
a=0;// 
a=0;// .field private line4:Landroid/view/View;
a=0;// 
a=0;// .field private line5:Landroid/view/View;
a=0;// 
a=0;// .field private mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private phone:Landroid/widget/TextView;
a=0;// 
a=0;// .field private phoneLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private qiehuanButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private updatePasswordLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;// .field private userInfoThread:Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;// .field private user_id:Landroid/widget/TextView;
a=0;// 
a=0;// .field private userbean:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;// .field private username:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 37
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->userInfoThread:Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;//     .line 48
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->userbean:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;)Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->userInfoThread:Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/UserInfoNewThread;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;Lcom/twocloo/com/cn/beans/UserCenterNewbean;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->userbean:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->userbean:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/UserCenterNewbean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->email:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private setDayOrNightMode()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->line3:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->line4:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->line5:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTabButtonBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->updatePasswordLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setUserItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->phoneLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setUserItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->emaiLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setUserItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 172
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public initView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 102
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->main_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 103
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     .line 104
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     .line 105
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->line3:Landroid/view/View;
a=0;// 
a=0;//     .line 106
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line4:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->line4:Landroid/view/View;
a=0;// 
a=0;//     .line 107
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line5:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->line5:Landroid/view/View;
a=0;// 
a=0;//     .line 108
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->username:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->username:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 109
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->user_id:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->user_id:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 110
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->iphone_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->phoneLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 111
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->email_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->emaiLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 112
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->update_password_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->updatePasswordLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 113
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->switchingaccount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->qiehuanButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 114
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->phoneLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 116
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->text_email:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->email:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 117
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->text_phone:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->phone:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->emaiLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->updatePasswordLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->qiehuanButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->phoneLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     if-ne p1, v1, :cond_1
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/BindPhoneActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 128
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->emaiLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     if-ne p1, v1, :cond_2
a=0;// 
a=0;//     .line 129
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/BindEmailActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 130
a=0;//     :cond_2
a=0;//     #v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->updatePasswordLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     if-ne p1, v1, :cond_3
a=0;// 
a=0;//     .line 131
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 132
a=0;//     :cond_3
a=0;//     #v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v1, :cond_4
a=0;// 
a=0;//     .line 136
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 137
a=0;//     :cond_4
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->qiehuanButton:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v1, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 140
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 141
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 6
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 70
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 71
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->account_security_activity:I
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 72
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->initView()V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "phone"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 75
a=0;//     .local v1, "txt_phone":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->phone:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "email"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 79
a=0;//     .local v0, "txt_email":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->email:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->username:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUsername()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->user_id:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v2, Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/threads/UserInfoNewThread;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v2, p0, v3, v4, v5}, Lcom/twocloo/com/cn/threads/UserInfoNewThread;-><init>(Landroid/app/Activity;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/threads/UserInfoNewThread;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->userInfoThread:Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->userInfoThread:Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/threads/UserInfoNewThread;->start()V
a=0;// 
a=0;//     .line 92
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/LocalStore;->getLoginType(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->updatePasswordLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 98
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 95
a=0;//     :cond_3
a=0;//     #v2=(Integer);v3=(Reference,Ujava/lang/Object;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->updatePasswordLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 150
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 157
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->setTopLayout()V
a=0;// 
a=0;//     .line 179
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->setDayOrNightMode()V
a=0;// 
a=0;//     .line 180
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTopLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 184
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 185
a=0;//     return-void
a=0;// .end method
}}
