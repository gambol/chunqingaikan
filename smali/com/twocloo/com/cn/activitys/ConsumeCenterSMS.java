package com.twocloo.com.cn.activitys; class ConsumeCenterSMS { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;
a=0;// .super Landroid/widget/RelativeLayout;
a=0;// .source "ConsumeCenterSMS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private nativeLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private sms10:Landroid/widget/Button;
a=0;// 
a=0;// .field private sms20:Landroid/widget/Button;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// .field private user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;// .field private view:Landroid/view/View;
a=0;// 
a=0;// .field private webview:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;);
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;);
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;);
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 34
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private init(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 47
a=0;//     #v2=(Byte);
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->consume_sms:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->view:Landroid/view/View;
a=0;// 
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->view:Landroid/view/View;
a=0;// 
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->view:Landroid/view/View;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->webview:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->webview:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->view:Landroid/view/View;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->native_layout:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->nativeLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/http/HttpComm;->isNetworkAvalible(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->nativeLayout()V
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private nativeLayout()V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v12, 0x15
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     const/16 v11, 0x12
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/16 v9, 0x10
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/16 v8, 0xa
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 86
a=0;//     #v10=(Null);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->view:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     sget v7, Lcom/twocloo/com/cn/R$id;->consume_sms_10:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     check-cast v6, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->sms10:Landroid/widget/Button;
a=0;// 
a=0;//     .line 87
a=0;//     const-string v2, "\u53d1\u9001\u77ed\u4fe1\u5145\u503c10\u5143\n\uff08\u83b7\u5f97450\u4e2a\u9605\u8bfb\u5e01\uff09"
a=0;// 
a=0;//     .line 88
a=0;//     .local v2, "source":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Landroid/text/SpannableString;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/text/SpannableString;);
a=0;//     invoke-direct {v4, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 89
a=0;//     .local v4, "ss1":Landroid/text/SpannableString;
a=0;//     #v4=(Reference,Landroid/text/SpannableString;);
a=0;//     new-instance v6, Landroid/text/style/AbsoluteSizeSpan;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/text/style/AbsoluteSizeSpan;);
a=0;//     invoke-direct {v6, v9}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/text/style/AbsoluteSizeSpan;);
a=0;//     invoke-virtual {v4, v6, v8, v12, v11}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->sms10:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->sms10:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v6, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->view:Landroid/view/View;
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$id;->consume_sms_20:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     check-cast v6, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->sms20:Landroid/widget/Button;
a=0;// 
a=0;//     .line 94
a=0;//     const-string v3, "\u53d1\u9001\u77ed\u4fe1\u5145\u503c20\u5143\n\uff08\u83b7\u5f97900\u4e2a\u9605\u8bfb\u5e01\uff09"
a=0;// 
a=0;//     .line 95
a=0;//     .local v3, "source2":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Landroid/text/SpannableString;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/text/SpannableString;);
a=0;//     invoke-direct {v5, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 96
a=0;//     .local v5, "ss2":Landroid/text/SpannableString;
a=0;//     #v5=(Reference,Landroid/text/SpannableString;);
a=0;//     new-instance v6, Landroid/text/style/AbsoluteSizeSpan;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/text/style/AbsoluteSizeSpan;);
a=0;//     invoke-direct {v6, v9}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/text/style/AbsoluteSizeSpan;);
a=0;//     invoke-virtual {v5, v6, v8, v12, v11}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->sms20:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->sms20:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v6, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 100
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 108
a=0;//     :goto_0
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->view:Landroid/view/View;
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$id;->about_me_qq:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 109
a=0;//     .local v0, "aboutMeQQ":Landroid/widget/TextView;
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->view:Landroid/view/View;
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$id;->about_me_tel:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 110
a=0;//     .local v1, "aboutMeTel":Landroid/widget/TextView;
a=0;//     new-instance v6, Lcom/twocloo/com/cn/task/ContactInfoTask;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/task/ContactInfoTask;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v6, v7, v1, v0}, Lcom/twocloo/com/cn/task/ContactInfoTask;-><init>(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/TextView;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/task/ContactInfoTask;);
a=0;//     new-array v7, v10, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/task/ContactInfoTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// 
a=0;//     .line 104
a=0;//     .end local v0    # "aboutMeQQ":Landroid/widget/TextView;
a=0;//     .end local v1    # "aboutMeTel":Landroid/widget/TextView;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v7=(Integer);v8=(PosByte);v9=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "\u60a8\u5c1a\u672a\u767b\u5f55\uff0c\u8bf7\u5148\u767b\u5f55\uff01"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v7, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     new-instance v7, Landroid/content/Intent;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     const-class v9, Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v7, v8, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public loadUrl(Landroid/app/Activity;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->nativeLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     invoke-direct {v3, p1}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 62
a=0;//     .local v3, "phone":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 63
a=0;//     .local v4, "v":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 64
a=0;//     .local v0, "apptype":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 65
a=0;//     .local v1, "channel":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "android"
a=0;// 
a=0;//     .line 67
a=0;//     .local v2, "ct":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->webview:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->webview:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     invoke-static {p1, v6}, Lcom/twocloo/com/cn/common/JavaScript;->newInstance(Landroid/app/Activity;Landroid/webkit/WebView;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "twocloo"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6, v7}, Lcom/twocloo/com/cn/beans/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 68
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "&uid="
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "&token="
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "&v="
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "&ct="
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "&pt="
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "&srcid="
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 71
a=0;//     :cond_1
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->webview:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-virtual {v5, p2}, Lcom/twocloo/com/cn/beans/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->consume_sms_10:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 116
a=0;//     const-string v2, "smsto:1065800883147"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 117
a=0;//     .local v1, "uri":Landroid/net/Uri;
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.SENDTO"
a=0;// 
a=0;//     invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 118
a=0;//     .local v0, "i":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "sms_body"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "100#"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->uid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 121
a=0;//     .end local v0    # "i":Landroid/content/Intent;
a=0;//     .end local v1    # "uri":Landroid/net/Uri;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->consume_sms_20:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 122
a=0;//     const-string v2, "smsto:1065800883147"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 123
a=0;//     .restart local v1    # "uri":Landroid/net/Uri;
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.SENDTO"
a=0;// 
a=0;//     invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 124
a=0;//     .restart local v0    # "i":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "sms_body"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "200#"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->uid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 125
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ConsumeCenterSMS;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 128
a=0;//     .end local v0    # "i":Landroid/content/Intent;
a=0;//     .end local v1    # "uri":Landroid/net/Uri;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
