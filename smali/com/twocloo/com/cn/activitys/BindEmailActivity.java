package com.twocloo.com.cn.activitys; class BindEmailActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/BindEmailActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "BindEmailActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private complete:Landroid/widget/Button;
a=0;// 
a=0;// .field private editText:Landroid/widget/EditText;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private line1:Landroid/view/View;
a=0;// 
a=0;// .field private mainlLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BindEmailActivity;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/BindEmailActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/BindEmailActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/BindEmailActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BindEmailActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/BindEmailActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 63
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->main_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->mainlLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 64
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     .line 65
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->email:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 66
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 67
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->complete:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->complete:Landroid/widget/Button;
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->complete:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setDayOrNightMode()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->mainlLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 147
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 6
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     #v5=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageView;);
a=0;//     if-ne p1, v3, :cond_1
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->finish()V
a=0;// 
a=0;//     .line 120
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 76
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Reference,Landroid/widget/ImageView;);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->complete:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v3, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v3, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;
a=0;// 
a=0;//     invoke-direct {v0, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 78
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 79
a=0;//     .local v1, "text":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 80
a=0;//     const-string v3, "^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\\.[a-zA-Z0-9_-]{2,3}){1,2})$"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 81
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 82
a=0;//     .local v2, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v3, Ljava/lang/Thread;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/activitys/BindEmailActivity$2;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/activitys/BindEmailActivity$2;);
a=0;//     invoke-direct {v4, p0, v1, v2, v0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/BindEmailActivity;Ljava/lang/String;Lcom/twocloo/com/cn/beans/User;Landroid/content/Intent;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/BindEmailActivity$2;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 109
a=0;//     #v3=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     .end local v2    # "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v3=(Boolean);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const-string v4, "\u60a8\u8f93\u5165\u7684\u90ae\u7bb1\u4e0d\u5408\u6cd5"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 116
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const-string v4, "\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 55
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->bind_email_activity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 56
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 57
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 58
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->initView()V
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 133
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 135
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 140
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 141
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 125
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->setTopLayout()V
a=0;// 
a=0;//     .line 126
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->setDayOrNightMode()V
a=0;// 
a=0;//     .line 128
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTopLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 151
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BindEmailActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
}}
