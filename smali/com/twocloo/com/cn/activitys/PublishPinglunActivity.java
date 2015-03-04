package com.twocloo.com.cn.activitys; class PublishPinglunActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "PublishPinglunActivity.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private articleId:Ljava/lang/String;
a=0;// 
a=0;// .field private btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private btn_like:Landroid/widget/RadioButton;
a=0;// 
a=0;// .field dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Ljava/lang/Boolean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field protected dialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private editText:Landroid/widget/EditText;
a=0;// 
a=0;// .field private publish:Landroid/widget/TextView;
a=0;// 
a=0;// .field private sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;// .field private title:Landroid/widget/TextView;
a=0;// 
a=0;// .field private topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 52
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;);
a=0;//     const-string v0, "PublishPinglunActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 139
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)Landroid/widget/EditText;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 59
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->activity_publish_pinglun:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->setTopbar()V
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/common/Util;->showSoftKeyBoard(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     const/16 v1, 0x30
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/EditText;->setGravity(I)V
a=0;// 
a=0;//     .line 63
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "articleId"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     .line 64
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->publish:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$2;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->btn_like:Landroid/widget/RadioButton;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$3;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$3;-><init>(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$3;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$4;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$4;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$4;-><init>(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$4;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 123
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 151
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTopbar()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 127
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "\u53d1\u8868\u8bc4\u8bba"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 129
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 130
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->publish_pinglun:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->publish:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 131
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->edit_pinglun:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 132
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_like:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RadioButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->btn_like:Landroid/widget/RadioButton;
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 134
a=0;//     return-void
a=0;// .end method
}}
