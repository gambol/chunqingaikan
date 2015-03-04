package com.twocloo.com.cn.activitys; class FindPasswordActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/FindPasswordActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "FindPasswordActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private contentlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field dataCallback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private findpasstask:Lcom/twocloo/com/cn/task/FindPasswordTask;
a=0;// 
a=0;// .field private input:Landroid/widget/EditText;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private psdtv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private restPsdBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private tv:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/FindPasswordActivity;);
a=0;//     const-string v0, "FindPasswordActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/FindPasswordActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/FindPasswordActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/FindPasswordActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->dataCallback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/FindPasswordActivity;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->contentlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/FindPasswordActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->psdtv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/FindPasswordActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->restPsdBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private setTopBar()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 45
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 46
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->contentlayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->contentlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 47
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->username:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 48
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 50
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->tv:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->tv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 51
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->passwordtv:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->psdtv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 52
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->button:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->restPsdBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 53
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "title_tv":Landroid/widget/TextView;
a=0;//     const-string v1, "\u627e\u56de\u5bc6\u7801"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 55
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->restPsdBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 59
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
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 62
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v2}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 63
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->finish()V
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 64
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->restPsdBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->restPsdBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\u91cd\u7f6e\u5bc6\u7801"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "name":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 68
a=0;//     const-string v1, "\u8bf7\u8f93\u5165\u7528\u6237\u540d\uff0c\u4ee5\u4fbf\u91cd\u7f6e\u5bc6\u7801"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/task/FindPasswordTask;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/task/FindPasswordTask;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->dataCallback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     invoke-direct {v1, p0, v0, v2}, Lcom/twocloo/com/cn/task/FindPasswordTask;-><init>(Landroid/app/Activity;Ljava/lang/String;Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/task/FindPasswordTask;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->findpasstask:Lcom/twocloo/com/cn/task/FindPasswordTask;
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->findpasstask:Lcom/twocloo/com/cn/task/FindPasswordTask;
a=0;// 
a=0;//     new-array v2, v3, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/task/FindPasswordTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     .end local v0    # "name":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->restPsdBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\u8bb0\u4f4f\u4e86\uff0c\u53bb\u767b\u5f55"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 36
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 37
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->find_password_layout:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 38
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->setTopBar()V
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 119
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 120
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 110
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 111
a=0;//     const-string v0, "FindPasswordActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 112
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 99
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 100
a=0;//     const-string v0, "FindPasswordActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FindPasswordActivity;->restPsdBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setRedButtonbackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 105
a=0;//     return-void
a=0;// .end method
}}
